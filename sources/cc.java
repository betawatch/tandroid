// default package

import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cc implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        a aVar;
        r59 r59Var;
        va vaVar;
        byte b = this.a;
        boolean z = false;
        int i = 0;
        z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                dc dcVar = (dc) obj;
                View view = dcVar.b;
                int[] iArr = dcVar.r;
                view.getLocationInWindow(iArr);
                int i2 = iArr[1];
                if (i2 != dcVar.s) {
                    dcVar.s = i2;
                    bka bkaVar = dcVar.c;
                    if (bkaVar.d != null && (actionBarPopupWindow$ActionBarPopupWindowLayout = bkaVar.f) != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == bkaVar && bkaVar.getWidth() != 0) {
                        bkaVar.onMeasure(View.MeasureSpec.makeMeasureSpec(bkaVar.getWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(bkaVar.getHeight(), TLObject.FLAG_30));
                        bkaVar.onLayout(false, bkaVar.getLeft(), bkaVar.getTop(), bkaVar.getRight(), bkaVar.getBottom());
                        bkaVar.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                aVar = ((d) ((dt1) obj).d).actionBar;
                aVar.invalidate();
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i3 = ChatActivityEnterView.z7;
                tx1 tx1Var = chatActivityEnterView.h2;
                px1 px1Var = chatActivityEnterView.f1;
                Object[] objArr = px1Var != null && px1Var.getVisibility() == 0;
                if (objArr == false || chatActivityEnterView.v3) {
                    chatActivityEnterView.R6 = false;
                }
                un3 un3Var = chatActivityEnterView.j1;
                boolean z2 = (un3Var == null || !un3Var.o()) && !chatActivityEnterView.R6 && (chatActivityEnterView.v3 || (chatActivityEnterView.n <= 0.0f && (objArr == true || chatActivityEnterView.Q6)));
                if (chatActivityEnterView.Q6 != z2 && chatActivityEnterView.K6 != null) {
                    chatActivityEnterView.Q6 = z2;
                    chatActivityEnterView.h2();
                    chatActivityEnterView.requestLayout();
                }
                if (chatActivityEnterView.O0()) {
                    float d = chatActivityEnterView.O6.d(!chatActivityEnterView.Q6);
                    ln lnVar = chatActivityEnterView.N6;
                    un3 un3Var2 = chatActivityEnterView.j1;
                    if (un3Var2 != null && un3Var2.o()) {
                        z = true;
                    }
                    float d2 = lnVar.d(z);
                    float max = Math.max(Math.min(Math.min(1.0f, chatActivityEnterView.n), d), d2);
                    float max2 = Math.max(Math.min(chatActivityEnterView.h, d), d2);
                    tc tcVar = chatActivityEnterView.K6;
                    sc scVar = tcVar.d;
                    scVar.setScaleX(max2);
                    scVar.setScaleY(max2);
                    tcVar.setAlpha(max);
                    if (tx1Var != null && (tx1Var.getAlpha() != max || tx1Var.getScaleX() != max2 || tx1Var.getScaleY() != max2)) {
                        tx1Var.animate().cancel();
                        chatActivityEnterView.l2 = max;
                        tx1Var.setAlpha(max);
                        tx1Var.setScaleX(max2);
                        tx1Var.setScaleY(max2);
                        break;
                    }
                }
                break;
            case 3:
                n52 n52Var = (n52) obj;
                x20 x20Var = n52Var.b.U2;
                r3 = x20Var != null ? x20Var.getAlpha() : 0.0f;
                if (r3 != n52Var.A0) {
                    n52Var.A0 = r3;
                    n52Var.h0();
                    break;
                }
                break;
            case 4:
                Field field = EditTextBoldCursor.E1;
                cl4 cl4Var = ((EditTextBoldCursor) obj).Z0;
                if (cl4Var != null) {
                    cl4Var.c();
                    break;
                }
                break;
            case 5:
                ((yt5) obj).invalidate();
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.e7;
                profileActivity.X3();
                profileActivity.Y3();
                break;
            case 7:
                fja fjaVar = (fja) obj;
                if (fjaVar.a && fjaVar.b > 0) {
                    fjaVar.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                fjaVar.s();
                if (fjaVar.h0 && (r59Var = fjaVar.F) != null && !r59Var.d0()) {
                    float p = fjaVar.p();
                    if (!Float.isInfinite(p)) {
                        fjaVar.h0 = false;
                        fjaVar.u(fjaVar.F, Math.round(p - fjaVar.V));
                        fjaVar.C();
                    }
                }
                if (fjaVar.a && fjaVar.b > 0) {
                    fjaVar.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    fjaVar.b--;
                    fjaVar.c++;
                    break;
                }
                break;
            case 8:
                ((xza) obj).t0();
                break;
            case 9:
                goc gocVar = (goc) ((qw9) obj).c;
                if (gocVar.G) {
                    gocVar.X0();
                    break;
                }
                break;
            case 10:
                vnc vncVar = (vnc) obj;
                goc gocVar2 = vncVar.e;
                if (gocVar2.a0 != null && (vaVar = gocVar2.a) != null) {
                    boolean z3 = gocVar2.r0 && !vaVar.canScrollVertically(1);
                    if (gocVar2.c0 != z3) {
                        gocVar2.c0 = z3;
                        gocVar2.a0.animate().cancel();
                        l66 l66Var = gocVar2.a0;
                        if (z3) {
                            l66Var.setVisibility(0);
                            gocVar2.a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(d53.g).start();
                        } else {
                            l66Var.setAlpha(0.0f);
                            gocVar2.a0.setVisibility(4);
                        }
                    }
                }
                gocVar2.f1();
                View m = gocVar2.a.f3.m(gocVar2.h);
                if (m != null) {
                    r3 = m.getY();
                    i = m.getHeight();
                }
                if (m != vncVar.a || r3 != vncVar.b || i != vncVar.c) {
                    vncVar.a = m;
                    vncVar.b = r3;
                    vncVar.c = i;
                    gocVar2.Y0();
                    break;
                }
                break;
            case 11:
                mqc mqcVar = (mqc) obj;
                soc socVar = mqcVar.c;
                float cardRotationX = socVar.getCardRotationX();
                float cardRotationY = socVar.getCardRotationY();
                if (cardRotationX != mqcVar.b0 || cardRotationY != mqcVar.c0) {
                    mqcVar.b0 = cardRotationX;
                    mqcVar.c0 = cardRotationY;
                    mqcVar.M.invalidate();
                    break;
                }
                break;
            default:
                rrc rrcVar = (rrc) ((f7) obj).c;
                f7 f7Var = rrcVar.x;
                if (f7Var != null && rrcVar.a0 != null && f7Var.getHeight() > 0 && rrcVar.a0.getHeight() > 0) {
                    float paddingTop = rrcVar.fragmentView.getPaddingTop();
                    if (rrcVar.w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (rrcVar.w.getScaleY() * (rrcVar.w.getContentBottom() - rrcVar.w.getPivotY())) + rrcVar.w.getPivotY() + rrcVar.w.getY());
                    }
                    float max3 = Math.max(0.0f, Math.min(rrcVar.fragmentView.getHeight() - rrcVar.fragmentView.getPaddingBottom(), rrcVar.a0.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max3 - (Math.min(gm.L(12.0f), max3 / 4.0f) * 2.0f)) / rrcVar.x.getHeight());
                    rrcVar.x.setPivotX(r5.getWidth() / 2.0f);
                    rrcVar.x.setPivotY(r5.getHeight() / 2.0f);
                    rrcVar.x.setScaleX(min);
                    rrcVar.x.setScaleY(min);
                    rrcVar.x.setTranslationY((((max3 / 2.0f) + paddingTop) - r3.getTop()) - (rrcVar.x.getHeight() / 2.0f));
                }
                if (rrcVar.b0 != null || rrcVar.c0 < 1.0f) {
                    rrcVar.G0();
                    break;
                }
                break;
        }
        return true;
    }
}
