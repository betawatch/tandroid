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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public class cj0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public final ni0 F;
    public final ui0 G;
    public final ni0 H;
    public long I;
    public org.telegram.ui.Components.o5 J;
    public final vi0 K;
    public final mi0 L;
    public final yi0 M;
    public final ArrayList N;
    public int O;
    public final a0.i P;
    public org.telegram.ui.Cells.u1 Q;
    public int R;
    public org.telegram.ui.Components.pf S;
    public final Paint T;
    public org.telegram.ui.Components.d U;
    public org.telegram.ui.Components.ce V;
    public org.telegram.ui.Components.ug W;
    public pi0 X;
    public int Y;
    public ViewGroup Z;
    public final Context a;
    public final oi0 a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public boolean b0;
    public final int c;
    public float c0;
    public lb0 d;
    public FrameLayout d0;
    public i0.b e;
    public qi0 e0;
    public Bitmap f;
    public boolean f0;
    public boolean g0;
    public BitmapShader h;
    public boolean h0;
    public final vh.g i0;
    public final fh.b j0;
    public final ah.c k0;
    public RectF l0;
    public boolean m0;
    public Paint n;
    public boolean n0;
    public final int[] o0;
    public boolean p0;
    public boolean q0;
    public Matrix r;
    public org.telegram.ui.Cells.u1 r0;
    public boolean s;
    public float s0;
    public float t0;
    public final Rect u0;
    public boolean v;
    public ValueAnimator v0;
    public boolean w;
    public boolean w0;
    public boolean x;
    public org.telegram.ui.Cells.u1 x0;
    public boolean y;
    public org.telegram.ui.Components.v01 y0;
    public Paint z0;

    public cj0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, R.style.TransparentDialog);
        int i10 = UserConfig.selectedAccount;
        this.c = i10;
        this.e = i0.b.e;
        this.N = new ArrayList();
        this.P = new a0.i();
        final int i11 = 1;
        this.T = new Paint(1);
        this.o0 = new int[2];
        final int i12 = 0;
        this.q0 = false;
        this.u0 = new Rect();
        this.a = context;
        this.b = e6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        LaunchActivity launchActivity = LaunchActivity.G1;
        this.d = launchActivity != null ? new lb0(launchActivity, true) : null;
        ni0 ni0Var = new ni0(this, context, i11);
        this.F = ni0Var;
        this.i0 = vh.g.d(1, ni0Var, ni0Var);
        ni0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ki0
            public final /* synthetic */ cj0 b;

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
        ni0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: org.telegram.ui.li0
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                cj0 cj0Var = cj0.this;
                if (cj0Var.p0 || !(view2 instanceof EditText)) {
                    return;
                }
                AndroidUtilities.hideKeyboard(cj0Var.S);
                AndroidUtilities.runOnUIThread(new ii0(cj0Var, (EditText) view2, 0), 200L);
            }
        });
        fh.b bVar = new fh.b();
        this.j0 = bVar;
        ah.c cVar = new ah.c(bVar);
        this.k0 = cVar;
        cVar.f = new hh.k(ni0Var);
        cVar.g = ni0Var;
        ui0 ui0Var = new ui0(this, context, e6Var);
        this.G = ui0Var;
        ui0Var.setClipToPadding(false);
        ni0Var.addView(ui0Var, w7.y5.e(-1, -1, 119));
        g gVar = new g(this, 26);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(ni0Var, gVar);
        vi0 vi0Var = new vi0(this, context, e6Var);
        this.K = vi0Var;
        vi0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ki0
            public final /* synthetic */ cj0 b;

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
        vi0Var.setOnItemClickListener(new i(this, 17));
        vi0Var.setOnScrollListener(new h3(this, 19));
        vi0Var.setItemAnimator(new xi0(null, vi0Var, e6Var));
        yi0 yi0Var = new yi0(this);
        this.M = yi0Var;
        yi0Var.O = new zi0(this);
        vi0Var.setLayoutManager(yi0Var);
        vi0Var.i(new aj0());
        mi0 mi0Var = new mi0(this, context, e6Var);
        this.L = mi0Var;
        vi0Var.setAdapter(mi0Var);
        vi0Var.setVerticalScrollBarEnabled(false);
        vi0Var.setOverScrollMode(2);
        ui0Var.addView(vi0Var, w7.y5.c(-2.0f, -1));
        ni0 ni0Var2 = new ni0(this, context, i12);
        this.H = ni0Var2;
        ni0Var.addView(ni0Var2, w7.y5.c(-1.0f, -1));
        this.a0 = new oi0(this, ni0Var2, i10);
    }

    public final void c() {
        NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        lb0 lb0Var = this.d;
        if (lb0Var != null) {
            lb0Var.destroy();
            this.d = null;
        }
    }

    public final void d(org.telegram.ui.ActionBar.n2 n2Var) {
        zg.x xVar;
        if (this.e0 != null || n2Var == null) {
            return;
        }
        int i10 = this.c;
        MessagesController.getInstance(i10).getAvailableEffects();
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.d0 = frameLayout;
        frameLayout.setClipChildren(false);
        this.d0.setClipToPadding(false);
        this.d0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
        qi0 qi0Var = new qi0(5, this.c, getContext(), null, this.b);
        this.e0 = qi0Var;
        qi0Var.setClipChildren(false);
        this.e0.setClipToPadding(false);
        this.e0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
        this.e0.setDelegate(new si0(this, n2Var));
        this.e0.setTop(false);
        this.e0.setClipChildren(false);
        this.e0.setClipToPadding(false);
        this.e0.setVisibility(0);
        this.e0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
        this.e0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
        this.e0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
        this.G.addView(this.d0, w7.y5.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.d0.addView(this.e0, w7.y5.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.e0.setScaleY(0.4f);
        this.e0.setScaleX(0.4f);
        this.e0.setAlpha(0.0f);
        if (MessagesController.getInstance(i10).hasAvailableEffects()) {
            t();
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
        qi0 qi0Var2 = this.e0;
        if (qi0Var2 != null && !qi0Var2.f1) {
            qi0Var2.f1 = true;
            qi0Var2.g1 = true;
            zg.b0 b0Var = qi0Var2.x0;
            if (b0Var != null && (xVar = b0Var.m) != null && !xVar.K1) {
                xVar.K1 = true;
                xVar.L1 = true;
                d61 d61Var = xVar.h0;
                if (d61Var != null) {
                    d61Var.invalidate();
                }
                t51 t51Var = xVar.i0;
                if (t51Var != null) {
                    t51Var.invalidate();
                }
            }
        }
        new ci.j4(this.F, false, new s3(this, 9));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.c).hasAvailableEffects()) {
            t();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.q0) {
            return;
        }
        this.q0 = true;
        pi0 pi0Var = this.X;
        if (pi0Var != null) {
            pi0Var.invalidate();
        }
        org.telegram.ui.Components.ug ugVar = this.W;
        if (ugVar != null) {
            ugVar.invalidate();
        }
        e(new hi0(this, 2), false);
        this.F.invalidate();
        c();
    }

    public final void e(Runnable runnable, boolean z10) {
        qi0 qi0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.v0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z11 = z10 && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout);
        if (z11) {
            org.telegram.ui.ActionBar.n1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        if (!z10 && (qi0Var = this.e0) != null && this.f0) {
            qi0Var.e();
            if (this.e0.getReactionsWindow() != null && this.e0.getReactionsWindow().a != null) {
                this.e0.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.e0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.w = true;
        this.v = !z10;
        this.K.invalidate();
        this.x = true;
        this.y = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.v0 = ofFloat;
        ofFloat.addUpdateListener(new ai.bb(9, this, z11));
        this.v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.v0.setInterpolator(org.telegram.ui.Components.qr.h);
        this.v0.setDuration(350L);
        this.v0.start();
    }

    public final void f(MessageObject messageObject) {
        MessageObject.GroupedMessages l4 = l(messageObject);
        if (l4 == null) {
            g(messageObject);
            return;
        }
        l4.calculate();
        ArrayList<MessageObject> arrayList = l4.messages;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            MessageObject messageObject2 = arrayList.get(i10);
            i10++;
            g(messageObject2);
        }
    }

    public final void g(MessageObject messageObject) {
        org.telegram.ui.Cells.u1 u1Var;
        vi0 vi0Var = this.K;
        if (vi0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= vi0Var.getChildCount()) {
                u1Var = null;
                break;
            }
            View childAt = vi0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                u1Var = (org.telegram.ui.Cells.u1) childAt;
                if (u1Var.getMessageObject() == messageObject) {
                    break;
                }
            }
            i11++;
        }
        org.telegram.ui.Cells.u1 u1Var2 = u1Var;
        int i12 = -1;
        while (true) {
            ArrayList arrayList = this.N;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == messageObject) {
                i12 = (arrayList.size() - 1) - i10;
            }
            i10++;
        }
        if (u1Var2 == null) {
            vi0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        u1Var2.X3(messageObject, u1Var2.getCurrentMessagesGroup(), u1Var2.m3(), u1Var2.n3(), u1Var2.h3(), false);
        vi0Var.getAdapter().m(i12);
    }

    public final void h(boolean z10) {
        this.s = z10;
        dismiss();
    }

    public final void i() {
        if (this.q0) {
            return;
        }
        this.q0 = true;
        vh.g.f(false);
        vh.g gVar = this.i0;
        if (gVar != null) {
            gVar.b(this.F);
        }
        super.dismiss();
        c();
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.q0;
    }

    public final void j(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.y0 == null || this.z0 == null) {
            return;
        }
        float f13 = (f7 + f11) / 2.0f;
        float f14 = (f10 + f12) / 2.0f;
        float dp = AndroidUtilities.dp(28.0f) + this.y0.c;
        float dp2 = AndroidUtilities.dp(32.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        float f15 = dp / 2.0f;
        float f16 = f13 - f15;
        float f17 = dp2 / 2.0f;
        rectF.set(f16, f14 - f17, f13 + f15, f14 + f17);
        canvas.save();
        canvas.drawRoundRect(rectF, f17, f17, this.z0);
        this.y0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
        canvas.restore();
    }

    public final long k() {
        MessageObject messageObject;
        if (this.n0 || this.e0 == null) {
            return 0L;
        }
        if (this.l0 != null) {
            this.n0 = true;
            return this.I;
        }
        org.telegram.ui.Cells.u1 u1Var = this.Q;
        if (u1Var == null || (messageObject = u1Var.getMessageObject()) == null) {
            return 0L;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if ((message.flags2 & 4) == 0) {
            return 0L;
        }
        this.n0 = true;
        return message.effect;
    }

    public final MessageObject.GroupedMessages l(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.P.f(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public final void n(boolean z10) {
        yi0 yi0Var;
        vi0 vi0Var = this.K;
        if (vi0Var == null || vi0Var.getAdapter() == null || (yi0Var = this.M) == null) {
            return;
        }
        int h = vi0Var.getAdapter().h();
        yi0Var.i1(z10 ? h > 10 ? h % 10 : 0 : h - 1, AndroidUtilities.dp(12.0f), z10);
        this.w0 = z10;
    }

    public final void o(long j3) {
        TLRPC.TL_availableEffect effect;
        this.I = j3;
        boolean i10 = this.P.i();
        ArrayList arrayList = this.N;
        int size = (i10 || arrayList.size() < 10) ? 0 : arrayList.size() % 10;
        MessageObject messageObject = (size < 0 || size >= arrayList.size()) ? null : (MessageObject) arrayList.get(size);
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            message.flags2 |= 4;
            message.effect = j3;
        }
        if (this.e0 == null || (effect = MessagesController.getInstance(this.c).getEffect(j3)) == null) {
            return;
        }
        this.e0.setSelectedReactionAnimated(zg.o0.e(effect));
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.b0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.b0 = false;
            return;
        }
        qi0 qi0Var = this.e0;
        if (qi0Var == null || qi0Var.getReactionsWindow() == null) {
            this.n0 = true;
            super.onBackPressed();
        } else {
            if (this.e0.getReactionsWindow().C) {
                return;
            }
            this.e0.getReactionsWindow().d();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ni0 ni0Var = this.F;
        setContentView(ni0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i10 | (-1945959040);
        window.setAttributes(attributes);
        ni0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(ni0Var, !org.telegram.ui.ActionBar.j6.I.q());
    }

    public final void p(org.telegram.ui.Components.w70 w70Var) {
        int i10 = org.telegram.ui.ActionBar.j6.E8;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        w70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, e6Var)));
        w70Var.Q(this.k0, eh.b.k(e6Var), false);
        ViewGroup viewGroup = w70Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, w7.y5.c(-2.0f, -2));
    }

    public final void q(ArrayList arrayList) {
        a0.i iVar;
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            int size = arrayList.size();
            iVar = this.P;
            if (i12 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i12);
            if (messageObject.hasValidGroupId()) {
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) iVar.f(messageObject.getGroupIdForUse());
                if (groupedMessages == null) {
                    groupedMessages = new MessageObject.GroupedMessages();
                    groupedMessages.reversed = false;
                    long groupId = messageObject.getGroupId();
                    groupedMessages.groupId = groupId;
                    iVar.k(groupedMessages, groupId);
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
        for (int i14 = 0; i14 < iVar.m(); i14++) {
            ((MessageObject.GroupedMessages) iVar.n(i14)).calculate();
        }
        ArrayList arrayList2 = this.N;
        arrayList2.addAll(arrayList);
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            int i16 = this.O;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i15);
            if (getContext() == null) {
                i10 = i15;
                i11 = 0;
            } else {
                if (this.x0 == null) {
                    this.x0 = new org.telegram.ui.Cells.u1(getContext(), this.c, true, null, this.b);
                }
                org.telegram.ui.Cells.u1 u1Var = this.x0;
                u1Var.N7 = false;
                u1Var.P7 = false;
                u1Var.Q7 = false;
                u1Var.R7 = false;
                u1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupId());
                ai.l4 l4Var = u1Var.S0;
                l4Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = u1Var.m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = u1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = u1Var.r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 == null || groupedMessages2.messages.size() == 1) {
                    i10 = i15;
                    u1Var.V3(messageObject2, groupedMessages2, false, false, false, false);
                    l4Var.setIgnoreImageSet(false);
                    imageReceiver.setIgnoreImageSet(false);
                    imageReceiver2.setIgnoreImageSet(false);
                    imageReceiver3.setIgnoreImageSet(false);
                    u1Var.n4();
                    i11 = u1Var.J8;
                } else {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    u1Var.xe = 0;
                    i11 = 0;
                    for (int i17 = 0; i17 < groupedMessages2.messages.size(); i17++) {
                        MessageObject messageObject3 = groupedMessages2.messages.get(i17);
                        MessageObject.GroupedMessagePosition position = groupedMessages2.getPosition(messageObject3);
                        if (position != null && (position.flags & 4) != 0) {
                            u1Var.V3(messageObject3, groupedMessages2, false, false, false, false);
                            i11 += u1Var.J8;
                        }
                    }
                    i10 = i15;
                }
            }
            this.O = Math.max(i16, i11);
            i15 = i10 + 1;
        }
        vi0 vi0Var = this.K;
        vi0Var.getAdapter().l();
        int h = vi0Var.getAdapter().h();
        this.M.i1(h > 10 ? h % 10 : 0, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.ug r(org.telegram.ui.Components.ug ugVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = ugVar;
        int[] iArr = this.o0;
        ugVar.getLocationOnScreen(iArr);
        pi0 pi0Var = new pi0(this, getContext(), ugVar.b, this.b, ugVar, z10);
        this.X = pi0Var;
        pi0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.ug ugVar2 = this.W;
        pi0 pi0Var2 = this.X;
        pi0Var2.E = ugVar2.E;
        pi0Var2.h0 = ugVar2.h0;
        pi0Var2.c0.q(ugVar2.c0.g, false, true);
        pi0Var2.d0 = ugVar2.d0;
        pi0Var2.setEmoji(ugVar2.f.f[0]);
        pi0Var2.i(ugVar2.s, ugVar2.r, true);
        pi0Var2.P.d(ugVar2.P.c, true);
        pi0Var2.x.d(ugVar2.x.c, true);
        int i10 = ugVar2.I;
        int i11 = ugVar2.J;
        pi0Var2.I = i10;
        pi0Var2.J = i11;
        float f7 = ugVar2.M;
        float f10 = ugVar2.N;
        pi0Var2.M = f7;
        pi0Var2.N = f10;
        this.X.P.d(ugVar.P.c, true);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(ugVar.getWidth(), ugVar.getHeight()));
        org.telegram.ui.Components.ug ugVar3 = this.W;
        ugVar.getHeight();
        this.Y = ugVar3.m();
        int i12 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.ug ugVar4 = this.W;
        ugVar.getHeight();
        iArr[0] = org.telegram.messenger.wh.D(6.0f, width - ugVar4.m(), i12);
        return this.X;
    }

    public final void s(long j3) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.y0 = j3 > 0 ? new org.telegram.ui.Components.v01(yh.v7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold()) : null;
        if (this.z0 == null) {
            Paint paint = new Paint(1);
            this.z0 = paint;
            paint.setColor(TLObject.FLAG_30);
        }
        this.K.invalidate();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i10 >= arrayList.size()) {
                this.L.l();
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                messageMedia.spoiler = j3 > 0;
            }
            i10++;
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            vh.g.f(true);
            super.show();
            final float alpha = this.W.getAlpha();
            org.telegram.ui.Components.ug ugVar = this.W;
            if (ugVar != null) {
                ugVar.setAlpha(0.0f);
            }
            org.telegram.ui.Components.nm0.d(new Utilities.Callback2() { // from class: org.telegram.ui.ji0
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    cj0 cj0Var = cj0.this;
                    fh.b bVar = cj0Var.j0;
                    Bitmap bitmap = (Bitmap) obj;
                    Bitmap bitmap2 = (Bitmap) obj2;
                    org.telegram.ui.Components.ug ugVar2 = cj0Var.W;
                    if (ugVar2 != null) {
                        ugVar2.setAlpha(alpha);
                    }
                    cj0Var.f = bitmap;
                    Paint paint = new Paint(1);
                    cj0Var.n = paint;
                    Bitmap bitmap3 = cj0Var.f;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    cj0Var.h = bitmapShader;
                    paint.setShader(bitmapShader);
                    cj0Var.r = new Matrix();
                    bVar.a(bitmap2);
                    gh.d.c(bVar, cj0Var.F);
                    ViewGroup viewGroup = cj0Var.Z;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                    }
                }
            });
            ni0 ni0Var = this.H;
            if (ni0Var != null) {
                ni0Var.bringToFront();
            }
            e(null, true);
        }
    }

    public final void t() {
        if (this.f0) {
            return;
        }
        this.g0 = false;
        this.f0 = true;
        this.e0.p(null, null, true);
        this.e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.qr.h).start();
        this.e0.r(false);
    }

    public void m(long j3) {
    }
}
