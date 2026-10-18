package ai;

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
import org.telegram.messenger.kk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.yq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class le extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public long F;
    public final ci.v0 G;
    public final ci.q0 H;
    public final View I;
    public final xp J;
    public final zd K;
    public final MessageObject L;
    public final ArrayList M;
    public final c N;
    public ci.n2 O;
    public int P;
    public a1.c Q;
    public final yq[] R;
    public boolean S;
    public boolean T;
    public sn U;
    public View V;
    public ValueAnimator W;
    public final org.telegram.ui.ActionBar.d6 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final LinearLayout f;
    public final FrameLayout h;
    public final LinearLayout n;
    public final ud r;
    public final FrameLayout s;
    public final FrameLayout v;
    public final org.telegram.ui.Components.w9 w;
    public final ei.d x;
    public final ke y;

    public le(Context context, final int i10, final long j10, sn snVar, MessageObject messageObject, ArrayList arrayList, boolean z10, final boolean z11, long j11, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        TLRPC.MessageReactor messageReactor;
        boolean z12;
        TLRPC.Chat chat;
        boolean z13;
        String formatString;
        long j12;
        int i11;
        Context context2;
        this.R = new yq[1];
        this.T = false;
        this.b = d6Var;
        this.c = i10;
        this.L = messageObject;
        this.M = arrayList;
        this.d = z11;
        this.e = z10;
        c cVar = new c(context, i10, d6Var);
        this.N = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        this.container.addView(cVar, w7.z5.a(-2.0f, 0.0f, 48.0f, 0.0f, 0.0f, -2, 49));
        w7.b6.a(cVar);
        cVar.setOnClickListener(new pd(context, 0, d6Var));
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        if (arrayList != null) {
            int size = arrayList.size();
            int i12 = 0;
            TLRPC.MessageReactor messageReactor2 = null;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TLRPC.MessageReactor messageReactor3 = (TLRPC.MessageReactor) obj;
                long peerDialogId = DialogObject.getPeerDialogId(messageReactor3.peer_id);
                if (messageReactor3.anonymous && messageReactor3.my) {
                    peerDialogId = clientUserId;
                }
                if (messageReactor3.my || peerDialogId == clientUserId) {
                    messageReactor2 = messageReactor3;
                }
            }
            messageReactor = messageReactor2;
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
            this.E = j11;
        } else {
            this.E = ga.y(i10, false).B(messageObject);
        }
        long j13 = this.E;
        this.F = j13 != UserObject.ANONYMOUS ? j13 : clientUserId;
        fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, d6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, w7.z5.n(-1, -2));
        this.r = new ud(this, context, d6Var, z11, i10);
        int i14 = 9;
        int[] iArr = {1, 50, 100, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2000, 5000, 7500, 10000};
        long j14 = MessagesController.getInstance(i10).starsPaidReactionAmountMax;
        ArrayList arrayList2 = new ArrayList();
        int i15 = 0;
        while (true) {
            if (i15 >= i14) {
                z12 = z14;
                break;
            }
            int i16 = iArr[i15];
            z12 = z14;
            if (i16 > j14) {
                arrayList2.add(Integer.valueOf((int) j14));
                break;
            }
            arrayList2.add(Integer.valueOf(i16));
            if (iArr[i15] == j14) {
                break;
            }
            i15++;
            z14 = z12;
            i14 = 9;
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
            iArr2[i17] = ((Integer) arrayList2.get(i17)).intValue();
        }
        ud udVar = this.r;
        udVar.e0 = iArr2;
        if (z10 || z11) {
            if (!z10) {
                udVar.setAlpha(0.5f);
            }
            this.h.addView(this.r, w7.z5.a(-2.0f, 0.0f, z11 ? -50.0f : 0.0f, 0.0f, (!z11 || z12) ? 0.0f : -40.0f, -1, 55));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.h.addView(linearLayout2, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i5, d6Var)));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.w = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        w9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        s();
        frameLayout3.addView(w9Var, w7.z5.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.r5, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, w7.z5.a(18.0f, 0.0f, 0.0f, 4.0f, 0.0f, 18, 21));
        frameLayout2.addView(frameLayout3, w7.z5.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, w7.z5.p(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        w7.b6.a(frameLayout2);
        k0.g(i10).o();
        vd vdVar = new vd(context, 0);
        int i18 = org.telegram.ui.ActionBar.h6.G6;
        vdVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, d6Var));
        vdVar.setTextSize(1, 20.0f);
        vdVar.setGravity(17);
        vdVar.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        vdVar.setTypeface(AndroidUtilities.bold());
        vdVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(vdVar, w7.z5.p(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        r(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W5, d6Var), mode));
        w7.b6.a(imageView2);
        final int i19 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ai.qd
            public final /* synthetic */ le b;

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
                        le leVar = this.b;
                        xp xpVar = leVar.J;
                        xpVar.a(!xpVar.a.q, true);
                        leVar.E = xpVar.a.q ? leVar.F : UserObject.ANONYMOUS;
                        leVar.s();
                        ke keVar = leVar.y;
                        if (keVar != null) {
                            keVar.setMyPrivacy(leVar.E);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(imageView2, w7.z5.p(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.h.addView(linearLayout3, w7.z5.a(-2.0f, 0.0f, z11 ? 0.0f : z10 ? 179.0f : 45.0f, 0.0f, 15.0f, -1, 55));
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        TextView textView = new TextView(context);
        kk.o(i18, d6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor != null) {
            formatString = LocaleController.formatPluralStringComma("StarsReactionTextSent", messageReactor.count);
            chat = chat2;
            z13 = false;
        } else {
            chat = chat2;
            z13 = false;
            formatString = LocaleController.formatString(R.string.StarsReactionText, chat2 == null ? "" : chat2.title);
        }
        textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(formatString), textView.getPaint().getFontMetricsInt(), z13));
        if (z10 && !z11) {
            linearLayout3.addView(textView, w7.z5.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z12) {
            if (!z11) {
                linearLayout3.addView(new wd(context, d6Var), w7.z5.t(-1, 30, 55, 0, 20, 0, 0));
            }
            ke keVar = new ke(this, context, z11);
            this.y = keVar;
            keVar.setOnSenderClickListener(new Utilities.Callback() { // from class: ai.rd
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj2) {
                    Long l4 = (Long) obj2;
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    long longValue = l4.longValue();
                    le leVar = le.this;
                    boolean z15 = z11;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l4.longValue());
                        if (l4.longValue() == UserConfig.getInstance(i10).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        U.presentFragment(new xd(leVar, bundle, z15));
                        leVar.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l4.longValue());
                        U.presentFragment(new yd(leVar, bundle2, z15));
                    }
                    leVar.dismiss();
                }
            });
            this.f.addView(keVar, w7.z5.k(0.0f, z11 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            this.I = view;
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d7, d6Var));
            if (!z11 && (z10 || messageReactor != null)) {
                this.f.addView(view, w7.z5.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.y = null;
            this.I = null;
        }
        if (z11) {
            int i20 = org.telegram.ui.ActionBar.h6.j5;
            TextView b10 = w7.d6.b(context, 20.0f, i20, true, d6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(z10 ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.f.addView(b10, w7.z5.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = w7.d6.b(context, 14.0f, i20, false, d6Var);
            b11.setGravity(17);
            kk.r(z10 ? R.string.LiveStoryReactText : z12 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText, new Object[]{DialogObject.getName(j10)}, b11);
            this.f.addView(b11, w7.z5.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            ci.v0 v0Var = new ci.v0();
            this.G = v0Var;
            v0Var.c = this.E;
            v0Var.g = 50L;
            v0Var.e = true;
            ci.q0 q0Var = new ci.q0(i10, context, true);
            this.H = q0Var;
            q0Var.set(v0Var);
            this.f.addView(q0Var, w7.z5.t(-2, -2, 17, 32, 0, 32, 20));
        }
        xp xpVar = new xp(context, 21, d6Var);
        this.J = xpVar;
        xpVar.b(org.telegram.ui.ActionBar.h6.h7, org.telegram.ui.ActionBar.h6.j7, org.telegram.ui.ActionBar.h6.k7);
        xpVar.setDrawUnchecked(true);
        xpVar.a(this.E != UserObject.ANONYMOUS, false);
        ke keVar2 = this.y;
        if (keVar2 != null) {
            keVar2.setMyPrivacy(this.E);
        }
        xpVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        kk.o(i18, d6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(xpVar, w7.z5.t(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, w7.z5.q(-2, -2, 16));
        final int i21 = 1;
        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: ai.qd
            public final /* synthetic */ le b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i21) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        le leVar = this.b;
                        xp xpVar2 = leVar.J;
                        xpVar2.a(!xpVar2.a.q, true);
                        leVar.E = xpVar2.a.q ? leVar.F : UserObject.ANONYMOUS;
                        leVar.s();
                        ke keVar3 = leVar.y;
                        if (keVar3 != null) {
                            keVar3.setMyPrivacy(leVar.E);
                            break;
                        }
                        break;
                }
            }
        });
        w7.b6.b(linearLayout4, 0.05f, 1.2f);
        int i22 = 6;
        linearLayout4.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var), 6, 6));
        if (!z11 && (z10 || messageReactor != null)) {
            this.f.addView(linearLayout4, w7.z5.t(-2, -2, 1, 0, z12 ? 10 : 4, 0, 10));
        }
        ei.d dVar = new ei.d(context, d6Var, true);
        this.x = dVar;
        dVar.e();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f.addView(dVar, w7.z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        t(0L);
        dVar.g(md.W0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.R), true, true);
        if (z10) {
            j12 = 0;
            i11 = 17;
            context2 = context;
            dVar.setOnClickListener(new mb(this, messageObject, snVar, i10, z11, context, d6Var, j10, chat));
        } else {
            j12 = 0;
            i11 = 17;
            context2 = context;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: ai.sd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                le.n(le.this, i10, d6Var, j10, z11);
            }
        });
        x90 x90Var = new x90(context2, d6Var);
        x90Var.setTextSize(1, 13.0f);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var));
        if (!z11 || z10) {
            x90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new ra(context2, i22)));
        } else {
            x90Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        }
        x90Var.setGravity(i11);
        x90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.k5));
        if (z10 || z11) {
            this.f.addView(x90Var, w7.z5.t(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f);
        zd zdVar = new zd(context2, 1, 2, 0);
        this.K = zdVar;
        tg.g gVar = zdVar.b;
        gVar.z = org.telegram.ui.ActionBar.h6.fk;
        gVar.A = org.telegram.ui.ActionBar.h6.gk;
        gVar.b();
        zdVar.b.k = 1.0f;
        zdVar.setVisibility(4);
        zdVar.setPaused(true);
        this.container.addView(zdVar, w7.z5.d(150.0f, ImageReceiver.DEFAULT_CROSSFADE_DURATION));
        this.r.setValue(50);
        if (arrayList != null) {
            long j15 = j12;
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                long j16 = ((TLRPC.MessageReactor) arrayList.get(i23)).count;
                if (j16 > j15) {
                    j15 = j16;
                }
            }
            j15 = messageReactor != null ? j15 - messageReactor.count : j15;
            if (j15 > j12) {
                this.r.setStarsTop(j15 + 1);
            }
        }
    }

    public static void n(le leVar, int i10, org.telegram.ui.ActionBar.d6 d6Var, long j10, boolean z10) {
        long j11;
        le leVar2 = leVar;
        k0 g10 = k0.g(i10);
        g10.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g10.l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
        i80 F = i80.F(leVar2.containerView, d6Var, leVar2.v);
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
                leVar2 = leVar;
                i11 = i12;
            }
            if (j11 == j10) {
                i11 = i12;
            } else {
                long j12 = leVar2.E;
                F.g(tLObject, j11 == j12 || (j12 == 0 && j11 == UserConfig.getInstance(i10).getClientUserId()), new td(leVar2, j11, z10, 0));
                leVar2 = leVar;
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
        c cVar = this.N;
        arrayList.add(ObjectAnimator.ofFloat(cVar, (Property<c, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(cVar, (Property<c, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(cVar, (Property<c, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        if (this.r.k0) {
            return false;
        }
        return super.canDismissWithSwipe();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.adminedChannelsLoaded) {
            r(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        Long myPaidReactionPeer;
        if (!this.S && !this.T) {
            this.T = true;
            MessageObject messageObject = this.L;
            if (messageObject != null && ((myPaidReactionPeer = messageObject.getMyPaidReactionPeer()) == null || myPaidReactionPeer.longValue() != this.E)) {
                messageObject.setMyPaidReactionDialogId(this.E);
                aa b10 = aa.b(messageObject);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i10 = this.c;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j10 = b10.a;
                int i11 = b10.b;
                tL_messages_togglePaidReactionPrivacy.peer = messagesController.getInputPeer(j10);
                tL_messages_togglePaidReactionPrivacy.msg_id = i11;
                long j11 = this.E;
                if (j11 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j11 == UserObject.ANONYMOUS) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = MessagesController.getInstance(i10).getInputPeer(this.E);
                }
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(b10.a), Integer.valueOf(i11), Long.valueOf(this.E));
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new h(this, 5));
            }
        }
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.dismissInternal();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean isTouchOutside(float f7, float f10) {
        c cVar = this.N;
        if (f7 < cVar.getX() || f7 > cVar.getX() + cVar.getWidth() || f10 < cVar.getY() || f10 > cVar.getY() + cVar.getHeight()) {
            return super.isTouchOutside(f7, f10);
        }
        return false;
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

    public final void p(final da daVar) {
        ah.g1 g1Var;
        View view;
        ah.j1 j1Var;
        ci.n2 n2Var;
        View view2;
        ah.j1 j1Var2;
        ah.g1 g1Var2;
        MessageObject messageObject;
        ud udVar = this.r;
        zd zdVar = this.K;
        MessageObject messageObject2 = this.L;
        if (messageObject2 != null && (view2 = this.U.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.V;
            if (view3 instanceof org.telegram.ui.Cells.u1) {
                j1Var2 = ((org.telegram.ui.Cells.u1) view3).N;
                j1Var2.getClass();
                g1Var2 = j1Var2.m("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.w0) {
                j1Var2 = ((org.telegram.ui.Cells.w0) view3).E0;
                j1Var2.getClass();
                g1Var2 = j1Var2.m("stars");
            } else {
                j1Var2 = null;
                g1Var2 = null;
            }
            if (g1Var2 == null && j1Var2 != null) {
                MessageObject.GroupedMessages c92 = this.U.c9(messageObject2);
                if (c92 != null && !c92.posArray.isEmpty()) {
                    ArrayList<MessageObject> arrayList = c92.messages;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            messageObject = null;
                            break;
                        }
                        MessageObject messageObject3 = arrayList.get(i10);
                        i10++;
                        messageObject = messageObject3;
                        MessageObject.GroupedMessagePosition position = c92.getPosition(messageObject);
                        if (position != null) {
                            int i11 = position.flags;
                            if ((i11 & 1) != 0 && (i11 & 8) != 0) {
                                break;
                            }
                        }
                    }
                    if (messageObject != null) {
                        view3 = this.U.t8(messageObject.getId(), false);
                    }
                }
                if (view3 == null) {
                    return;
                }
                if (view3 instanceof org.telegram.ui.Cells.u1) {
                    j1Var2 = ((org.telegram.ui.Cells.u1) view3).N;
                    j1Var2.getClass();
                    g1Var2 = j1Var2.m("stars");
                }
            }
            if (g1Var2 == null) {
                return;
            }
            j1Var = j1Var2;
            g1Var = g1Var2;
            view = view3;
        } else {
            if (this.O == null) {
                return;
            }
            g1Var = null;
            view = null;
            j1Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        udVar.getLocationInWindow(iArr);
        rectF.set(udVar.G.getBounds());
        rectF.inset(-AndroidUtilities.dp(3.5f), -AndroidUtilities.dp(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        nd ndVar = new nd(this, 2);
        zdVar.a0 = ndVar;
        if (zdVar.W) {
            zdVar.a0 = null;
            ndVar.run();
        }
        if (g1Var != null) {
            g1Var.l = false;
        }
        if (view != null) {
            view.invalidate();
        }
        ah.g1 g1Var3 = g1Var;
        ci.q0[] q0VarArr = new ci.q0[1];
        if (this.d && (n2Var = this.O) != null) {
            q0VarArr[0] = n2Var.d(this.P);
        }
        final RectF rectF2 = new RectF();
        final u7 u7Var = new u7(this, q0VarArr, iArr, rectF2, view, j1Var, g1Var3, 3);
        View view4 = view;
        u7Var.run();
        zdVar.setPaused(false);
        zdVar.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        zdVar.setTranslationX(rectF3.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
        zdVar.setTranslationY(rectF3.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
        zdVar.setScaleX(rectF3.width() / AndroidUtilities.dp(150.0f));
        zdVar.setScaleY(rectF3.height() / AndroidUtilities.dp(150.0f));
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ai.od
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                u7Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                AndroidUtilities.lerp(rectF4, rectF5, floatValue, rectF6);
                le leVar = le.this;
                zd zdVar2 = leVar.K;
                zdVar2.setTranslationX(rectF6.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
                zdVar2.setTranslationY(rectF6.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
                float lerp = AndroidUtilities.lerp(Math.max(rectF6.width() / AndroidUtilities.dp(150.0f), rectF6.height() / AndroidUtilities.dp(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                zdVar2.setScaleX(lerp);
                zdVar2.setScaleY(lerp);
                tg.g gVar = zdVar2.b;
                gVar.d = 360.0f * floatValue;
                gVar.k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (zArr2[0] || floatValue <= 0.95f) {
                    return;
                }
                zArr2[0] = true;
                LaunchActivity.c0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                try {
                    leVar.container.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                Runnable runnable = daVar;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.W.addListener(new ae(this, g1Var3, view4, q0VarArr, zArr, rectF2, daVar));
        this.W.setDuration(800L);
        this.W.setInterpolator(new be(0));
        this.W.start();
    }

    public final boolean q() {
        if (!this.d) {
            k0 g10 = k0.g(this.c);
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

    public final void r(boolean z10) {
        FrameLayout frameLayout = this.s;
        if ((frameLayout.getVisibility() == 0) != q()) {
            frameLayout.setVisibility(q() ? 0 : 8);
            if (z10) {
                if (q()) {
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

    public final void s() {
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.p = 0.42f;
        long j10 = this.E;
        org.telegram.ui.Components.w9 w9Var = this.w;
        if (j10 == UserObject.ANONYMOUS) {
            h9Var.g(21);
            int i10 = org.telegram.ui.ActionBar.h6.c8;
            org.telegram.ui.ActionBar.d6 d6Var = this.b;
            h9Var.i(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
            w9Var.e(null, h9Var);
            return;
        }
        int i11 = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.E));
            h9Var.r(user);
            w9Var.e(user, h9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-this.E));
            h9Var.q(chat);
            w9Var.e(chat, h9Var);
        }
    }

    public final void t(long j10) {
        ke keVar;
        long j11;
        long j12;
        long j13 = 0;
        if ((!this.d || this.e || j10 <= 0) && (keVar = this.y) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.c).getClientUserId();
            int i10 = 1;
            ArrayList arrayList2 = this.M;
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
                        ee eeVar = new ee();
                        eeVar.a = z10;
                        eeVar.b = false;
                        eeVar.c = peerDialogId;
                        eeVar.d = j15;
                        arrayList.add(eeVar);
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
                boolean z11 = this.E == UserObject.ANONYMOUS;
                ee eeVar2 = new ee();
                eeVar2.a = z11;
                eeVar2.b = true;
                eeVar2.c = clientUserId;
                eeVar2.d = j16;
                arrayList.add(eeVar2);
            }
            Collections.sort(arrayList, new a4.d(5));
            keVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}
