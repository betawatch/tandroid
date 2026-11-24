// default package

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ArticleViewer$WindowView;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class aw implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;

    public /* synthetic */ aw(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        fib fibVar;
        byte b = this.a;
        byte b2 = 0;
        o oVar = this.b;
        switch (b) {
            case 0:
                if (oVar.L0 && (articleViewer$WindowView = oVar.g0) != null) {
                    oVar.L0 = false;
                    if (oVar.b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        oVar.X(((thb) oVar.b.i).b);
                        oVar.b = null;
                        oVar.d = null;
                        View view = oVar.f;
                        if (view != null) {
                            view.invalidate();
                            break;
                        }
                    } else {
                        View view2 = oVar.f;
                        if (view2 != null && oVar.Q0.e0(view2)) {
                            if (oVar.f.getTag() == null || oVar.f.getTag() != "bottomSheet" || (fibVar = oVar.R0) == null) {
                                oVar.Q0.k0();
                            } else {
                                fibVar.k0();
                            }
                            if (oVar.Q0.w()) {
                                try {
                                    oVar.g0.performHapticFeedback(0, 2);
                                    break;
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                        } else if (oVar.d != null && oVar.f != null) {
                            try {
                                oVar.g0.performHapticFeedback(0, 2);
                            } catch (Exception unused3) {
                            }
                            int[] iArr = new int[2];
                            oVar.f.getLocationInWindow(iArr);
                            byte b3 = 1;
                            int L = (iArr[1] + oVar.e) - gl.L(54.0f);
                            if (L < 0) {
                                L = 0;
                            }
                            oVar.f.invalidate();
                            oVar.h = true;
                            View view3 = oVar.f;
                            m8 m8Var = oVar.I;
                            if (m8Var == null || !m8Var.isShowing()) {
                                if (oVar.C0 == null) {
                                    oVar.E0 = new Rect();
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(oVar.M, null);
                                    oVar.C0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(gl.L(1.0f), gl.L(1.0f), gl.L(1.0f), gl.L(1.0f));
                                    oVar.C0.setBackgroundDrawable(oVar.M.getResources().getDrawable(R.drawable.menu_copy));
                                    oVar.C0.setAnimationEnabled(false);
                                    oVar.C0.setOnTouchListener(new a7(oVar, (byte) 1));
                                    oVar.C0.setDispatchKeyEventListener(new ys(oVar));
                                    oVar.C0.setShownFromBottom(false);
                                    TextView textView = new TextView(oVar.M);
                                    oVar.D0 = textView;
                                    int i = bkb.h6;
                                    ff0 f0 = bkb.f0(bkb.w0(null, i, false), 2, -1);
                                    vkb M = zkb.M(i);
                                    textView.setBackground(f0);
                                    zkb.j(textView, f0, null, M, null);
                                    oVar.D0.setGravity(16);
                                    oVar.D0.setPadding(gl.L(20.0f), 0, gl.L(20.0f), 0);
                                    oVar.D0.setTextSize(1, 15.0f);
                                    oVar.D0.setTypeface(gl.o());
                                    oVar.D0.setText(k96.M0(2131751755, null).toUpperCase());
                                    oVar.D0.setOnClickListener(new xs(oVar, (byte) 5));
                                    oVar.C0.addView(oVar.D0, nme.c(48.0f, -2));
                                    m8 m8Var2 = new m8(oVar.C0, -2, -2);
                                    oVar.I = m8Var2;
                                    m8Var2.b = false;
                                    m8Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                    oVar.I.setOutsideTouchable(true);
                                    oVar.I.setClippingEnabled(true);
                                    oVar.I.setInputMethodMode(2);
                                    oVar.I.setSoftInputMode(0);
                                    oVar.I.getContentView().setFocusableInTouchMode(true);
                                    oVar.I.setOnDismissListener(new x6(oVar, b3));
                                }
                                zkb.X(oVar.D0, bkb.D8, null);
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = oVar.C0;
                                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                    zkb.h(bkb.F8, null, actionBarPopupWindow$ActionBarPopupWindowLayout2);
                                }
                                oVar.C0.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), TLObject.FLAG_31));
                                oVar.I.setFocusable(true);
                                oVar.I.showAtLocation(view3, 48, 0, L);
                                oVar.I.h();
                            } else {
                                oVar.I.d(true);
                            }
                            oVar.v0[0].b.setLayoutFrozen(true);
                            oVar.v0[0].b.setLayoutFrozen(false);
                            break;
                        }
                    }
                }
                break;
            default:
                aw awVar = oVar.M0;
                if (awVar == null) {
                    awVar = new aw(oVar, b2);
                    oVar.M0 = awVar;
                }
                ArticleViewer$WindowView articleViewer$WindowView2 = oVar.g0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(awVar, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    break;
                }
                break;
        }
    }
}
