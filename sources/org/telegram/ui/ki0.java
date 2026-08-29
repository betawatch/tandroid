package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class ki0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float A;
    public final vh0 B;
    public final ci0 C;
    public final vh0 D;
    public long E;
    public org.telegram.ui.Components.n5 F;
    public final di0 G;
    public final uh0 H;
    public final gi0 I;
    public final ArrayList J;
    public int K;
    public final a0.h L;
    public org.telegram.ui.Cells.s1 M;
    public int N;
    public org.telegram.ui.Components.jf O;
    public final Paint P;
    public org.telegram.ui.Components.d Q;
    public org.telegram.ui.Components.vd R;
    public org.telegram.ui.Components.og S;
    public xh0 T;
    public int U;
    public ViewGroup V;
    public final wh0 W;
    public boolean X;
    public float Y;
    public FrameLayout Z;
    public final Context a;
    public yh0 a0;
    public final org.telegram.ui.ActionBar.c6 b;
    public boolean b0;
    public final int c;
    public boolean c0;
    public jf.s0 d;
    public boolean d0;
    public i0.b e;
    public final gh.j e0;
    public Bitmap f;
    public final qg.b f0;
    public final lg.a g0;
    public BitmapShader h;
    public RectF h0;
    public boolean i0;
    public boolean j0;
    public final int[] k0;
    public boolean l0;
    public boolean m0;
    public Paint n;
    public org.telegram.ui.Cells.s1 n0;
    public float o0;
    public float p0;
    public final Rect q0;
    public Matrix r;
    public ValueAnimator r0;
    public boolean s;
    public boolean s0;
    public org.telegram.ui.Cells.s1 t0;
    public org.telegram.ui.Components.zz0 u0;
    public boolean v;
    public Paint v0;
    public boolean w;
    public boolean x;
    public boolean y;

    public ki0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, R.style.TransparentDialog);
        int i10 = UserConfig.selectedAccount;
        this.c = i10;
        this.e = i0.b.e;
        this.J = new ArrayList();
        this.L = new a0.h();
        final int i11 = 1;
        this.P = new Paint(1);
        this.k0 = new int[2];
        final int i12 = 0;
        this.m0 = false;
        this.q0 = new Rect();
        this.a = context;
        this.b = c6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.C1;
        this.d = launchActivity != null ? new jf.s0(launchActivity, true) : null;
        vh0 vh0Var = new vh0(this, context, i11);
        this.B = vh0Var;
        this.e0 = gh.j.d(1, vh0Var, vh0Var);
        vh0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sh0
            public final /* synthetic */ ki0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.onBackPressed();
                        break;
                    default:
                        this.b.onBackPressed();
                        break;
                }
            }
        });
        vh0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: org.telegram.ui.th0
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                ki0 ki0Var = ki0.this;
                if (ki0Var.l0 || !(view2 instanceof EditText)) {
                    return;
                }
                AndroidUtilities.hideKeyboard(ki0Var.O);
                AndroidUtilities.runOnUIThread(new qh0(ki0Var, (EditText) view2, 0), 200L);
            }
        });
        qg.b bVar = new qg.b();
        this.f0 = bVar;
        lg.a aVar = new lg.a(bVar);
        this.g0 = aVar;
        aVar.d = new sg.i(vh0Var);
        aVar.e = vh0Var;
        ci0 ci0Var = new ci0(this, context, c6Var);
        this.C = ci0Var;
        ci0Var.setClipToPadding(false);
        vh0Var.addView(ci0Var, i7.f6.e(-1, -1, 119));
        h hVar = new h(this, 26);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(vh0Var, hVar);
        di0 di0Var = new di0(this, context, c6Var);
        this.G = di0Var;
        di0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sh0
            public final /* synthetic */ ki0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.onBackPressed();
                        break;
                    default:
                        this.b.onBackPressed();
                        break;
                }
            }
        });
        di0Var.setOnItemClickListener(new j(this, 17));
        di0Var.setOnScrollListener(new m3(this, 19));
        di0Var.setItemAnimator(new fi0(null, di0Var, c6Var));
        gi0 gi0Var = new gi0(this);
        this.I = gi0Var;
        gi0Var.O = new hi0(this);
        di0Var.setLayoutManager(gi0Var);
        di0Var.i(new ii0());
        uh0 uh0Var = new uh0(this, context, c6Var);
        this.H = uh0Var;
        di0Var.setAdapter(uh0Var);
        di0Var.setVerticalScrollBarEnabled(false);
        di0Var.setOverScrollMode(2);
        ci0Var.addView(di0Var, i7.f6.c(-2.0f, -1));
        vh0 vh0Var2 = new vh0(this, context, i12);
        this.D = vh0Var2;
        vh0Var.addView(vh0Var2, i7.f6.c(-1.0f, -1));
        this.W = new wh0(this, vh0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        jf.s0 s0Var = this.d;
        if (s0Var != null) {
            s0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.o2 o2Var) {
        kg.z zVar;
        if (this.a0 != null || o2Var == null) {
            return;
        }
        int i10 = this.c;
        MessagesController.getInstance(i10).getAvailableEffects();
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.Z = frameLayout;
        frameLayout.setClipChildren(false);
        this.Z.setClipToPadding(false);
        this.Z.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
        yh0 yh0Var = new yh0(5, this.c, getContext(), null, this.b);
        this.a0 = yh0Var;
        yh0Var.setClipChildren(false);
        this.a0.setClipToPadding(false);
        this.a0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
        this.a0.setDelegate(new ai0(this, o2Var));
        this.a0.setTop(false);
        this.a0.setClipChildren(false);
        this.a0.setClipToPadding(false);
        this.a0.setVisibility(0);
        this.a0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
        this.a0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
        this.a0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
        this.C.addView(this.Z, i7.f6.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.Z.addView(this.a0, i7.f6.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a0.setScaleY(0.4f);
        this.a0.setScaleX(0.4f);
        this.a0.setAlpha(0.0f);
        if (MessagesController.getInstance(i10).hasAvailableEffects()) {
            t();
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
        yh0 yh0Var2 = this.a0;
        if (yh0Var2 != null && !yh0Var2.b1) {
            yh0Var2.b1 = true;
            yh0Var2.c1 = true;
            kg.d0 d0Var = yh0Var2.t0;
            if (d0Var != null && (zVar = d0Var.m) != null && !zVar.G1) {
                zVar.G1 = true;
                zVar.H1 = true;
                a51 a51Var = zVar.d0;
                if (a51Var != null) {
                    a51Var.invalidate();
                }
                q41 q41Var = zVar.e0;
                if (q41Var != null) {
                    q41Var.invalidate();
                }
            }
        }
        new nh.w3(this.B, false, new x3(this, 9));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.c).hasAvailableEffects()) {
            t();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.m0) {
            return;
        }
        this.m0 = true;
        xh0 xh0Var = this.T;
        if (xh0Var != null) {
            xh0Var.invalidate();
        }
        org.telegram.ui.Components.og ogVar = this.S;
        if (ogVar != null) {
            ogVar.invalidate();
        }
        e(new ph0(this, 2), false);
        this.B.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        yh0 yh0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.r0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z11 = z10 && (viewGroup = this.V) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout);
        if (z11) {
            org.telegram.ui.ActionBar.o1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.V);
        }
        if (!z10 && (yh0Var = this.a0) != null && this.b0) {
            yh0Var.e();
            if (this.a0.getReactionsWindow() != null && this.a0.getReactionsWindow().a != null) {
                this.a0.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.a0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.w = true;
        this.v = !z10;
        this.G.invalidate();
        this.x = true;
        this.y = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A, z10 ? 1.0f : 0.0f);
        this.r0 = ofFloat;
        ofFloat.addUpdateListener(new bg.c1(11, this, z11));
        this.r0.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, runnable));
        this.r0.setInterpolator(org.telegram.ui.Components.jr.h);
        this.r0.setDuration(350L);
        this.r0.start();
    }

    public final void f(MessageObject messageObject) {
        MessageObject.GroupedMessages l10 = l(messageObject);
        if (l10 == null) {
            g(messageObject);
            return;
        }
        l10.calculate();
        ArrayList<MessageObject> arrayList = l10.messages;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            MessageObject messageObject2 = arrayList.get(i10);
            i10++;
            g(messageObject2);
        }
    }

    public final void g(MessageObject messageObject) {
        org.telegram.ui.Cells.s1 s1Var;
        di0 di0Var = this.G;
        if (di0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= di0Var.getChildCount()) {
                s1Var = null;
                break;
            }
            View childAt = di0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                s1Var = (org.telegram.ui.Cells.s1) childAt;
                if (s1Var.getMessageObject() == messageObject) {
                    break;
                }
            }
            i11++;
        }
        org.telegram.ui.Cells.s1 s1Var2 = s1Var;
        int i12 = -1;
        while (true) {
            ArrayList arrayList = this.J;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == messageObject) {
                i12 = (arrayList.size() - 1) - i10;
            }
            i10++;
        }
        if (s1Var2 == null) {
            di0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        s1Var2.X3(messageObject, s1Var2.getCurrentMessagesGroup(), s1Var2.m3(), s1Var2.n3(), s1Var2.h3(), false);
        di0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.s = z10;
        dismiss();
    }

    public final void i() {
        if (this.m0) {
            return;
        }
        this.m0 = true;
        gh.j.f(false);
        gh.j jVar = this.e0;
        if (jVar != null) {
            jVar.b(this.B);
        }
        super.dismiss();
        c();
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.m0;
    }

    public final void j(Canvas canvas, float f9, float f10, float f11, float f12) {
        if (this.u0 == null || this.v0 == null) {
            return;
        }
        float f13 = (f9 + f11) / 2.0f;
        float f14 = (f10 + f12) / 2.0f;
        float dp = AndroidUtilities.dp(28.0f) + this.u0.c;
        float dp2 = AndroidUtilities.dp(32.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        float f15 = dp / 2.0f;
        float f16 = f13 - f15;
        float f17 = dp2 / 2.0f;
        rectF.set(f16, f14 - f17, f13 + f15, f14 + f17);
        canvas.save();
        canvas.drawRoundRect(rectF, f17, f17, this.v0);
        this.u0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
        canvas.restore();
    }

    public final long k() {
        MessageObject messageObject;
        if (this.j0 || this.a0 == null) {
            return 0L;
        }
        if (this.h0 != null) {
            this.j0 = true;
            return this.E;
        }
        org.telegram.ui.Cells.s1 s1Var = this.M;
        if (s1Var == null || (messageObject = s1Var.getMessageObject()) == null) {
            return 0L;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if ((message.flags2 & 4) == 0) {
            return 0L;
        }
        this.j0 = true;
        return message.effect;
    }

    public final MessageObject.GroupedMessages l(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.L.f(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public final void n(boolean z10) {
        gi0 gi0Var;
        di0 di0Var = this.G;
        if (di0Var == null || di0Var.getAdapter() == null || (gi0Var = this.I) == null) {
            return;
        }
        int h = di0Var.getAdapter().h();
        gi0Var.i1(z10 ? h > 10 ? h % 10 : 0 : h - 1, AndroidUtilities.dp(12.0f), z10);
        this.s0 = z10;
    }

    public final void o(long j10) {
        TLRPC.TL_availableEffect effect;
        this.E = j10;
        boolean i10 = this.L.i();
        ArrayList arrayList = this.J;
        int size = (i10 || arrayList.size() < 10) ? 0 : arrayList.size() % 10;
        MessageObject messageObject = (size < 0 || size >= arrayList.size()) ? null : (MessageObject) arrayList.get(size);
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            message.flags2 |= 4;
            message.effect = j10;
        }
        if (this.a0 == null || (effect = MessagesController.getInstance(this.c).getEffect(j10)) == null) {
            return;
        }
        this.a0.setSelectedReactionAnimated(kg.q0.e(effect));
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.X) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.X = false;
            return;
        }
        yh0 yh0Var = this.a0;
        if (yh0Var == null || yh0Var.getReactionsWindow() == null) {
            this.j0 = true;
            super.onBackPressed();
        } else {
            if (this.a0.getReactionsWindow().C) {
                return;
            }
            this.a0.getReactionsWindow().d();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        vh0 vh0Var = this.B;
        setContentView(vh0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i10 | (-1945959040);
        window.setAttributes(attributes);
        vh0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(vh0Var, !org.telegram.ui.ActionBar.g6.I.q());
    }

    public final void p(org.telegram.ui.Components.j70 j70Var) {
        int i10 = org.telegram.ui.ActionBar.g6.E8;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        j70Var.T(org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        j70Var.Q(this.g0, pg.a.j(c6Var), false);
        ViewGroup viewGroup = j70Var.A;
        this.V = viewGroup;
        this.C.addView(viewGroup, i7.f6.c(-2.0f, -2));
    }

    public final void q(ArrayList arrayList) {
        a0.h hVar;
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.L;
            if (i12 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i12);
            if (messageObject.hasValidGroupId()) {
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) hVar.f(messageObject.getGroupIdForUse());
                if (groupedMessages == null) {
                    groupedMessages = new MessageObject.GroupedMessages();
                    groupedMessages.reversed = false;
                    long groupId = messageObject.getGroupId();
                    groupedMessages.groupId = groupId;
                    hVar.k(groupedMessages, groupId);
                }
                if (groupedMessages.getPosition(messageObject) == null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= groupedMessages.messages.size()) {
                            groupedMessages.messages.add(messageObject);
                            break;
                        } else if (groupedMessages.messages.get(i13).getId() == messageObject.getId()) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            } else if (messageObject.getGroupIdForUse() != 0) {
                messageObject.messageOwner.grouped_id = 0L;
                messageObject.localSentGroupId = 0L;
            }
            i12++;
        }
        for (int i14 = 0; i14 < hVar.m(); i14++) {
            ((MessageObject.GroupedMessages) hVar.n(i14)).calculate();
        }
        ArrayList arrayList2 = this.J;
        arrayList2.addAll(arrayList);
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            int i16 = this.K;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i15);
            if (getContext() == null) {
                i10 = i15;
                i11 = 0;
            } else {
                if (this.t0 == null) {
                    this.t0 = new org.telegram.ui.Cells.s1(getContext(), this.c, true, null, this.b);
                }
                org.telegram.ui.Cells.s1 s1Var = this.t0;
                s1Var.J7 = false;
                s1Var.L7 = false;
                s1Var.M7 = false;
                s1Var.N7 = false;
                s1Var.O7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                lh.x2 x2Var = s1Var.O0;
                x2Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = s1Var.i9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = s1Var.B9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = s1Var.n9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 == null || groupedMessages2.messages.size() == 1) {
                    i10 = i15;
                    s1Var.V3(messageObject2, groupedMessages2, false, false, false, false);
                    x2Var.setIgnoreImageSet(false);
                    imageReceiver.setIgnoreImageSet(false);
                    imageReceiver2.setIgnoreImageSet(false);
                    imageReceiver3.setIgnoreImageSet(false);
                    s1Var.n4();
                    i11 = s1Var.F8;
                } else {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    s1Var.se = 0;
                    i11 = 0;
                    for (int i17 = 0; i17 < groupedMessages2.messages.size(); i17++) {
                        MessageObject messageObject3 = groupedMessages2.messages.get(i17);
                        MessageObject.GroupedMessagePosition position = groupedMessages2.getPosition(messageObject3);
                        if (position != null && (position.flags & 4) != 0) {
                            s1Var.V3(messageObject3, groupedMessages2, false, false, false, false);
                            i11 += s1Var.F8;
                        }
                    }
                    i10 = i15;
                }
            }
            this.K = Math.max(i16, i11);
            i15 = i10 + 1;
        }
        di0 di0Var = this.G;
        di0Var.getAdapter().l();
        int h = di0Var.getAdapter().h();
        this.I.i1(h > 10 ? h % 10 : 0, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.og r(org.telegram.ui.Components.og ogVar, boolean z10, View.OnClickListener onClickListener) {
        this.S = ogVar;
        int[] iArr = this.k0;
        ogVar.getLocationOnScreen(iArr);
        xh0 xh0Var = new xh0(this, getContext(), ogVar.b, this.b, ogVar, z10);
        this.T = xh0Var;
        xh0Var.setScaleX(this.S.getScaleX());
        this.T.setScaleY(this.S.getScaleY());
        org.telegram.ui.Components.og ogVar2 = this.S;
        xh0 xh0Var2 = this.T;
        xh0Var2.A = ogVar2.A;
        xh0Var2.d0 = ogVar2.d0;
        xh0Var2.V.q(ogVar2.V.g, false, true);
        xh0Var2.W = ogVar2.W;
        xh0Var2.setEmoji(ogVar2.f.f[0]);
        xh0Var2.i(ogVar2.s, ogVar2.r, true);
        xh0Var2.L.d(ogVar2.L.c, true);
        xh0Var2.x.d(ogVar2.x.c, true);
        int i10 = ogVar2.E;
        int i11 = ogVar2.F;
        xh0Var2.E = i10;
        xh0Var2.F = i11;
        float f9 = ogVar2.I;
        float f10 = ogVar2.J;
        xh0Var2.I = f9;
        xh0Var2.J = f10;
        this.T.L.d(ogVar.L.c, true);
        this.T.setOnClickListener(onClickListener);
        this.C.addView(this.T, new ViewGroup.LayoutParams(ogVar.getWidth(), ogVar.getHeight()));
        org.telegram.ui.Components.og ogVar3 = this.S;
        ogVar.getHeight();
        this.U = ogVar3.m();
        int i12 = iArr[0];
        int width = this.S.getWidth();
        org.telegram.ui.Components.og ogVar4 = this.S;
        ogVar.getHeight();
        iArr[0] = b.C(6.0f, width - ogVar4.m(), i12);
        return this.T;
    }

    public final void s(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.u0 = j10 > 0 ? new org.telegram.ui.Components.zz0(jh.ia.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold()) : null;
        if (this.v0 == null) {
            Paint paint = new Paint(1);
            this.v0 = paint;
            paint.setColor(TLObject.FLAG_30);
        }
        this.G.invalidate();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.J;
            if (i10 >= arrayList.size()) {
                this.H.l();
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                messageMedia.spoiler = j10 > 0;
            }
            i10++;
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            gh.j.f(true);
            super.show();
            final float alpha = this.S.getAlpha();
            org.telegram.ui.Components.og ogVar = this.S;
            if (ogVar != null) {
                ogVar.setAlpha(0.0f);
            }
            org.telegram.ui.Components.yl0.d(new Utilities.Callback2() { // from class: org.telegram.ui.rh0
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    ki0 ki0Var = ki0.this;
                    qg.b bVar = ki0Var.f0;
                    Bitmap bitmap = (Bitmap) obj;
                    Bitmap bitmap2 = (Bitmap) obj2;
                    org.telegram.ui.Components.og ogVar2 = ki0Var.S;
                    if (ogVar2 != null) {
                        ogVar2.setAlpha(alpha);
                    }
                    ki0Var.f = bitmap;
                    Paint paint = new Paint(1);
                    ki0Var.n = paint;
                    Bitmap bitmap3 = ki0Var.f;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    ki0Var.h = bitmapShader;
                    paint.setShader(bitmapShader);
                    ki0Var.r = new Matrix();
                    bVar.a(bitmap2);
                    rg.c.c(bVar, ki0Var.B);
                    ViewGroup viewGroup = ki0Var.V;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                    }
                }
            });
            vh0 vh0Var = this.D;
            if (vh0Var != null) {
                vh0Var.bringToFront();
            }
            e(null, true);
        }
    }

    public final void t() {
        if (this.b0) {
            return;
        }
        this.c0 = false;
        this.b0 = true;
        this.a0.p(null, null, true);
        this.a0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.jr.h).start();
        this.a0.r(false);
    }

    public void m(long j10) {
    }
}
