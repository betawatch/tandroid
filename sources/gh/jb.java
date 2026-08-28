package gh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class jb extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public long A;
    public long B;
    public final ih.u0 C;
    public final ih.p0 D;
    public final dp E;
    public final dg.q F;
    public final MessageObject G;
    public final ArrayList H;
    public final b I;
    public ih.h2 J;
    public int K;
    public i3 L;
    public final eq[] M;
    public boolean N;
    public boolean O;
    public qn P;
    public View Q;
    public ValueAnimator R;
    public final org.telegram.ui.ActionBar.b6 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final LinearLayout f;
    public final FrameLayout h;
    public final LinearLayout n;
    public final va r;
    public final FrameLayout s;
    public final FrameLayout v;
    public final org.telegram.ui.Components.o9 w;
    public final kh.d x;
    public final ib y;

    public jb(Context context, final int i9, final long j10, qn qnVar, MessageObject messageObject, ArrayList arrayList, boolean z10, final boolean z11, long j11, final org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false);
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
        this.M = new eq[1];
        this.O = false;
        this.b = b6Var;
        this.c = i9;
        this.G = messageObject;
        this.H = arrayList;
        this.d = z11;
        this.e = z10;
        b bVar = new b(context, i9, b6Var);
        this.I = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        this.container.addView(bVar, g7.e6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        g7.g6.a(bVar);
        bVar.setOnClickListener(new fh.o(context, 1, b6Var));
        long clientUserId = UserConfig.getInstance(i9).getClientUserId();
        if (arrayList != null) {
            int size = arrayList.size();
            TLRPC.MessageReactor messageReactor4 = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
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
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((TLRPC.MessageReactor) arrayList.get(i11)).my) {
                        break;
                    }
                    i11++;
                }
            }
            messageReactor2 = messageReactor;
            this.A = j11;
        } else {
            messageReactor2 = messageReactor;
            this.A = v7.y(i9, false).B(messageObject);
        }
        long j13 = this.A;
        this.B = j13 != UserObject.ANONYMOUS ? j13 : clientUserId;
        fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, g7.e6.n(-1, -2));
        this.r = new va(this, context, b6Var, z11, i9);
        int i12 = 9;
        int[] iArr = {1, 50, 100, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2000, 5000, 7500, 10000};
        long j14 = MessagesController.getInstance(i9).starsPaidReactionAmountMax;
        ArrayList arrayList2 = new ArrayList();
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            int i14 = iArr[i13];
            if (i14 > j14) {
                arrayList2.add(Integer.valueOf((int) j14));
                break;
            }
            arrayList2.add(Integer.valueOf(i14));
            if (iArr[i13] == j14) {
                break;
            }
            i13++;
            i12 = 9;
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            iArr2[i15] = ((Integer) arrayList2.get(i15)).intValue();
        }
        va vaVar = this.r;
        vaVar.a0 = iArr2;
        if (z10 || z11) {
            if (!z10) {
                vaVar.setAlpha(0.5f);
            }
            this.h.addView(this.r, g7.e6.d(-1, -2.0f, 55, 0.0f, z11 ? -50.0f : 0.0f, 0.0f, (!z11 || z14) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.h.addView(linearLayout2, g7.e6.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i5, b6Var)));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.w = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        o9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        r();
        frameLayout3.addView(o9Var, g7.e6.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.r5, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, g7.e6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, g7.e6.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, g7.e6.p(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        g7.g6.a(frameLayout2);
        c0.g(i9).o();
        bg.t tVar = new bg.t(context, 1);
        int i16 = org.telegram.ui.ActionBar.f6.G6;
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i16, b6Var));
        tVar.setTextSize(1, 20.0f);
        tVar.setGravity(17);
        tVar.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        tVar.setTypeface(AndroidUtilities.bold());
        tVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(tVar, g7.e6.p(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        q(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.W5, b6Var), mode));
        g7.g6.a(imageView2);
        final int i17 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: gh.ra
            public final /* synthetic */ jb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        jb jbVar = this.b;
                        dp dpVar = jbVar.E;
                        dpVar.a(!dpVar.a.q, true);
                        jbVar.A = dpVar.a.q ? jbVar.B : UserObject.ANONYMOUS;
                        jbVar.r();
                        ib ibVar = jbVar.y;
                        if (ibVar != null) {
                            ibVar.setMyPrivacy(jbVar.A);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(imageView2, g7.e6.p(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.h.addView(linearLayout3, g7.e6.d(-1, -2.0f, 55, 0.0f, z11 ? 0.0f : z10 ? 179.0f : 45.0f, 0.0f, 15.0f));
        boolean z15 = z14;
        TLRPC.Chat chat2 = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
        TextView textView = new TextView(context);
        ll.n(i16, b6Var, textView, 1, 14.0f);
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
            int i18 = R.string.StarsReactionText;
            String str = chat2 == null ? "" : chat2.title;
            chat = chat2;
            z13 = false;
            formatString = LocaleController.formatString(i18, str);
        }
        textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(formatString), textView.getPaint().getFontMetricsInt(), z13));
        if (z10 && !z11) {
            linearLayout3.addView(textView, g7.e6.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z12) {
            if (!z11) {
                linearLayout3.addView(new wa(context, b6Var), g7.e6.t(-1, 30, 55, 0, 20, 0, 0));
            }
            ib ibVar = new ib(this, context, z11);
            this.y = ibVar;
            ibVar.setOnSenderClickListener(new Utilities.Callback() { // from class: gh.sa
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj2) {
                    Long l10 = (Long) obj2;
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    long longValue = l10.longValue();
                    jb jbVar = jb.this;
                    boolean z16 = z11;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l10.longValue());
                        if (l10.longValue() == UserConfig.getInstance(i9).getClientUserId()) {
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
            this.f.addView(ibVar, g7.e6.k(0.0f, z11 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, b6Var));
            if (!z11 && (z10 || messageReactor3 != null)) {
                this.f.addView(view, g7.e6.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.y = null;
        }
        if (z11) {
            int i19 = org.telegram.ui.ActionBar.f6.j5;
            TextView b10 = g7.i6.b(context, 20.0f, i19, true, b6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(z10 ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.f.addView(b10, g7.e6.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = g7.i6.b(context, 14.0f, i19, false, b6Var);
            b11.setGravity(17);
            ll.q(z10 ? R.string.LiveStoryReactText : z12 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText, new Object[]{DialogObject.getName(j10)}, b11);
            this.f.addView(b11, g7.e6.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            ih.u0 u0Var = new ih.u0();
            this.C = u0Var;
            u0Var.c = this.A;
            u0Var.g = 50L;
            u0Var.e = true;
            ih.p0 p0Var = new ih.p0(i9, context, true);
            this.D = p0Var;
            p0Var.set(u0Var);
            this.f.addView(p0Var, g7.e6.t(-2, -2, 17, 32, 0, 32, 20));
        }
        dp dpVar = new dp(context, 21, b6Var);
        this.E = dpVar;
        dpVar.b(org.telegram.ui.ActionBar.f6.h7, org.telegram.ui.ActionBar.f6.j7, org.telegram.ui.ActionBar.f6.k7);
        dpVar.setDrawUnchecked(true);
        dpVar.a(this.A != UserObject.ANONYMOUS, false);
        ib ibVar2 = this.y;
        if (ibVar2 != null) {
            ibVar2.setMyPrivacy(this.A);
        }
        dpVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        ll.n(i16, b6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(dpVar, g7.e6.t(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, g7.e6.q(-2, -2, 16));
        final int i20 = 1;
        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: gh.ra
            public final /* synthetic */ jb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i20) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        jb jbVar = this.b;
                        dp dpVar2 = jbVar.E;
                        dpVar2.a(!dpVar2.a.q, true);
                        jbVar.A = dpVar2.a.q ? jbVar.B : UserObject.ANONYMOUS;
                        jbVar.r();
                        ib ibVar3 = jbVar.y;
                        if (ibVar3 != null) {
                            ibVar3.setMyPrivacy(jbVar.A);
                            break;
                        }
                        break;
                }
            }
        });
        g7.g6.b(linearLayout4, 0.05f, 1.2f);
        linearLayout4.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 6, 6));
        if (!z11 && (z10 || messageReactor3 != null)) {
            this.f.addView(linearLayout4, g7.e6.t(-2, -2, 1, 0, z12 ? 10 : 4, 0, 10));
        }
        kh.d dVar = new kh.d(context, b6Var, true);
        this.x = dVar;
        dVar.e();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f.addView(dVar, g7.e6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        s(0L);
        dVar.g(oa.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.M), true, true);
        if (z10) {
            j12 = 0;
            f10 = 1.0f;
            context2 = context;
            dVar.setOnClickListener(new u8(this, messageObject, qnVar, i9, z11, context, b6Var, j10, chat));
        } else {
            context2 = context;
            j12 = 0;
            f10 = 1.0f;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: gh.ta
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jb.m(jb.this, i9, b6Var, j10, z11);
            }
        });
        l80 l80Var = new l80(context2, b6Var);
        l80Var.setTextSize(1, 13.0f);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, b6Var));
        if (!z11 || z10) {
            l80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new e2.f(context2, 10)));
        } else {
            l80Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        }
        l80Var.setGravity(17);
        l80Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.k5));
        if (z10 || z11) {
            this.f.addView(l80Var, g7.e6.t(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f);
        dg.q qVar = new dg.q(context2, 1, 2, 1);
        this.F = qVar;
        ag.a aVar = qVar.b;
        aVar.w = org.telegram.ui.ActionBar.f6.fk;
        aVar.x = org.telegram.ui.ActionBar.f6.gk;
        aVar.b();
        qVar.b.h = f10;
        qVar.setVisibility(4);
        qVar.setPaused(true);
        this.container.addView(qVar, g7.e6.c(150.0f, ImageReceiver.DEFAULT_CROSSFADE_DURATION));
        this.r.setValue(50);
        if (arrayList != null) {
            long j15 = j12;
            for (int i21 = 0; i21 < arrayList.size(); i21++) {
                long j16 = ((TLRPC.MessageReactor) arrayList.get(i21)).count;
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

    public static void m(jb jbVar, int i9, org.telegram.ui.ActionBar.b6 b6Var, long j10, boolean z10) {
        long j11;
        jb jbVar2 = jbVar;
        c0 g10 = c0.g(i9);
        g10.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g10.l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i9).getCurrentUser());
        x60 F = x60.F(jbVar2.containerView, b6Var, jbVar2.v);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject instanceof TLRPC.User) {
                j11 = ((TLRPC.User) tLObject).id;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        j11 = -chat.id;
                    } else {
                        i10 = i11;
                    }
                }
                jbVar2 = jbVar;
                i10 = i11;
            }
            if (j11 == j10) {
                i10 = i11;
            } else {
                long j12 = jbVar2.A;
                F.g(tLObject, j11 == j12 || (j12 == 0 && j11 == UserConfig.getInstance(i9).getClientUserId()), new ua(jbVar2, j11, z10, 0));
                jbVar2 = jbVar;
                i10 = i11;
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.adminedChannelsLoaded) {
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
                p7 b10 = p7.b(messageObject);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i9 = this.c;
                MessagesController messagesController = MessagesController.getInstance(i9);
                long j10 = b10.a;
                int i10 = b10.b;
                tL_messages_togglePaidReactionPrivacy.peer = messagesController.getInputPeer(j10);
                tL_messages_togglePaidReactionPrivacy.msg_id = i10;
                long j11 = this.A;
                if (j11 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j11 == UserObject.ANONYMOUS) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = MessagesController.getInstance(i9).getInputPeer(this.A);
                }
                NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(b10.a), Integer.valueOf(i10), Long.valueOf(this.A));
                ConnectionsManager.getInstance(i9).sendRequest(tL_messages_togglePaidReactionPrivacy, new bf.a(this, 10));
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
    public final boolean isTouchOutside(float f10, float f11) {
        b bVar = this.I;
        if (f10 < bVar.getX() || f10 > bVar.getX() + bVar.getWidth() || f11 < bVar.getY() || f11 > bVar.getY() + bVar.getHeight()) {
            return super.isTouchOutside(f10, f11);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(final s7 s7Var) {
        View view;
        hg.s0 s0Var;
        ih.h2 h2Var;
        View view2;
        hg.s0 s0Var2;
        hg.p0 p0Var;
        hg.p0 p0Var2 = null;
        MessageObject messageObject = null;
        if (this.G != null && (view2 = this.P.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.Q;
            if (view3 instanceof org.telegram.ui.Cells.t1) {
                s0Var2 = ((org.telegram.ui.Cells.t1) view3).J;
                s0Var2.getClass();
                p0Var = s0Var2.m("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.w0) {
                s0Var2 = ((org.telegram.ui.Cells.w0) view3).y0;
                s0Var2.getClass();
                p0Var = s0Var2.m("stars");
            } else {
                s0Var2 = null;
                p0Var = null;
            }
            if (p0Var == null && s0Var2 != null) {
                MessageObject.GroupedMessages X8 = this.P.X8(this.G);
                if (X8 != null && !X8.posArray.isEmpty()) {
                    ArrayList<MessageObject> arrayList = X8.messages;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size) {
                            break;
                        }
                        MessageObject messageObject2 = arrayList.get(i9);
                        i9++;
                        MessageObject messageObject3 = messageObject2;
                        MessageObject.GroupedMessagePosition position = X8.getPosition(messageObject3);
                        if (position != null) {
                            int i10 = position.flags;
                            if ((i10 & 1) != 0 && (i10 & 8) != 0) {
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
                if (view3 instanceof org.telegram.ui.Cells.t1) {
                    hg.s0 s0Var3 = ((org.telegram.ui.Cells.t1) view3).J;
                    s0Var3.getClass();
                    s0Var2 = s0Var3;
                    p0Var2 = s0Var3.m("stars");
                    if (p0Var2 != null) {
                        return;
                    }
                    s0Var = s0Var2;
                    view = view3;
                }
            }
            p0Var2 = p0Var;
            if (p0Var2 != null) {
            }
        } else {
            if (this.J == null) {
                return;
            }
            view = null;
            s0Var = null;
        }
        View view4 = view;
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        this.r.getLocationInWindow(iArr);
        rectF.set(this.r.C.getBounds());
        rectF.inset(-AndroidUtilities.dp(3.5f), -AndroidUtilities.dp(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        dg.q qVar = this.F;
        pa paVar = new pa(this, 2);
        if (qVar.L) {
            paVar.run();
        } else {
            qVar.M = paVar;
        }
        if (p0Var2 != null) {
            p0Var2.l = false;
        }
        if (view4 != null) {
            view4.invalidate();
        }
        ih.p0[] p0VarArr = new ih.p0[1];
        if (this.d && (h2Var = this.J) != null) {
            p0VarArr[0] = h2Var.d(this.K);
        }
        hg.p0 p0Var3 = p0Var2;
        final RectF rectF2 = new RectF();
        final bg.k0 k0Var = new bg.k0(this, p0VarArr, iArr, rectF2, view4, s0Var, p0Var3, 5);
        k0Var.run();
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gh.qa
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                k0Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                AndroidUtilities.lerp(rectF4, rectF5, floatValue, rectF6);
                jb jbVar = jb.this;
                dg.q qVar2 = jbVar.F;
                qVar2.setTranslationX(rectF6.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
                qVar2.setTranslationY(rectF6.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
                float lerp = AndroidUtilities.lerp(Math.max(rectF6.width() / AndroidUtilities.dp(150.0f), rectF6.height() / AndroidUtilities.dp(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                qVar2.setScaleX(lerp);
                qVar2.setScaleY(lerp);
                ag.a aVar = qVar2.b;
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
                Runnable runnable = s7Var;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.R.addListener(new za(this, p0Var3, view4, p0VarArr, zArr, rectF2, s7Var));
        this.R.setDuration(800L);
        this.R.setInterpolator(new f2.c0(3));
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
            c0 g10 = c0.g(this.c);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
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
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.p = 0.42f;
        long j10 = this.A;
        org.telegram.ui.Components.o9 o9Var = this.w;
        if (j10 == UserObject.ANONYMOUS) {
            z8Var.g(21);
            int i9 = org.telegram.ui.ActionBar.f6.c8;
            org.telegram.ui.ActionBar.b6 b6Var = this.b;
            z8Var.i(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
            o9Var.e(null, z8Var);
            return;
        }
        int i10 = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.A));
            z8Var.r(user);
            o9Var.e(user, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-this.A));
            z8Var.q(chat);
            o9Var.e(chat, z8Var);
        }
    }

    public final void s(long j10) {
        ib ibVar;
        long j11;
        long j12;
        long j13 = 0;
        if ((!this.d || this.e || j10 <= 0) && (ibVar = this.y) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.c).getClientUserId();
            int i9 = 1;
            ArrayList arrayList2 = this.H;
            if (arrayList2 != null) {
                j12 = 0;
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(messageReactor.peer_id);
                    long j14 = j13;
                    boolean z10 = messageReactor.anonymous;
                    if (z10) {
                        peerDialogId = messageReactor.my ? clientUserId : (-i10) - i9;
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
                    i10++;
                    j13 = j14;
                    i9 = 1;
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
            Collections.sort(arrayList, new a5.e(19));
            ibVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}
