// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gl1 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ gl1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.Wb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    zu1Var.finishFragment();
                    break;
                }
                break;
            case 1:
                zu1Var.ta((String) obj, false);
                break;
            case 2:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    zu1Var.S1 = tL_premium_boostsStatus;
                    zu1Var.getMessagesController().G0().b(zu1Var.l6, tL_premium_boostsStatus, new gl1(zu1Var, (byte) 3));
                    break;
                }
                break;
            case 3:
                zu1Var.T1 = (wg1) obj;
                break;
            case 4:
                View view = (View) obj;
                if (!(view instanceof wb2)) {
                    if (!(view instanceof dl1)) {
                        if (!(view instanceof bf2)) {
                            if (!(view instanceof oo0)) {
                                if (view instanceof eq0) {
                                    view.invalidate();
                                    break;
                                }
                            } else {
                                view.invalidate();
                                break;
                            }
                        } else {
                            ((bf2) view).getTextView().setTranslationX(zu1Var.o7() / 2.0f);
                            break;
                        }
                    } else {
                        dl1 dl1Var = (dl1) view;
                        dl1Var.f0 = zu1Var.S7();
                        dl1Var.j0 = zu1Var.f8();
                        zu1Var.e8();
                        zu1Var.n7();
                        int o7 = zu1Var.o7();
                        if (dl1Var.k0 != o7) {
                            dl1Var.k0 = o7;
                            dl1Var.invalidate();
                            break;
                        }
                    }
                } else {
                    wb2 wb2Var = (wb2) view;
                    wb2Var.W6 = zu1Var.S7();
                    wb2Var.X6 = zu1Var.f8();
                    boolean e8 = zu1Var.e8();
                    if (wb2Var.Y6 != e8) {
                        wb2Var.Y6 = e8;
                        zu1Var.A0.getClass();
                        int S = RecyclerView.S(view);
                        wb2Var.F6 = true;
                        wb2Var.forceLayout();
                        if (S >= 0) {
                            zu1Var.D0.g(S);
                        }
                    }
                    wb2Var.Z6 = zu1Var.n7();
                    int o72 = zu1Var.o7();
                    if (wb2Var.a7 != o72) {
                        wb2Var.a7 = o72;
                        wb2Var.d4();
                        wb2Var.invalidate();
                        break;
                    }
                }
                break;
            case 5:
                Long l = (Long) obj;
                l1c l1cVar = zu1Var.g2;
                if (l1cVar != null) {
                    l1cVar.k(l.longValue(), true);
                    break;
                }
                break;
            case 6:
                zu1Var.f0.c.add(((s7) obj).getIconView());
                break;
            case 7:
                b77 b77Var = (b77) obj;
                zu1 zu1Var2 = this.b;
                zu1Var2.y5 = b77Var;
                zu1Var2.H5.k.suggested_post = b77Var.c();
                zu1Var2.ac(true, null, zu1Var2.H5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 8:
            case 9:
                zu1Var.fc((b77) obj);
                break;
            default:
                int intValue = ((Integer) obj).intValue();
                int i = zu1.Ad;
                zu1Var.Ua(intValue);
                break;
        }
    }
}
