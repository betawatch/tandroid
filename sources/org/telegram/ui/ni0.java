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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class ni0 extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    public final yh0 E;
    public final fi0 F;
    public final yh0 G;
    public long H;
    public org.telegram.ui.Components.r5 I;
    public final gi0 J;
    public final xh0 K;
    public final ji0 L;
    public final ArrayList M;
    public int N;
    public final a0.h O;
    public org.telegram.ui.Cells.s1 P;
    public int Q;
    public org.telegram.ui.Components.pf R;
    public final Paint S;
    public org.telegram.ui.Components.d T;
    public org.telegram.ui.Components.ce U;
    public org.telegram.ui.Components.vg V;
    public ai0 W;
    public int X;
    public ViewGroup Y;
    public final zh0 Z;
    public final Context a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.u6 b;
    public float b0;
    public final int c;
    public FrameLayout c0;
    public i0.b d;
    public bi0 d0;
    public Bitmap e;
    public boolean e0;
    public BitmapShader f;
    public boolean f0;
    public boolean g0;
    public Paint h;
    public final xh.f h0;
    public final hh.b i0;
    public final ch.b j0;
    public RectF k0;
    public boolean l0;
    public boolean m0;
    public Matrix n;
    public final int[] n0;
    public boolean o0;
    public boolean p0;
    public org.telegram.ui.Cells.s1 q0;
    public boolean r;
    public float r0;
    public boolean s;
    public float s0;
    public final Rect t0;
    public ValueAnimator u0;
    public boolean v;
    public boolean v0;
    public boolean w;
    public org.telegram.ui.Cells.s1 w0;
    public boolean x;
    public org.telegram.ui.Components.q11 x0;
    public float y;
    public Paint y0;

    public ni0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, R.style.TransparentDialog);
        int i10 = UserConfig.selectedAccount;
        this.c = i10;
        this.d = i0.b.e;
        this.M = new ArrayList();
        this.O = new a0.h();
        final int i11 = 1;
        this.S = new Paint(1);
        this.n0 = new int[2];
        final int i12 = 0;
        this.p0 = false;
        this.t0 = new Rect();
        this.a = context;
        this.b = u6Var;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        yh0 yh0Var = new yh0(this, context, i11);
        this.E = yh0Var;
        this.h0 = xh.f.d(1, yh0Var, yh0Var);
        yh0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.vh0
            public final /* synthetic */ ni0 b;

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
        yh0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: org.telegram.ui.wh0
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                ni0 ni0Var = ni0.this;
                if (ni0Var.o0 || !(view2 instanceof EditText)) {
                    return;
                }
                AndroidUtilities.hideKeyboard(ni0Var.R);
                AndroidUtilities.runOnUIThread(new th0(ni0Var, (EditText) view2, 0), 200L);
            }
        });
        hh.b bVar = new hh.b();
        this.i0 = bVar;
        ch.b bVar2 = new ch.b(bVar);
        this.j0 = bVar2;
        bVar2.f = new jh.k(yh0Var);
        bVar2.g = yh0Var;
        fi0 fi0Var = new fi0(this, context, u6Var);
        this.F = fi0Var;
        fi0Var.setClipToPadding(false);
        yh0Var.addView(fi0Var, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        f fVar = new f(this, 26);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(yh0Var, fVar);
        gi0 gi0Var = new gi0(this, context, u6Var);
        this.J = gi0Var;
        gi0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.vh0
            public final /* synthetic */ ni0 b;

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
        gi0Var.setOnItemClickListener(new h(this, 18));
        gi0Var.setOnScrollListener(new i3(this, 20));
        gi0Var.setItemAnimator(new ii0(null, gi0Var, u6Var));
        ji0 ji0Var = new ji0(this);
        this.L = ji0Var;
        ji0Var.O = new ki0(this);
        gi0Var.setLayoutManager(ji0Var);
        gi0Var.i(new li0());
        xh0 xh0Var = new xh0(this, context, u6Var);
        this.K = xh0Var;
        gi0Var.setAdapter(xh0Var);
        gi0Var.setVerticalScrollBarEnabled(false);
        gi0Var.setOverScrollMode(2);
        fi0Var.addView(gi0Var, org.telegram.ui.Components.gb1.g(-2.0f, -1));
        yh0 yh0Var2 = new yh0(this, context, i12);
        this.G = yh0Var2;
        yh0Var.addView(yh0Var2, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.Z = new zh0(this, yh0Var2, i10);
    }

    public final void c(org.telegram.ui.ActionBar.r2 r2Var) {
        bh.d0 d0Var;
        if (this.d0 != null || r2Var == null) {
            return;
        }
        int i10 = this.c;
        MessagesController.getInstance(i10).getAvailableEffects();
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.c0 = frameLayout;
        frameLayout.setClipChildren(false);
        this.c0.setClipToPadding(false);
        this.c0.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
        bi0 bi0Var = new bi0(5, this.c, getContext(), null, this.b);
        this.d0 = bi0Var;
        bi0Var.setClipChildren(false);
        this.d0.setClipToPadding(false);
        this.d0.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
        this.d0.setDelegate(new di0(this, r2Var));
        this.d0.setTop(false);
        this.d0.setClipChildren(false);
        this.d0.setClipToPadding(false);
        this.d0.setVisibility(0);
        this.d0.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
        this.d0.setBubbleOffset(AndroidUtilities.dp(-25.0f));
        this.d0.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
        this.F.addView(this.c0, org.telegram.ui.Components.gb1.h(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.c0.addView(this.d0, org.telegram.ui.Components.gb1.h(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.d0.setScaleY(0.4f);
        this.d0.setScaleX(0.4f);
        this.d0.setAlpha(0.0f);
        if (MessagesController.getInstance(i10).hasAvailableEffects()) {
            s();
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
        bi0 bi0Var2 = this.d0;
        if (bi0Var2 != null && !bi0Var2.g1) {
            bi0Var2.g1 = true;
            bi0Var2.h1 = true;
            bh.i0 i0Var = bi0Var2.x0;
            if (i0Var != null && (d0Var = i0Var.m) != null && !d0Var.L1) {
                d0Var.L1 = true;
                d0Var.M1 = true;
                z41 z41Var = d0Var.h0;
                if (z41Var != null) {
                    z41Var.invalidate();
                }
                p41 p41Var = d0Var.i0;
                if (p41Var != null) {
                    p41Var.invalidate();
                }
            }
        }
        new fi.z3(this.E, false, new t3(this, 11));
    }

    public final void d(Runnable runnable, boolean z10) {
        bi0 bi0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.u0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z11 = z10 && (viewGroup = this.Y) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout);
        if (z11) {
            org.telegram.ui.ActionBar.o1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Y);
        }
        if (!z10 && (bi0Var = this.d0) != null && this.e0) {
            bi0Var.e();
            if (this.d0.getReactionsWindow() != null && this.d0.getReactionsWindow().a != null) {
                this.d0.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.d0.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.v = true;
        this.s = !z10;
        this.J.invalidate();
        this.w = true;
        this.x = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.u0 = ofFloat;
        ofFloat.addUpdateListener(new bh.a0(10, this, z11));
        this.u0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.u0.setInterpolator(org.telegram.ui.Components.ds.h);
        this.u0.setDuration(350L);
        this.u0.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.c).hasAvailableEffects()) {
            s();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.p0) {
            return;
        }
        this.p0 = true;
        ai0 ai0Var = this.W;
        if (ai0Var != null) {
            ai0Var.invalidate();
        }
        org.telegram.ui.Components.vg vgVar = this.V;
        if (vgVar != null) {
            vgVar.invalidate();
        }
        d(new sh0(this, 2), false);
        this.E.invalidate();
        NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
    }

    public final void e(MessageObject messageObject) {
        MessageObject.GroupedMessages k10 = k(messageObject);
        if (k10 == null) {
            f(messageObject);
            return;
        }
        k10.calculate();
        ArrayList<MessageObject> arrayList = k10.messages;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            MessageObject messageObject2 = arrayList.get(i10);
            i10++;
            f(messageObject2);
        }
    }

    public final void f(MessageObject messageObject) {
        org.telegram.ui.Cells.s1 s1Var;
        gi0 gi0Var = this.J;
        if (gi0Var == null) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= gi0Var.getChildCount()) {
                s1Var = null;
                break;
            }
            View childAt = gi0Var.getChildAt(i11);
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
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == messageObject) {
                i12 = (arrayList.size() - 1) - i10;
            }
            i10++;
        }
        if (s1Var2 == null) {
            gi0Var.getAdapter().m(i12);
            return;
        }
        messageObject.forceUpdate = true;
        s1Var2.Z3(messageObject, s1Var2.getCurrentMessagesGroup(), s1Var2.m3(), s1Var2.n3(), s1Var2.h3(), false);
        gi0Var.getAdapter().m(i12);
    }

    public final void g(boolean z10) {
        this.r = z10;
        dismiss();
    }

    public final void h() {
        if (this.p0) {
            return;
        }
        this.p0 = true;
        xh.f.f(false);
        xh.f fVar = this.h0;
        if (fVar != null) {
            fVar.b(this.E);
        }
        super.dismiss();
        NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.availableEffectsUpdate);
    }

    public final void i(Canvas canvas, float f7, float f10, float f11, float f12) {
        if (this.x0 == null || this.y0 == null) {
            return;
        }
        float f13 = (f7 + f11) / 2.0f;
        float f14 = (f10 + f12) / 2.0f;
        float dp = AndroidUtilities.dp(28.0f) + this.x0.c;
        float dp2 = AndroidUtilities.dp(32.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        float f15 = dp / 2.0f;
        float f16 = f13 - f15;
        float f17 = dp2 / 2.0f;
        rectF.set(f16, f14 - f17, f13 + f15, f14 + f17);
        canvas.save();
        canvas.drawRoundRect(rectF, f17, f17, this.y0);
        this.x0.c(f16 + AndroidUtilities.dp(14.0f), f14, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.p0;
    }

    public final long j() {
        MessageObject messageObject;
        if (this.m0 || this.d0 == null) {
            return 0L;
        }
        if (this.k0 != null) {
            this.m0 = true;
            return this.H;
        }
        org.telegram.ui.Cells.s1 s1Var = this.P;
        if (s1Var == null || (messageObject = s1Var.getMessageObject()) == null) {
            return 0L;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if ((message.flags2 & 4) == 0) {
            return 0L;
        }
        this.m0 = true;
        return message.effect;
    }

    public final MessageObject.GroupedMessages k(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.O.f(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public final void m(boolean z10) {
        ji0 ji0Var;
        gi0 gi0Var = this.J;
        if (gi0Var == null || gi0Var.getAdapter() == null || (ji0Var = this.L) == null) {
            return;
        }
        int h = gi0Var.getAdapter().h();
        ji0Var.i1(z10 ? h > 10 ? h % 10 : 0 : h - 1, AndroidUtilities.dp(12.0f), z10);
        this.v0 = z10;
    }

    public final void n(long j10) {
        TLRPC.TL_availableEffect effect;
        this.H = j10;
        boolean i10 = this.O.i();
        ArrayList arrayList = this.M;
        int size = (i10 || arrayList.size() < 10) ? 0 : arrayList.size() % 10;
        MessageObject messageObject = (size < 0 || size >= arrayList.size()) ? null : (MessageObject) arrayList.get(size);
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            message.flags2 |= 4;
            message.effect = j10;
        }
        if (this.d0 == null || (effect = MessagesController.getInstance(this.c).getEffect(j10)) == null) {
            return;
        }
        this.d0.setSelectedReactionAnimated(bh.x0.e(effect));
    }

    public final void o(org.telegram.ui.Components.k80 k80Var) {
        int i10 = org.telegram.ui.ActionBar.y6.E8;
        org.telegram.ui.ActionBar.u6 u6Var = this.b;
        k80Var.T(org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
        k80Var.Q(this.j0, gh.c.k(u6Var), false);
        ViewGroup viewGroup = k80Var.A;
        this.Y = viewGroup;
        this.F.addView(viewGroup, org.telegram.ui.Components.gb1.g(-2.0f, -2));
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.a0) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.a0 = false;
            return;
        }
        bi0 bi0Var = this.d0;
        if (bi0Var == null || bi0Var.getReactionsWindow() == null) {
            this.m0 = true;
            super.onBackPressed();
        } else {
            if (this.d0.getReactionsWindow().C) {
                return;
            }
            this.d0.getReactionsWindow().d();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        yh0 yh0Var = this.E;
        setContentView(yh0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i10 | (-1945959040);
        window.setAttributes(attributes);
        yh0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(yh0Var, !org.telegram.ui.ActionBar.y6.I.q());
    }

    public final void p(ArrayList arrayList) {
        a0.h hVar;
        int i10;
        int i11;
        int i12 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.O;
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
        ArrayList arrayList2 = this.M;
        arrayList2.addAll(arrayList);
        int i15 = 0;
        while (i15 < arrayList2.size()) {
            int i16 = this.N;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i15);
            if (getContext() == null) {
                i10 = i15;
                i11 = 0;
            } else {
                if (this.w0 == null) {
                    this.w0 = new org.telegram.ui.Cells.s1(getContext(), this.c, true, null, this.b);
                }
                org.telegram.ui.Cells.s1 s1Var = this.w0;
                s1Var.N7 = false;
                s1Var.P7 = false;
                s1Var.Q7 = false;
                s1Var.R7 = false;
                s1Var.S7 = false;
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId());
                di.f3 f3Var = s1Var.S0;
                f3Var.setIgnoreImageSet(true);
                ImageReceiver imageReceiver = s1Var.m9;
                imageReceiver.setIgnoreImageSet(true);
                ImageReceiver imageReceiver2 = s1Var.F9;
                imageReceiver2.setIgnoreImageSet(true);
                ImageReceiver imageReceiver3 = s1Var.r9;
                imageReceiver3.setIgnoreImageSet(true);
                if (groupedMessages2 == null || groupedMessages2.messages.size() == 1) {
                    i10 = i15;
                    s1Var.X3(messageObject2, groupedMessages2, false, false, false, false);
                    f3Var.setIgnoreImageSet(false);
                    imageReceiver.setIgnoreImageSet(false);
                    imageReceiver2.setIgnoreImageSet(false);
                    imageReceiver3.setIgnoreImageSet(false);
                    s1Var.p4();
                    i11 = s1Var.J8;
                } else {
                    if (groupedMessages2.messages.size() != groupedMessages2.positions.size()) {
                        groupedMessages2.calculate();
                    }
                    s1Var.ye = 0;
                    i11 = 0;
                    for (int i17 = 0; i17 < groupedMessages2.messages.size(); i17++) {
                        MessageObject messageObject3 = groupedMessages2.messages.get(i17);
                        MessageObject.GroupedMessagePosition position = groupedMessages2.getPosition(messageObject3);
                        if (position != null && (position.flags & 4) != 0) {
                            s1Var.X3(messageObject3, groupedMessages2, false, false, false, false);
                            i11 += s1Var.J8;
                        }
                    }
                    i10 = i15;
                }
            }
            this.N = Math.max(i16, i11);
            i15 = i10 + 1;
        }
        gi0 gi0Var = this.J;
        gi0Var.getAdapter().l();
        int h = gi0Var.getAdapter().h();
        this.L.i1(h > 10 ? h % 10 : 0, AndroidUtilities.dp(12.0f), true);
    }

    public final org.telegram.ui.Components.vg q(org.telegram.ui.Components.vg vgVar, boolean z10, View.OnClickListener onClickListener) {
        this.V = vgVar;
        int[] iArr = this.n0;
        vgVar.getLocationOnScreen(iArr);
        ai0 ai0Var = new ai0(this, getContext(), vgVar.b, this.b, vgVar, z10);
        this.W = ai0Var;
        ai0Var.setScaleX(this.V.getScaleX());
        this.W.setScaleY(this.V.getScaleY());
        org.telegram.ui.Components.vg vgVar2 = this.V;
        ai0 ai0Var2 = this.W;
        ai0Var2.E = vgVar2.E;
        ai0Var2.h0 = vgVar2.h0;
        ai0Var2.c0.t(vgVar2.c0.i, false, true);
        ai0Var2.d0 = vgVar2.d0;
        ai0Var2.setEmoji(vgVar2.f.f[0]);
        ai0Var2.i(vgVar2.s, vgVar2.r, true);
        ai0Var2.P.d(vgVar2.P.c, true);
        ai0Var2.x.d(vgVar2.x.c, true);
        int i10 = vgVar2.I;
        int i11 = vgVar2.J;
        ai0Var2.I = i10;
        ai0Var2.J = i11;
        float f7 = vgVar2.M;
        float f10 = vgVar2.N;
        ai0Var2.M = f7;
        ai0Var2.N = f10;
        this.W.P.d(vgVar.P.c, true);
        this.W.setOnClickListener(onClickListener);
        this.F.addView(this.W, new ViewGroup.LayoutParams(vgVar.getWidth(), vgVar.getHeight()));
        org.telegram.ui.Components.vg vgVar3 = this.V;
        vgVar.getHeight();
        this.X = vgVar3.m();
        int i12 = iArr[0];
        int width = this.V.getWidth();
        org.telegram.ui.Components.vg vgVar4 = this.V;
        vgVar.getHeight();
        iArr[0] = d3.w(6.0f, width - vgVar4.m(), i12);
        return this.W;
    }

    public final void r(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.x0 = j10 > 0 ? new org.telegram.ui.Components.q11(bi.dd.W0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold()) : null;
        if (this.y0 == null) {
            Paint paint = new Paint(1);
            this.y0 = paint;
            paint.setColor(TLObject.FLAG_30);
        }
        this.J.invalidate();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 >= arrayList.size()) {
                this.K.l();
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                messageMedia.spoiler = j10 > 0;
            }
            i10++;
        }
    }

    public final void s() {
        if (this.e0) {
            return;
        }
        this.f0 = false;
        this.e0 = true;
        this.d0.p(null, null, true);
        this.d0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.ds.h).start();
        this.d0.r(false);
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            xh.f.f(true);
            super.show();
            final float alpha = this.V.getAlpha();
            org.telegram.ui.Components.vg vgVar = this.V;
            if (vgVar != null) {
                vgVar.setAlpha(0.0f);
            }
            org.telegram.ui.Components.hn0.d(new Utilities.Callback2() { // from class: org.telegram.ui.uh0
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    ni0 ni0Var = ni0.this;
                    hh.b bVar = ni0Var.i0;
                    Bitmap bitmap = (Bitmap) obj;
                    Bitmap bitmap2 = (Bitmap) obj2;
                    org.telegram.ui.Components.vg vgVar2 = ni0Var.V;
                    if (vgVar2 != null) {
                        vgVar2.setAlpha(alpha);
                    }
                    ni0Var.e = bitmap;
                    Paint paint = new Paint(1);
                    ni0Var.h = paint;
                    Bitmap bitmap3 = ni0Var.e;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    ni0Var.f = bitmapShader;
                    paint.setShader(bitmapShader);
                    ni0Var.n = new Matrix();
                    bVar.a(bitmap2);
                    ih.d.c(bVar, ni0Var.E);
                    ViewGroup viewGroup = ni0Var.Y;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                    }
                }
            });
            yh0 yh0Var = this.G;
            if (yh0Var != null) {
                yh0Var.bringToFront();
            }
            d(null, true);
        }
    }

    public void l(long j10) {
    }
}
