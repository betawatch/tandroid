package lh;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.p70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class eb extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public long B;
    public long C;
    public final nh.t0 D;
    public final nh.o0 E;
    public final kp F;
    public final eg.i G;
    public final MessageObject H;
    public final ArrayList I;
    public final c J;
    public nh.g2 K;
    public int L;
    public m5 M;
    public final lq[] N;
    public boolean O;
    public boolean P;
    public zn Q;
    public View R;
    public ValueAnimator S;
    public final org.telegram.ui.ActionBar.f6 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final LinearLayout f;
    public final FrameLayout h;
    public final LinearLayout n;
    public final qa r;
    public final FrameLayout s;
    public final FrameLayout v;
    public final org.telegram.ui.Components.p9 w;
    public final ph.d x;
    public final db y;

    public eb(Context context, final int i10, final long j10, zn znVar, MessageObject messageObject, ArrayList arrayList, boolean z4, final boolean z10, long j11, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false);
        TLRPC.MessageReactor messageReactor;
        TLRPC.MessageReactor messageReactor2;
        TLRPC.MessageReactor messageReactor3;
        boolean z11;
        TLRPC.Chat chat;
        boolean z12;
        String formatString;
        Context context2;
        long j12;
        float f10;
        int i11;
        this.N = new lq[1];
        this.P = false;
        this.b = f6Var;
        this.c = i10;
        this.H = messageObject;
        this.I = arrayList;
        this.d = z10;
        this.e = z4;
        c cVar = new c(context, i10, f6Var);
        this.J = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        this.container.addView(cVar, k7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        k7.d6.a(cVar);
        cVar.setOnClickListener(new kh.m(context, 1, f6Var));
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        if (arrayList != null) {
            int size = arrayList.size();
            TLRPC.MessageReactor messageReactor4 = null;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TLRPC.MessageReactor messageReactor5 = (TLRPC.MessageReactor) obj;
                long peerDialogId = DialogObject.getPeerDialogId(messageReactor5.peer_id);
                if (messageReactor5.anonymous && messageReactor5.my) {
                    peerDialogId = clientUserId;
                }
                if (messageReactor5.my || peerDialogId == clientUserId) {
                    messageReactor4 = messageReactor5;
                }
            }
            messageReactor = messageReactor4;
        } else {
            messageReactor = null;
        }
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z10) {
            if (arrayList != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    if (((TLRPC.MessageReactor) arrayList.get(i13)).my) {
                        break;
                    }
                    i13++;
                }
            }
            messageReactor2 = messageReactor;
            this.B = j11;
        } else {
            messageReactor2 = messageReactor;
            this.B = t7.y(i10, false).B(messageObject);
        }
        long j13 = this.B;
        this.C = j13 != UserObject.ANONYMOUS ? j13 : clientUserId;
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, k7.b6.n(-1, -2));
        this.r = new qa(this, context, f6Var, z10, i10);
        int i14 = 9;
        int[] iArr = {1, 50, 100, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2000, 5000, 7500, 10000};
        long j14 = MessagesController.getInstance(i10).starsPaidReactionAmountMax;
        ArrayList arrayList2 = new ArrayList();
        int i15 = 0;
        while (true) {
            if (i15 >= i14) {
                break;
            }
            int i16 = iArr[i15];
            if (i16 > j14) {
                arrayList2.add(Integer.valueOf((int) j14));
                break;
            }
            arrayList2.add(Integer.valueOf(i16));
            if (iArr[i15] == j14) {
                break;
            }
            i15++;
            i14 = 9;
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
            iArr2[i17] = ((Integer) arrayList2.get(i17)).intValue();
        }
        qa qaVar = this.r;
        qaVar.b0 = iArr2;
        if (z4 || z10) {
            if (!z4) {
                qaVar.setAlpha(0.5f);
            }
            this.h.addView(this.r, k7.b6.d(-1, -2.0f, 55, 0.0f, z10 ? -50.0f : 0.0f, 0.0f, (!z10 || z13) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z10) {
            this.h.addView(linearLayout2, k7.b6.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, f6Var)));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.w = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        p9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        r();
        frameLayout3.addView(p9Var, k7.b6.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.r5, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, k7.b6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, k7.b6.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, k7.b6.p(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        k7.d6.a(frameLayout2);
        b0.g(i10).o();
        gg.q qVar = new gg.q(context, 1);
        int i18 = org.telegram.ui.ActionBar.j6.G6;
        qVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var));
        qVar.setTextSize(1, 20.0f);
        qVar.setGravity(17);
        qVar.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(qVar, k7.b6.p(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        q(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, f6Var), mode));
        k7.d6.a(imageView2);
        final int i19 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: lh.ma
            public final /* synthetic */ eb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        eb ebVar = this.b;
                        kp kpVar = ebVar.F;
                        kpVar.a(!kpVar.a.q, true);
                        ebVar.B = kpVar.a.q ? ebVar.C : UserObject.ANONYMOUS;
                        ebVar.r();
                        db dbVar = ebVar.y;
                        if (dbVar != null) {
                            dbVar.setMyPrivacy(ebVar.B);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(imageView2, k7.b6.p(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.h.addView(linearLayout3, k7.b6.d(-1, -2.0f, 55, 0.0f, z10 ? 0.0f : z4 ? 179.0f : 45.0f, 0.0f, 15.0f));
        boolean z14 = z13;
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        TextView textView = new TextView(context);
        org.telegram.ui.b.l(i18, f6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor2 != null) {
            messageReactor3 = messageReactor2;
            z11 = z14;
            formatString = LocaleController.formatPluralStringComma("StarsReactionTextSent", messageReactor3.count);
            chat = chat2;
            z12 = false;
        } else {
            messageReactor3 = messageReactor2;
            z11 = z14;
            int i20 = R.string.StarsReactionText;
            String str = chat2 == null ? "" : chat2.title;
            chat = chat2;
            z12 = false;
            formatString = LocaleController.formatString(i20, str);
        }
        textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(formatString), textView.getPaint().getFontMetricsInt(), z12));
        if (z4 && !z10) {
            linearLayout3.addView(textView, k7.b6.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z11) {
            if (!z10) {
                linearLayout3.addView(new ra(context, f6Var), k7.b6.t(-1, 30, 55, 0, 20, 0, 0));
            }
            db dbVar = new db(this, context, z10);
            this.y = dbVar;
            dbVar.setOnSenderClickListener(new Utilities.Callback() { // from class: lh.na
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj2) {
                    Long l10 = (Long) obj2;
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    long longValue = l10.longValue();
                    eb ebVar = eb.this;
                    boolean z15 = z10;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l10.longValue());
                        if (l10.longValue() == UserConfig.getInstance(i10).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        U.presentFragment(new sa(ebVar, bundle, z15));
                        ebVar.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l10.longValue());
                        U.presentFragment(new ta(ebVar, bundle2, z15));
                    }
                    ebVar.dismiss();
                }
            });
            this.f.addView(dbVar, k7.b6.k(0.0f, z10 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, f6Var));
            if (!z10 && (z4 || messageReactor3 != null)) {
                this.f.addView(view, k7.b6.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.y = null;
        }
        if (z10) {
            int i21 = org.telegram.ui.ActionBar.j6.j5;
            TextView b10 = k7.f6.b(context, 20.0f, i21, true, f6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(z4 ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.f.addView(b10, k7.b6.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = k7.f6.b(context, 14.0f, i21, false, f6Var);
            b11.setGravity(17);
            org.telegram.ui.b.o(z4 ? R.string.LiveStoryReactText : z11 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText, new Object[]{DialogObject.getName(j10)}, b11);
            this.f.addView(b11, k7.b6.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z10) {
            nh.t0 t0Var = new nh.t0();
            this.D = t0Var;
            t0Var.c = this.B;
            t0Var.g = 50L;
            t0Var.e = true;
            nh.o0 o0Var = new nh.o0(i10, context, true);
            this.E = o0Var;
            o0Var.set(t0Var);
            this.f.addView(o0Var, k7.b6.t(-2, -2, 17, 32, 0, 32, 20));
        }
        kp kpVar = new kp(context, 21, f6Var);
        this.F = kpVar;
        kpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
        kpVar.setDrawUnchecked(true);
        kpVar.a(this.B != UserObject.ANONYMOUS, false);
        db dbVar2 = this.y;
        if (dbVar2 != null) {
            dbVar2.setMyPrivacy(this.B);
        }
        kpVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        org.telegram.ui.b.l(i18, f6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(kpVar, k7.b6.t(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, k7.b6.q(-2, -2, 16));
        final int i22 = 1;
        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: lh.ma
            public final /* synthetic */ eb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i22) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        eb ebVar = this.b;
                        kp kpVar2 = ebVar.F;
                        kpVar2.a(!kpVar2.a.q, true);
                        ebVar.B = kpVar2.a.q ? ebVar.C : UserObject.ANONYMOUS;
                        ebVar.r();
                        db dbVar3 = ebVar.y;
                        if (dbVar3 != null) {
                            dbVar3.setMyPrivacy(ebVar.B);
                            break;
                        }
                        break;
                }
            }
        });
        k7.d6.b(linearLayout4, 0.05f, 1.2f);
        linearLayout4.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 6, 6));
        if (!z10 && (z4 || messageReactor3 != null)) {
            this.f.addView(linearLayout4, k7.b6.t(-2, -2, 1, 0, z11 ? 10 : 4, 0, 10));
        }
        ph.d dVar = new ph.d(context, f6Var, true);
        this.x = dVar;
        dVar.e();
        if (z4 || z10) {
            if (!z4) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f.addView(dVar, k7.b6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        s(0L);
        dVar.g(ja.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.N), true, true);
        if (z4) {
            j12 = 0;
            f10 = 1.0f;
            i11 = 3;
            context2 = context;
            dVar.setOnClickListener(new r8(this, messageObject, znVar, i10, z10, context, f6Var, j10, chat));
        } else {
            context2 = context;
            j12 = 0;
            f10 = 1.0f;
            i11 = 3;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: lh.oa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                eb.m(eb.this, i10, f6Var, j10, z10);
            }
        });
        f90 f90Var = new f90(context2, f6Var);
        f90Var.setTextSize(1, 13.0f);
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
        if (!z10 || z4) {
            f90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new e2.f(context2, 10)));
        } else {
            f90Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        }
        f90Var.setGravity(17);
        f90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.k5));
        if (z4 || z10) {
            this.f.addView(f90Var, k7.b6.t(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f);
        eg.i iVar = new eg.i(context2, 1, 2, i11);
        this.G = iVar;
        fg.a aVar = iVar.b;
        aVar.w = org.telegram.ui.ActionBar.j6.fk;
        aVar.x = org.telegram.ui.ActionBar.j6.gk;
        aVar.b();
        iVar.b.h = f10;
        iVar.setVisibility(4);
        iVar.setPaused(true);
        this.container.addView(iVar, k7.b6.c(150.0f, ImageReceiver.DEFAULT_CROSSFADE_DURATION));
        this.r.setValue(50);
        if (arrayList != null) {
            long j15 = j12;
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                long j16 = ((TLRPC.MessageReactor) arrayList.get(i23)).count;
                if (j16 > j15) {
                    j15 = j16;
                }
            }
            j15 = messageReactor3 != null ? j15 - messageReactor3.count : j15;
            if (j15 > j12) {
                this.r.setStarsTop(j15 + 1);
            }
        }
    }

    public static void m(eb ebVar, int i10, org.telegram.ui.ActionBar.f6 f6Var, long j10, boolean z4) {
        long j11;
        eb ebVar2 = ebVar;
        b0 g10 = b0.g(i10);
        g10.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g10.l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
        p70 F = p70.F(ebVar2.containerView, f6Var, ebVar2.v);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject instanceof TLRPC.User) {
                j11 = ((TLRPC.User) tLObject).id;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        j11 = -chat.id;
                    } else {
                        i11 = i12;
                    }
                }
                ebVar2 = ebVar;
                i11 = i12;
            }
            if (j11 == j10) {
                i11 = i12;
            } else {
                long j12 = ebVar2.B;
                F.g(tLObject, j11 == j12 || (j12 == 0 && j11 == UserConfig.getInstance(i10).getClientUserId()), new pa(ebVar2, j11, z4, 0));
                ebVar2 = ebVar;
                i11 = i12;
            }
        }
        F.t = false;
        F.Y = true;
        F.s = 0;
        F.V(5);
        F.Z();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void appendOpenAnimator(boolean z4, ArrayList arrayList) {
        Property property = View.ALPHA;
        float[] fArr = {z4 ? 1.0f : 0.0f};
        c cVar = this.J;
        arrayList.add(ObjectAnimator.ofFloat(cVar, (Property<c, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(cVar, (Property<c, Float>) View.SCALE_X, z4 ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(cVar, (Property<c, Float>) View.SCALE_Y, z4 ? 1.0f : 0.6f));
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        if (this.r.h0) {
            return false;
        }
        return super.canDismissWithSwipe();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.adminedChannelsLoaded) {
            q(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        Long myPaidReactionPeer;
        if (!this.O && !this.P) {
            this.P = true;
            MessageObject messageObject = this.H;
            if (messageObject != null && ((myPaidReactionPeer = messageObject.getMyPaidReactionPeer()) == null || myPaidReactionPeer.longValue() != this.B)) {
                messageObject.setMyPaidReactionDialogId(this.B);
                n7 b10 = n7.b(messageObject);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i10 = this.c;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j10 = b10.a;
                int i11 = b10.b;
                tL_messages_togglePaidReactionPrivacy.peer = messagesController.getInputPeer(j10);
                tL_messages_togglePaidReactionPrivacy.msg_id = i11;
                long j11 = this.B;
                if (j11 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j11 == UserObject.ANONYMOUS) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = MessagesController.getInstance(i10).getInputPeer(this.B);
                }
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(b10.a), Integer.valueOf(i11), Long.valueOf(this.B));
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new ff.a(this, 10));
            }
        }
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.dismissInternal();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean isTouchOutside(float f10, float f11) {
        c cVar = this.J;
        if (f10 < cVar.getX() || f10 > cVar.getX() + cVar.getWidth() || f11 < cVar.getY() || f11 > cVar.getY() + cVar.getHeight()) {
            return super.isTouchOutside(f10, f11);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(final q7 q7Var) {
        View view;
        mg.r0 r0Var;
        nh.g2 g2Var;
        View view2;
        mg.r0 r0Var2;
        mg.o0 o0Var;
        mg.o0 o0Var2 = null;
        MessageObject messageObject = null;
        if (this.H != null && (view2 = this.Q.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.R;
            if (view3 instanceof org.telegram.ui.Cells.s1) {
                r0Var2 = ((org.telegram.ui.Cells.s1) view3).K;
                r0Var2.getClass();
                o0Var = r0Var2.l("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.v0) {
                r0Var2 = ((org.telegram.ui.Cells.v0) view3).z0;
                r0Var2.getClass();
                o0Var = r0Var2.l("stars");
            } else {
                r0Var2 = null;
                o0Var = null;
            }
            if (o0Var == null && r0Var2 != null) {
                MessageObject.GroupedMessages X8 = this.Q.X8(this.H);
                if (X8 != null && !X8.posArray.isEmpty()) {
                    ArrayList<MessageObject> arrayList = X8.messages;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        MessageObject messageObject2 = arrayList.get(i10);
                        i10++;
                        MessageObject messageObject3 = messageObject2;
                        MessageObject.GroupedMessagePosition position = X8.getPosition(messageObject3);
                        if (position != null) {
                            int i11 = position.flags;
                            if ((i11 & 1) != 0 && (i11 & 8) != 0) {
                                messageObject = messageObject3;
                                break;
                            }
                        }
                    }
                    if (messageObject != null) {
                        view3 = this.Q.q8(messageObject.getId(), false);
                    }
                }
                if (view3 == null) {
                    return;
                }
                if (view3 instanceof org.telegram.ui.Cells.s1) {
                    mg.r0 r0Var3 = ((org.telegram.ui.Cells.s1) view3).K;
                    r0Var3.getClass();
                    r0Var2 = r0Var3;
                    o0Var2 = r0Var3.l("stars");
                    if (o0Var2 != null) {
                        return;
                    }
                    r0Var = r0Var2;
                    view = view3;
                }
            }
            o0Var2 = o0Var;
            if (o0Var2 != null) {
            }
        } else {
            if (this.K == null) {
                return;
            }
            view = null;
            r0Var = null;
        }
        View view4 = view;
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        this.r.getLocationInWindow(iArr);
        rectF.set(this.r.D.getBounds());
        rectF.inset(-AndroidUtilities.dp(3.5f), -AndroidUtilities.dp(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        eg.i iVar = this.G;
        ka kaVar = new ka(this, 2);
        if (iVar.M) {
            kaVar.run();
        } else {
            iVar.N = kaVar;
        }
        if (o0Var2 != null) {
            o0Var2.l = false;
        }
        if (view4 != null) {
            view4.invalidate();
        }
        nh.o0[] o0VarArr = new nh.o0[1];
        if (this.d && (g2Var = this.K) != null) {
            o0VarArr[0] = g2Var.d(this.L);
        }
        mg.o0 o0Var3 = o0Var2;
        final RectF rectF2 = new RectF();
        final gg.g0 g0Var = new gg.g0(this, o0VarArr, iArr, rectF2, view4, r0Var, o0Var3, 5);
        g0Var.run();
        this.G.setPaused(false);
        this.G.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        this.G.setTranslationX(rectF3.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
        this.G.setTranslationY(rectF3.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
        this.G.setScaleX(rectF3.width() / AndroidUtilities.dp(150.0f));
        this.G.setScaleY(rectF3.height() / AndroidUtilities.dp(150.0f));
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lh.la
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                g0Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                AndroidUtilities.lerp(rectF4, rectF5, floatValue, rectF6);
                eb ebVar = eb.this;
                eg.i iVar2 = ebVar.G;
                iVar2.setTranslationX(rectF6.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
                iVar2.setTranslationY(rectF6.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
                float lerp = AndroidUtilities.lerp(Math.max(rectF6.width() / AndroidUtilities.dp(150.0f), rectF6.height() / AndroidUtilities.dp(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                iVar2.setScaleX(lerp);
                iVar2.setScaleY(lerp);
                fg.a aVar = iVar2.b;
                aVar.d = 360.0f * floatValue;
                aVar.h = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (zArr2[0] || floatValue <= 0.95f) {
                    return;
                }
                zArr2[0] = true;
                LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                try {
                    ebVar.container.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                Runnable runnable = q7Var;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.S.addListener(new ua(this, o0Var3, view4, o0VarArr, zArr, rectF2, q7Var));
        this.S.setDuration(800L);
        this.S.setInterpolator(new f2.a0(3));
        this.S.start();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.c).addObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    public final boolean p() {
        if (!this.d) {
            b0 g10 = b0.g(this.c);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if ((obj instanceof TLRPC.Chat) && ChatObject.isChannelAndNotMegaGroup((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q(boolean z4) {
        FrameLayout frameLayout = this.s;
        if ((frameLayout.getVisibility() == 0) != p()) {
            frameLayout.setVisibility(p() ? 0 : 8);
            if (z4) {
                if (p()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.n, changeBounds);
            }
        }
    }

    public final void r() {
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.p = 0.42f;
        long j10 = this.B;
        org.telegram.ui.Components.p9 p9Var = this.w;
        if (j10 == UserObject.ANONYMOUS) {
            z8Var.g(21);
            int i10 = org.telegram.ui.ActionBar.j6.c8;
            org.telegram.ui.ActionBar.f6 f6Var = this.b;
            z8Var.i(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            p9Var.e(null, z8Var);
            return;
        }
        int i11 = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.B));
            z8Var.r(user);
            p9Var.e(user, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-this.B));
            z8Var.q(chat);
            p9Var.e(chat, z8Var);
        }
    }

    public final void s(long j10) {
        db dbVar;
        long j11;
        long j12;
        long j13 = 0;
        if ((!this.d || this.e || j10 <= 0) && (dbVar = this.y) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.c).getClientUserId();
            int i10 = 1;
            ArrayList arrayList2 = this.I;
            if (arrayList2 != null) {
                j12 = 0;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i11);
                    long peerDialogId = DialogObject.getPeerDialogId(messageReactor.peer_id);
                    long j14 = j13;
                    boolean z4 = messageReactor.anonymous;
                    if (z4) {
                        peerDialogId = messageReactor.my ? clientUserId : (-i11) - i10;
                    }
                    if (messageReactor.my || peerDialogId == clientUserId) {
                        j12 = messageReactor.count;
                    } else {
                        long j15 = messageReactor.count;
                        xa xaVar = new xa();
                        xaVar.a = z4;
                        xaVar.b = false;
                        xaVar.c = peerDialogId;
                        xaVar.d = j15;
                        arrayList.add(xaVar);
                    }
                    i11++;
                    j13 = j14;
                    i10 = 1;
                }
                j11 = j13;
            } else {
                j11 = 0;
                j12 = 0;
            }
            long j16 = j12 + j10;
            if (j16 > j11) {
                boolean z10 = this.B == UserObject.ANONYMOUS;
                xa xaVar2 = new xa();
                xaVar2.a = z10;
                xaVar2.b = true;
                xaVar2.c = clientUserId;
                xaVar2.d = j16;
                arrayList.add(xaVar2);
            }
            Collections.sort(arrayList, new e5.e(20));
            dbVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}
