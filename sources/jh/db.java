package jh;

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
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class db extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public long A;
    public long B;
    public final lh.s0 C;
    public final lh.n0 D;
    public final hp E;
    public final cg.i F;
    public final MessageObject G;
    public final ArrayList H;
    public final b I;
    public lh.f2 J;
    public int K;
    public l4.s0 L;
    public final iq[] M;
    public boolean N;
    public boolean O;
    public tn P;
    public View Q;
    public ValueAnimator R;
    public final org.telegram.ui.ActionBar.c6 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final LinearLayout f;
    public final FrameLayout h;
    public final LinearLayout n;
    public final pa r;
    public final FrameLayout s;
    public final FrameLayout v;
    public final org.telegram.ui.Components.t9 w;
    public final nh.d x;
    public final cb y;

    public db(Context context, final int i10, final long j10, tn tnVar, MessageObject messageObject, ArrayList arrayList, boolean z10, final boolean z11, long j11, final org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        TLRPC.MessageReactor messageReactor;
        TLRPC.MessageReactor messageReactor2;
        TLRPC.MessageReactor messageReactor3;
        boolean z12;
        TLRPC.Chat chat;
        boolean z13;
        String formatString;
        Context context2;
        long j12;
        float f9;
        int i11;
        this.M = new iq[1];
        this.O = false;
        this.b = c6Var;
        this.c = i10;
        this.G = messageObject;
        this.H = arrayList;
        this.d = z11;
        this.e = z10;
        b bVar = new b(context, i10, c6Var);
        this.I = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        this.container.addView(bVar, i7.f6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        i7.h6.a(bVar);
        bVar.setOnClickListener(new ih.n(context, 1, c6Var));
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
        boolean z14 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z11) {
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
            this.A = j11;
        } else {
            messageReactor2 = messageReactor;
            this.A = s7.y(i10, false).B(messageObject);
        }
        long j13 = this.A;
        this.B = j13 != UserObject.ANONYMOUS ? j13 : clientUserId;
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, i7.f6.n(-1, -2));
        this.r = new pa(this, context, c6Var, z11, i10);
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
        pa paVar = this.r;
        paVar.a0 = iArr2;
        if (z10 || z11) {
            if (!z10) {
                paVar.setAlpha(0.5f);
            }
            this.h.addView(this.r, i7.f6.d(-1, -2.0f, 55, 0.0f, z11 ? -50.0f : 0.0f, 0.0f, (!z11 || z14) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.h.addView(linearLayout2, i7.f6.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i5, c6Var)));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.w = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        t9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        r();
        frameLayout3.addView(t9Var, i7.f6.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.r5, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, i7.f6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, i7.f6.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, i7.f6.p(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        i7.h6.a(frameLayout2);
        b0.g(i10).o();
        eg.r rVar = new eg.r(context, 1);
        int i18 = org.telegram.ui.ActionBar.g6.G6;
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i18, c6Var));
        rVar.setTextSize(1, 20.0f);
        rVar.setGravity(17);
        rVar.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        rVar.setTypeface(AndroidUtilities.bold());
        rVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(rVar, i7.f6.p(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        q(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W5, c6Var), mode));
        i7.h6.a(imageView2);
        final int i19 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: jh.la
            public final /* synthetic */ db b;

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
                        db dbVar = this.b;
                        hp hpVar = dbVar.E;
                        hpVar.a(!hpVar.a.q, true);
                        dbVar.A = hpVar.a.q ? dbVar.B : UserObject.ANONYMOUS;
                        dbVar.r();
                        cb cbVar = dbVar.y;
                        if (cbVar != null) {
                            cbVar.setMyPrivacy(dbVar.A);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(imageView2, i7.f6.p(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.h.addView(linearLayout3, i7.f6.d(-1, -2.0f, 55, 0.0f, z11 ? 0.0f : z10 ? 179.0f : 45.0f, 0.0f, 15.0f));
        boolean z15 = z14;
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        TextView textView = new TextView(context);
        org.telegram.ui.b.m(i18, c6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor2 != null) {
            messageReactor3 = messageReactor2;
            z12 = z15;
            formatString = LocaleController.formatPluralStringComma("StarsReactionTextSent", messageReactor3.count);
            chat = chat2;
            z13 = false;
        } else {
            messageReactor3 = messageReactor2;
            z12 = z15;
            int i20 = R.string.StarsReactionText;
            String str = chat2 == null ? "" : chat2.title;
            chat = chat2;
            z13 = false;
            formatString = LocaleController.formatString(i20, str);
        }
        textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(formatString), textView.getPaint().getFontMetricsInt(), z13));
        if (z10 && !z11) {
            linearLayout3.addView(textView, i7.f6.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z12) {
            if (!z11) {
                linearLayout3.addView(new qa(context, c6Var), i7.f6.t(-1, 30, 55, 0, 20, 0, 0));
            }
            cb cbVar = new cb(this, context, z11);
            this.y = cbVar;
            cbVar.setOnSenderClickListener(new Utilities.Callback() { // from class: jh.ma
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj2) {
                    Long l10 = (Long) obj2;
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    long longValue = l10.longValue();
                    db dbVar = db.this;
                    boolean z16 = z11;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l10.longValue());
                        if (l10.longValue() == UserConfig.getInstance(i10).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        U.presentFragment(new ra(dbVar, bundle, z16));
                        dbVar.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l10.longValue());
                        U.presentFragment(new sa(dbVar, bundle2, z16));
                    }
                    dbVar.dismiss();
                }
            });
            this.f.addView(cbVar, i7.f6.k(0.0f, z11 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, c6Var));
            if (!z11 && (z10 || messageReactor3 != null)) {
                this.f.addView(view, i7.f6.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.y = null;
        }
        if (z11) {
            int i21 = org.telegram.ui.ActionBar.g6.j5;
            TextView b10 = i7.j6.b(context, 20.0f, i21, true, c6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(z10 ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.f.addView(b10, i7.f6.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = i7.j6.b(context, 14.0f, i21, false, c6Var);
            b11.setGravity(17);
            org.telegram.ui.b.p(z10 ? R.string.LiveStoryReactText : z12 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText, new Object[]{DialogObject.getName(j10)}, b11);
            this.f.addView(b11, i7.f6.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            lh.s0 s0Var = new lh.s0();
            this.C = s0Var;
            s0Var.c = this.A;
            s0Var.g = 50L;
            s0Var.e = true;
            lh.n0 n0Var = new lh.n0(i10, context, true);
            this.D = n0Var;
            n0Var.set(s0Var);
            this.f.addView(n0Var, i7.f6.t(-2, -2, 17, 32, 0, 32, 20));
        }
        hp hpVar = new hp(context, 21, c6Var);
        this.E = hpVar;
        hpVar.b(org.telegram.ui.ActionBar.g6.h7, org.telegram.ui.ActionBar.g6.j7, org.telegram.ui.ActionBar.g6.k7);
        hpVar.setDrawUnchecked(true);
        hpVar.a(this.A != UserObject.ANONYMOUS, false);
        cb cbVar2 = this.y;
        if (cbVar2 != null) {
            cbVar2.setMyPrivacy(this.A);
        }
        hpVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        org.telegram.ui.b.m(i18, c6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(hpVar, i7.f6.t(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, i7.f6.q(-2, -2, 16));
        final int i22 = 1;
        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: jh.la
            public final /* synthetic */ db b;

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
                        db dbVar = this.b;
                        hp hpVar2 = dbVar.E;
                        hpVar2.a(!hpVar2.a.q, true);
                        dbVar.A = hpVar2.a.q ? dbVar.B : UserObject.ANONYMOUS;
                        dbVar.r();
                        cb cbVar3 = dbVar.y;
                        if (cbVar3 != null) {
                            cbVar3.setMyPrivacy(dbVar.A);
                            break;
                        }
                        break;
                }
            }
        });
        i7.h6.b(linearLayout4, 0.05f, 1.2f);
        linearLayout4.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 6, 6));
        if (!z11 && (z10 || messageReactor3 != null)) {
            this.f.addView(linearLayout4, i7.f6.t(-2, -2, 1, 0, z12 ? 10 : 4, 0, 10));
        }
        nh.d dVar = new nh.d(context, c6Var, true);
        this.x = dVar;
        dVar.e();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f.addView(dVar, i7.f6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        s(0L);
        dVar.g(ia.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.M), true, true);
        if (z10) {
            j12 = 0;
            f9 = 1.0f;
            i11 = 3;
            context2 = context;
            dVar.setOnClickListener(new q8(this, messageObject, tnVar, i10, z11, context, c6Var, j10, chat));
        } else {
            context2 = context;
            j12 = 0;
            f9 = 1.0f;
            i11 = 3;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: jh.na
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                db.m(db.this, i10, c6Var, j10, z11);
            }
        });
        y80 y80Var = new y80(context2, c6Var);
        y80Var.setTextSize(1, 13.0f);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var));
        if (!z11 || z10) {
            y80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new e2.e(context2, 10)));
        } else {
            y80Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        }
        y80Var.setGravity(17);
        y80Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.k5));
        if (z10 || z11) {
            this.f.addView(y80Var, i7.f6.t(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f);
        cg.i iVar = new cg.i(context2, 1, 2, i11);
        this.F = iVar;
        dg.a aVar = iVar.b;
        aVar.w = org.telegram.ui.ActionBar.g6.fk;
        aVar.x = org.telegram.ui.ActionBar.g6.gk;
        aVar.b();
        iVar.b.h = f9;
        iVar.setVisibility(4);
        iVar.setPaused(true);
        this.container.addView(iVar, i7.f6.c(150.0f, ImageReceiver.DEFAULT_CROSSFADE_DURATION));
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

    public static void m(db dbVar, int i10, org.telegram.ui.ActionBar.c6 c6Var, long j10, boolean z10) {
        long j11;
        db dbVar2 = dbVar;
        b0 g10 = b0.g(i10);
        g10.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g10.l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
        j70 F = j70.F(dbVar2.containerView, c6Var, dbVar2.v);
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
                dbVar2 = dbVar;
                i11 = i12;
            }
            if (j11 == j10) {
                i11 = i12;
            } else {
                long j12 = dbVar2.A;
                F.g(tLObject, j11 == j12 || (j12 == 0 && j11 == UserConfig.getInstance(i10).getClientUserId()), new oa(dbVar2, j11, z10, 0));
                dbVar2 = dbVar;
                i11 = i12;
            }
        }
        F.t = false;
        F.Y = true;
        F.s = 0;
        F.V(5);
        F.Z();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void appendOpenAnimator(boolean z10, ArrayList arrayList) {
        Property property = View.ALPHA;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        b bVar = this.I;
        arrayList.add(ObjectAnimator.ofFloat(bVar, (Property<b, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(bVar, (Property<b, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(bVar, (Property<b, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        if (this.r.g0) {
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

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        Long myPaidReactionPeer;
        if (!this.N && !this.O) {
            this.O = true;
            MessageObject messageObject = this.G;
            if (messageObject != null && ((myPaidReactionPeer = messageObject.getMyPaidReactionPeer()) == null || myPaidReactionPeer.longValue() != this.A)) {
                messageObject.setMyPaidReactionDialogId(this.A);
                m7 b10 = m7.b(messageObject);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i10 = this.c;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j10 = b10.a;
                int i11 = b10.b;
                tL_messages_togglePaidReactionPrivacy.peer = messagesController.getInputPeer(j10);
                tL_messages_togglePaidReactionPrivacy.msg_id = i11;
                long j11 = this.A;
                if (j11 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j11 == UserObject.ANONYMOUS) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = MessagesController.getInstance(i10).getInputPeer(this.A);
                }
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(b10.a), Integer.valueOf(i11), Long.valueOf(this.A));
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new ef.a(this, 10));
            }
        }
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.dismissInternal();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean isTouchOutside(float f9, float f10) {
        b bVar = this.I;
        if (f9 < bVar.getX() || f9 > bVar.getX() + bVar.getWidth() || f10 < bVar.getY() || f10 > bVar.getY() + bVar.getHeight()) {
            return super.isTouchOutside(f9, f10);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(final p7 p7Var) {
        View view;
        kg.r0 r0Var;
        lh.f2 f2Var;
        View view2;
        kg.r0 r0Var2;
        kg.o0 o0Var;
        kg.o0 o0Var2 = null;
        MessageObject messageObject = null;
        if (this.G != null && (view2 = this.P.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.Q;
            if (view3 instanceof org.telegram.ui.Cells.s1) {
                r0Var2 = ((org.telegram.ui.Cells.s1) view3).J;
                r0Var2.getClass();
                o0Var = r0Var2.l("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.v0) {
                r0Var2 = ((org.telegram.ui.Cells.v0) view3).y0;
                r0Var2.getClass();
                o0Var = r0Var2.l("stars");
            } else {
                r0Var2 = null;
                o0Var = null;
            }
            if (o0Var == null && r0Var2 != null) {
                MessageObject.GroupedMessages X8 = this.P.X8(this.G);
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
                        view3 = this.P.q8(messageObject.getId(), false);
                    }
                }
                if (view3 == null) {
                    return;
                }
                if (view3 instanceof org.telegram.ui.Cells.s1) {
                    kg.r0 r0Var3 = ((org.telegram.ui.Cells.s1) view3).J;
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
            if (this.J == null) {
                return;
            }
            view = null;
            r0Var = null;
        }
        View view4 = view;
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        this.r.getLocationInWindow(iArr);
        rectF.set(this.r.C.getBounds());
        rectF.inset(-AndroidUtilities.dp(3.5f), -AndroidUtilities.dp(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        cg.i iVar = this.F;
        ja jaVar = new ja(this, 2);
        if (iVar.L) {
            jaVar.run();
        } else {
            iVar.M = jaVar;
        }
        if (o0Var2 != null) {
            o0Var2.l = false;
        }
        if (view4 != null) {
            view4.invalidate();
        }
        lh.n0[] n0VarArr = new lh.n0[1];
        if (this.d && (f2Var = this.J) != null) {
            n0VarArr[0] = f2Var.d(this.K);
        }
        kg.o0 o0Var3 = o0Var2;
        final RectF rectF2 = new RectF();
        final eg.h0 h0Var = new eg.h0(this, n0VarArr, iArr, rectF2, view4, r0Var, o0Var3, 5);
        h0Var.run();
        this.F.setPaused(false);
        this.F.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        this.F.setTranslationX(rectF3.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
        this.F.setTranslationY(rectF3.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
        this.F.setScaleX(rectF3.width() / AndroidUtilities.dp(150.0f));
        this.F.setScaleY(rectF3.height() / AndroidUtilities.dp(150.0f));
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.R = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jh.ka
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                h0Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                AndroidUtilities.lerp(rectF4, rectF5, floatValue, rectF6);
                db dbVar = db.this;
                cg.i iVar2 = dbVar.F;
                iVar2.setTranslationX(rectF6.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
                iVar2.setTranslationY(rectF6.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
                float lerp = AndroidUtilities.lerp(Math.max(rectF6.width() / AndroidUtilities.dp(150.0f), rectF6.height() / AndroidUtilities.dp(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                iVar2.setScaleX(lerp);
                iVar2.setScaleY(lerp);
                dg.a aVar = iVar2.b;
                aVar.d = 360.0f * floatValue;
                aVar.h = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (zArr2[0] || floatValue <= 0.95f) {
                    return;
                }
                zArr2[0] = true;
                LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                try {
                    dbVar.container.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                Runnable runnable = p7Var;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.R.addListener(new ta(this, o0Var3, view4, n0VarArr, zArr, rectF2, p7Var));
        this.R.setDuration(800L);
        this.R.setInterpolator(new f2.a0(3));
        this.R.start();
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

    public final void q(boolean z10) {
        FrameLayout frameLayout = this.s;
        if ((frameLayout.getVisibility() == 0) != p()) {
            frameLayout.setVisibility(p() ? 0 : 8);
            if (z10) {
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
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.p = 0.42f;
        long j10 = this.A;
        org.telegram.ui.Components.t9 t9Var = this.w;
        if (j10 == UserObject.ANONYMOUS) {
            e9Var.g(21);
            int i10 = org.telegram.ui.ActionBar.g6.c8;
            org.telegram.ui.ActionBar.c6 c6Var = this.b;
            e9Var.i(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            t9Var.e(null, e9Var);
            return;
        }
        int i11 = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.A));
            e9Var.r(user);
            t9Var.e(user, e9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-this.A));
            e9Var.q(chat);
            t9Var.e(chat, e9Var);
        }
    }

    public final void s(long j10) {
        cb cbVar;
        long j11;
        long j12;
        long j13 = 0;
        if ((!this.d || this.e || j10 <= 0) && (cbVar = this.y) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.c).getClientUserId();
            int i10 = 1;
            ArrayList arrayList2 = this.H;
            if (arrayList2 != null) {
                j12 = 0;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i11);
                    long peerDialogId = DialogObject.getPeerDialogId(messageReactor.peer_id);
                    long j14 = j13;
                    boolean z10 = messageReactor.anonymous;
                    if (z10) {
                        peerDialogId = messageReactor.my ? clientUserId : (-i11) - i10;
                    }
                    if (messageReactor.my || peerDialogId == clientUserId) {
                        j12 = messageReactor.count;
                    } else {
                        long j15 = messageReactor.count;
                        wa waVar = new wa();
                        waVar.a = z10;
                        waVar.b = false;
                        waVar.c = peerDialogId;
                        waVar.d = j15;
                        arrayList.add(waVar);
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
                boolean z11 = this.A == UserObject.ANONYMOUS;
                wa waVar2 = new wa();
                waVar2.a = z11;
                waVar2.b = true;
                waVar2.c = clientUserId;
                waVar2.d = j16;
                arrayList.add(waVar2);
            }
            Collections.sort(arrayList, new c5.e(19));
            cbVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}
