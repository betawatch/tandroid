package hh;

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
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class jb extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public long A;
    public long B;
    public final jh.s0 C;
    public final jh.n0 D;
    public final bp E;
    public final ag.k F;
    public final MessageObject G;
    public final ArrayList H;
    public final b I;
    public jh.g2 J;
    public int K;
    public h3.x L;
    public final cq[] M;
    public boolean N;
    public boolean O;
    public rn P;
    public View Q;
    public ValueAnimator R;
    public final org.telegram.ui.ActionBar.c6 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final LinearLayout f;
    public final FrameLayout h;
    public final LinearLayout n;
    public final va r;
    public final FrameLayout s;
    public final FrameLayout v;
    public final org.telegram.ui.Components.n9 w;
    public final lh.d x;
    public final ib y;

    public jb(Context context, final int i10, final long j10, rn rnVar, MessageObject messageObject, ArrayList arrayList, boolean z10, final boolean z11, long j11, final org.telegram.ui.ActionBar.c6 c6Var) {
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
        float f10;
        int i11;
        this.M = new cq[1];
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
        this.container.addView(bVar, h7.z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        h7.b6.a(bVar);
        bVar.setOnClickListener(new gh.n(context, 1, c6Var));
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
            this.A = u7.y(i10, false).B(messageObject);
        }
        long j13 = this.A;
        this.B = j13 != UserObject.ANONYMOUS ? j13 : clientUserId;
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, h7.z5.n(-1, -2));
        this.r = new va(this, context, c6Var, z11, i10);
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
        va vaVar = this.r;
        vaVar.a0 = iArr2;
        if (z10 || z11) {
            if (!z10) {
                vaVar.setAlpha(0.5f);
            }
            this.h.addView(this.r, h7.z5.d(-1, -2.0f, 55, 0.0f, z11 ? -50.0f : 0.0f, 0.0f, (!z11 || z14) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.h.addView(linearLayout2, h7.z5.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i5, c6Var)));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.w = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        n9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        s();
        frameLayout3.addView(n9Var, h7.z5.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.r5, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, h7.z5.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, h7.z5.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, h7.z5.p(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        h7.b6.a(frameLayout2);
        c0.g(i10).o();
        cg.q qVar = new cg.q(context, 1);
        int i18 = org.telegram.ui.ActionBar.g6.G6;
        qVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i18, c6Var));
        qVar.setTextSize(1, 20.0f);
        qVar.setGravity(17);
        qVar.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(qVar, h7.z5.p(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        r(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W5, c6Var), mode));
        h7.b6.a(imageView2);
        final int i19 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: hh.ra
            public final /* synthetic */ jb b;

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
                        jb jbVar = this.b;
                        bp bpVar = jbVar.E;
                        bpVar.a(!bpVar.a.q, true);
                        jbVar.A = bpVar.a.q ? jbVar.B : UserObject.ANONYMOUS;
                        jbVar.s();
                        ib ibVar = jbVar.y;
                        if (ibVar != null) {
                            ibVar.setMyPrivacy(jbVar.A);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(imageView2, h7.z5.p(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.h.addView(linearLayout3, h7.z5.d(-1, -2.0f, 55, 0.0f, z11 ? 0.0f : z10 ? 179.0f : 45.0f, 0.0f, 15.0f));
        boolean z15 = z14;
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        TextView textView = new TextView(context);
        rl.l(i18, c6Var, textView, 1, 14.0f);
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
            linearLayout3.addView(textView, h7.z5.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z12) {
            if (!z11) {
                linearLayout3.addView(new wa(context, c6Var), h7.z5.t(-1, 30, 55, 0, 20, 0, 0));
            }
            ib ibVar = new ib(this, context, z11);
            this.y = ibVar;
            ibVar.setOnSenderClickListener(new Utilities.Callback() { // from class: hh.sa
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj2) {
                    Long l10 = (Long) obj2;
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    long longValue = l10.longValue();
                    jb jbVar = jb.this;
                    boolean z16 = z11;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l10.longValue());
                        if (l10.longValue() == UserConfig.getInstance(i10).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        U.presentFragment(new xa(jbVar, bundle, z16));
                        jbVar.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l10.longValue());
                        U.presentFragment(new ya(jbVar, bundle2, z16));
                    }
                    jbVar.dismiss();
                }
            });
            this.f.addView(ibVar, h7.z5.k(0.0f, z11 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, c6Var));
            if (!z11 && (z10 || messageReactor3 != null)) {
                this.f.addView(view, h7.z5.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.y = null;
        }
        if (z11) {
            int i21 = org.telegram.ui.ActionBar.g6.j5;
            TextView b10 = h7.d6.b(context, 20.0f, i21, true, c6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(z10 ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.f.addView(b10, h7.z5.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = h7.d6.b(context, 14.0f, i21, false, c6Var);
            b11.setGravity(17);
            rl.n(z10 ? R.string.LiveStoryReactText : z12 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText, new Object[]{DialogObject.getName(j10)}, b11);
            this.f.addView(b11, h7.z5.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            jh.s0 s0Var = new jh.s0();
            this.C = s0Var;
            s0Var.c = this.A;
            s0Var.g = 50L;
            s0Var.e = true;
            jh.n0 n0Var = new jh.n0(i10, context, true);
            this.D = n0Var;
            n0Var.set(s0Var);
            this.f.addView(n0Var, h7.z5.t(-2, -2, 17, 32, 0, 32, 20));
        }
        bp bpVar = new bp(context, 21, c6Var);
        this.E = bpVar;
        bpVar.b(org.telegram.ui.ActionBar.g6.h7, org.telegram.ui.ActionBar.g6.j7, org.telegram.ui.ActionBar.g6.k7);
        bpVar.setDrawUnchecked(true);
        bpVar.a(this.A != UserObject.ANONYMOUS, false);
        ib ibVar2 = this.y;
        if (ibVar2 != null) {
            ibVar2.setMyPrivacy(this.A);
        }
        bpVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        rl.l(i18, c6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(bpVar, h7.z5.t(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, h7.z5.q(-2, -2, 16));
        final int i22 = 1;
        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: hh.ra
            public final /* synthetic */ jb b;

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
                        jb jbVar = this.b;
                        bp bpVar2 = jbVar.E;
                        bpVar2.a(!bpVar2.a.q, true);
                        jbVar.A = bpVar2.a.q ? jbVar.B : UserObject.ANONYMOUS;
                        jbVar.s();
                        ib ibVar3 = jbVar.y;
                        if (ibVar3 != null) {
                            ibVar3.setMyPrivacy(jbVar.A);
                            break;
                        }
                        break;
                }
            }
        });
        h7.b6.b(linearLayout4, 0.05f, 1.2f);
        linearLayout4.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 6, 6));
        if (!z11 && (z10 || messageReactor3 != null)) {
            this.f.addView(linearLayout4, h7.z5.t(-2, -2, 1, 0, z12 ? 10 : 4, 0, 10));
        }
        lh.d dVar = new lh.d(context, c6Var, true);
        this.x = dVar;
        dVar.e();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f.addView(dVar, h7.z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        t(0L);
        dVar.g(oa.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.M), true, true);
        if (z10) {
            j12 = 0;
            f10 = 1.0f;
            i11 = 3;
            context2 = context;
            dVar.setOnClickListener(new t8(this, messageObject, rnVar, i10, z11, context, c6Var, j10, chat));
        } else {
            context2 = context;
            j12 = 0;
            f10 = 1.0f;
            i11 = 3;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: hh.ta
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jb.m(jb.this, i10, c6Var, j10, z11);
            }
        });
        p80 p80Var = new p80(context2, c6Var);
        p80Var.setTextSize(1, 13.0f);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var));
        if (!z11 || z10) {
            p80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new e2.e(context2, 10)));
        } else {
            p80Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        }
        p80Var.setGravity(17);
        p80Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.k5));
        if (z10 || z11) {
            this.f.addView(p80Var, h7.z5.t(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f);
        ag.k kVar = new ag.k(context2, 1, 2, i11);
        this.F = kVar;
        bg.a aVar = kVar.b;
        aVar.w = org.telegram.ui.ActionBar.g6.fk;
        aVar.x = org.telegram.ui.ActionBar.g6.gk;
        aVar.b();
        kVar.b.h = f10;
        kVar.setVisibility(4);
        kVar.setPaused(true);
        this.container.addView(kVar, h7.z5.c(150.0f, ImageReceiver.DEFAULT_CROSSFADE_DURATION));
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

    public static void m(jb jbVar, int i10, org.telegram.ui.ActionBar.c6 c6Var, long j10, boolean z10) {
        long j11;
        jb jbVar2 = jbVar;
        c0 g10 = c0.g(i10);
        g10.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g10.l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
        b70 F = b70.F(jbVar2.containerView, c6Var, jbVar2.v);
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
                jbVar2 = jbVar;
                i11 = i12;
            }
            if (j11 == j10) {
                i11 = i12;
            } else {
                long j12 = jbVar2.A;
                F.g(tLObject, j11 == j12 || (j12 == 0 && j11 == UserConfig.getInstance(i10).getClientUserId()), new ua(jbVar2, j11, z10, 0));
                jbVar2 = jbVar;
                i11 = i12;
            }
        }
        F.t = false;
        F.Y = true;
        F.s = 0;
        F.V(5);
        F.Z();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void appendOpenAnimator(boolean z10, ArrayList arrayList) {
        Property property = View.ALPHA;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        b bVar = this.I;
        arrayList.add(ObjectAnimator.ofFloat(bVar, (Property<b, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(bVar, (Property<b, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(bVar, (Property<b, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        if (this.r.g0) {
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

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        Long myPaidReactionPeer;
        if (!this.N && !this.O) {
            this.O = true;
            MessageObject messageObject = this.G;
            if (messageObject != null && ((myPaidReactionPeer = messageObject.getMyPaidReactionPeer()) == null || myPaidReactionPeer.longValue() != this.A)) {
                messageObject.setMyPaidReactionDialogId(this.A);
                o7 b10 = o7.b(messageObject);
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
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new cf.a(this, 10));
            }
        }
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.dismissInternal();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean isTouchOutside(float f10, float f11) {
        b bVar = this.I;
        if (f10 < bVar.getX() || f10 > bVar.getX() + bVar.getWidth() || f11 < bVar.getY() || f11 > bVar.getY() + bVar.getHeight()) {
            return super.isTouchOutside(f10, f11);
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

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(final r7 r7Var) {
        View view;
        ig.r0 r0Var;
        jh.g2 g2Var;
        View view2;
        ig.r0 r0Var2;
        ig.o0 o0Var;
        ig.o0 o0Var2 = null;
        MessageObject messageObject = null;
        if (this.G != null && (view2 = this.P.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.Q;
            if (view3 instanceof org.telegram.ui.Cells.s1) {
                r0Var2 = ((org.telegram.ui.Cells.s1) view3).J;
                r0Var2.getClass();
                o0Var = r0Var2.m("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.v0) {
                r0Var2 = ((org.telegram.ui.Cells.v0) view3).y0;
                r0Var2.getClass();
                o0Var = r0Var2.m("stars");
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
                    ig.r0 r0Var3 = ((org.telegram.ui.Cells.s1) view3).J;
                    r0Var3.getClass();
                    r0Var2 = r0Var3;
                    o0Var2 = r0Var3.m("stars");
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
        ag.k kVar = this.F;
        pa paVar = new pa(this, 2);
        if (kVar.L) {
            paVar.run();
        } else {
            kVar.M = paVar;
        }
        if (o0Var2 != null) {
            o0Var2.l = false;
        }
        if (view4 != null) {
            view4.invalidate();
        }
        jh.n0[] n0VarArr = new jh.n0[1];
        if (this.d && (g2Var = this.J) != null) {
            n0VarArr[0] = g2Var.d(this.K);
        }
        ig.o0 o0Var3 = o0Var2;
        final RectF rectF2 = new RectF();
        final cg.h0 h0Var = new cg.h0(this, n0VarArr, iArr, rectF2, view4, r0Var, o0Var3, 5);
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hh.qa
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                h0Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                AndroidUtilities.lerp(rectF4, rectF5, floatValue, rectF6);
                jb jbVar = jb.this;
                ag.k kVar2 = jbVar.F;
                kVar2.setTranslationX(rectF6.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
                kVar2.setTranslationY(rectF6.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
                float lerp = AndroidUtilities.lerp(Math.max(rectF6.width() / AndroidUtilities.dp(150.0f), rectF6.height() / AndroidUtilities.dp(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                kVar2.setScaleX(lerp);
                kVar2.setScaleY(lerp);
                bg.a aVar = kVar2.b;
                aVar.d = 360.0f * floatValue;
                aVar.h = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (zArr2[0] || floatValue <= 0.95f) {
                    return;
                }
                zArr2[0] = true;
                LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                try {
                    jbVar.container.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                Runnable runnable = r7Var;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.R.addListener(new za(this, o0Var3, view4, n0VarArr, zArr, rectF2, r7Var));
        this.R.setDuration(800L);
        this.R.setInterpolator(new f2.b0(3));
        this.R.start();
    }

    public final boolean q() {
        if (!this.d) {
            c0 g10 = c0.g(this.c);
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
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.p = 0.42f;
        long j10 = this.A;
        org.telegram.ui.Components.n9 n9Var = this.w;
        if (j10 == UserObject.ANONYMOUS) {
            y8Var.g(21);
            int i10 = org.telegram.ui.ActionBar.g6.c8;
            org.telegram.ui.ActionBar.c6 c6Var = this.b;
            y8Var.i(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            n9Var.e(null, y8Var);
            return;
        }
        int i11 = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.A));
            y8Var.r(user);
            n9Var.e(user, y8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-this.A));
            y8Var.q(chat);
            n9Var.e(chat, y8Var);
        }
    }

    public final void t(long j10) {
        ib ibVar;
        long j11;
        long j12;
        long j13 = 0;
        if ((!this.d || this.e || j10 <= 0) && (ibVar = this.y) != null) {
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
                        cb cbVar = new cb();
                        cbVar.a = z10;
                        cbVar.b = false;
                        cbVar.c = peerDialogId;
                        cbVar.d = j15;
                        arrayList.add(cbVar);
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
                cb cbVar2 = new cb();
                cbVar2.a = z11;
                cbVar2.b = true;
                cbVar2.c = clientUserId;
                cbVar2.d = j16;
                arrayList.add(cbVar2);
            }
            Collections.sort(arrayList, new a5.f(20));
            ibVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}
