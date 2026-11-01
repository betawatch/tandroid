package dh;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.cj;
import org.telegram.messenger.dd;
import org.telegram.messenger.fj;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.dk0;
import s4.m0;
import s4.z0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g extends m0 {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i10) {
        this.a = i10;
    }

    @Override // s4.m0
    public final void c(Rect rect, View view, RecyclerView recyclerView, z0 z0Var) {
        q1 q1Var;
        fj currentMessagesGroup;
        q1 q1Var2;
        fj currentMessagesGroup2;
        q1 q1Var3;
        fj currentMessagesGroup3;
        q1 q1Var4;
        fj currentMessagesGroup4;
        switch (this.a) {
            case 0:
                rect.top = i0.L(6.0f);
                break;
            case 1:
                int i10 = 0;
                rect.bottom = 0;
                if ((view instanceof q1) && (currentMessagesGroup = (q1Var = (q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList = currentMessagesGroup.e;
                    cj currentPosition = q1Var.getCurrentPosition();
                    if (currentPosition != null && currentPosition.m != null) {
                        Point point = i0.q;
                        float max = Math.max(point.x, point.y) * 0.5f;
                        int extraInsetHeight = q1Var.getExtraInsetHeight();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= currentPosition.m.length) {
                                int round = (Math.round(i0.p * 7.0f) * (currentPosition.d - currentPosition.c)) + extraInsetHeight;
                                int size = arrayList.size();
                                while (true) {
                                    if (i10 < size) {
                                        cj cjVar = (cj) arrayList.get(i10);
                                        byte b10 = cjVar.c;
                                        byte b11 = currentPosition.c;
                                        if (b10 != b11 || ((cjVar.a == currentPosition.a && cjVar.b == currentPosition.b && b10 == b11 && cjVar.d == currentPosition.d) || b10 != b11)) {
                                            i10++;
                                        } else {
                                            round = m5.B(4.0f, (int) Math.ceil(max * cjVar.f), round);
                                        }
                                    }
                                }
                                rect.bottom = -round;
                                break;
                            } else {
                                extraInsetHeight += (int) Math.ceil(r3[i11] * max);
                                i11++;
                            }
                        }
                    }
                }
                break;
            case 2:
                int i12 = 0;
                rect.bottom = 0;
                if ((view instanceof q1) && (currentMessagesGroup2 = (q1Var2 = (q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList2 = currentMessagesGroup2.e;
                    cj currentPosition2 = q1Var2.getCurrentPosition();
                    if (currentPosition2 != null && currentPosition2.m != null) {
                        Point point2 = i0.q;
                        float max2 = Math.max(point2.x, point2.y) * 0.5f;
                        int extraInsetHeight2 = q1Var2.getExtraInsetHeight();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= currentPosition2.m.length) {
                                int round2 = (Math.round(i0.p * 7.0f) * (currentPosition2.d - currentPosition2.c)) + extraInsetHeight2;
                                int size2 = arrayList2.size();
                                while (true) {
                                    if (i12 < size2) {
                                        cj cjVar2 = (cj) arrayList2.get(i12);
                                        byte b12 = cjVar2.c;
                                        byte b13 = currentPosition2.c;
                                        if (b12 != b13 || ((cjVar2.a == currentPosition2.a && cjVar2.b == currentPosition2.b && b12 == b13 && cjVar2.d == currentPosition2.d) || b12 != b13)) {
                                            i12++;
                                        } else {
                                            round2 = m5.B(4.0f, (int) Math.ceil(max2 * cjVar2.f), round2);
                                        }
                                    }
                                }
                                rect.bottom = -round2;
                                break;
                            } else {
                                extraInsetHeight2 += (int) Math.ceil(r3[i13] * max2);
                                i13++;
                            }
                        }
                    }
                }
                break;
            case 3:
                rect.right = i0.L(2.0f);
                break;
            case 4:
                rect.right = i0.L(2.0f);
                break;
            case 5:
                int i14 = 0;
                rect.bottom = 0;
                if ((view instanceof q1) && (currentMessagesGroup3 = (q1Var3 = (q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList3 = currentMessagesGroup3.e;
                    cj currentPosition3 = q1Var3.getCurrentPosition();
                    if (currentPosition3 != null && currentPosition3.m != null) {
                        Point point3 = i0.q;
                        float max3 = Math.max(point3.x, point3.y) * 0.5f;
                        int extraInsetHeight3 = q1Var3.getExtraInsetHeight();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= currentPosition3.m.length) {
                                int round3 = (Math.round(i0.p * 7.0f) * (currentPosition3.d - currentPosition3.c)) + extraInsetHeight3;
                                int size3 = arrayList3.size();
                                while (true) {
                                    if (i14 < size3) {
                                        cj cjVar3 = (cj) arrayList3.get(i14);
                                        byte b14 = cjVar3.c;
                                        byte b15 = currentPosition3.c;
                                        if (b14 != b15 || ((cjVar3.a == currentPosition3.a && cjVar3.b == currentPosition3.b && b14 == b15 && cjVar3.d == currentPosition3.d) || b14 != b15)) {
                                            i14++;
                                        } else {
                                            round3 = m5.B(4.0f, (int) Math.ceil(max3 * cjVar3.f), round3);
                                        }
                                    }
                                }
                                rect.bottom = -round3;
                                break;
                            } else {
                                extraInsetHeight3 += (int) Math.ceil(r3[i15] * max3);
                                i15++;
                            }
                        }
                    }
                }
                break;
            case 6:
                dk0 dk0Var = (dk0) recyclerView.T(view);
                if (dk0Var == null) {
                    rect.left = i0.L(4.0f);
                    rect.right = i0.L(4.0f);
                    break;
                } else {
                    int b16 = dk0Var.b() % 4;
                    rect.left = b16 == 0 ? 0 : i0.L(4.0f);
                    rect.right = b16 != 3 ? i0.L(4.0f) : 0;
                    break;
                }
            case 7:
                dk0 dk0Var2 = (dk0) recyclerView.T(view);
                if (dk0Var2 == null) {
                    rect.left = i0.L(4.0f);
                    rect.right = i0.L(4.0f);
                    break;
                } else {
                    int b17 = dk0Var2.b() % 4;
                    rect.left = b17 == 0 ? 0 : i0.L(4.0f);
                    rect.right = b17 != 3 ? i0.L(4.0f) : 0;
                    break;
                }
            case 8:
                dk0 dk0Var3 = (dk0) recyclerView.T(view);
                if (dk0Var3 == null) {
                    rect.left = i0.L(4.0f);
                    rect.right = i0.L(4.0f);
                    break;
                } else {
                    if (dk0Var3.f == 5) {
                        int b18 = dk0Var3.b() % 4;
                        rect.left = b18 == 0 ? 0 : i0.L(4.0f);
                        rect.right = b18 != 3 ? i0.L(4.0f) : 0;
                        break;
                    } else {
                        rect.right = 0;
                        rect.left = 0;
                        break;
                    }
                }
            case 9:
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
                break;
            case 10:
                int i16 = 0;
                rect.bottom = 0;
                if ((view instanceof q1) && (currentMessagesGroup4 = (q1Var4 = (q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList4 = currentMessagesGroup4.e;
                    cj currentPosition4 = q1Var4.getCurrentPosition();
                    if (currentPosition4 != null && currentPosition4.m != null) {
                        Point point4 = i0.q;
                        float max4 = Math.max(point4.x, point4.y) * 0.5f;
                        int extraInsetHeight4 = q1Var4.getExtraInsetHeight();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= currentPosition4.m.length) {
                                int round4 = (Math.round(i0.p * 7.0f) * (currentPosition4.d - currentPosition4.c)) + extraInsetHeight4;
                                int size4 = arrayList4.size();
                                while (true) {
                                    if (i16 < size4) {
                                        cj cjVar4 = (cj) arrayList4.get(i16);
                                        byte b19 = cjVar4.c;
                                        byte b20 = currentPosition4.c;
                                        if (b19 != b20 || ((cjVar4.a == currentPosition4.a && cjVar4.b == currentPosition4.b && b19 == b20 && cjVar4.d == currentPosition4.d) || b19 != b20)) {
                                            i16++;
                                        } else {
                                            round4 = m5.B(4.0f, (int) Math.ceil(max4 * cjVar4.f), round4);
                                        }
                                    }
                                }
                                rect.bottom = -round4;
                                break;
                            } else {
                                extraInsetHeight4 += (int) Math.ceil(r3[i17] * max4);
                                i17++;
                            }
                        }
                    }
                }
                break;
            case 11:
                int R = RecyclerView.R(view);
                rect.left = i0.L(12.0f);
                rect.top = 0;
                rect.bottom = 0;
                if (R == z0Var.b() - 1) {
                    rect.right = i0.L(12.0f);
                    break;
                }
                break;
            case 12:
                super.c(rect, view, recyclerView, z0Var);
                rect.top = 1;
                break;
            case 13:
                int S = RecyclerView.S(view);
                rect.setEmpty();
                if (S != 1) {
                    if (S == 2) {
                        rect.left = i0.L(31.0f) + (-i0.L(85.0f));
                        break;
                    }
                } else {
                    rect.left = i0.L(31.0f) + (-i0.L(85.0f));
                    break;
                }
                break;
            case 14:
                int L = i0.L(4.0f);
                rect.top = 0;
                rect.bottom = L;
                rect.right = L;
                rect.left = L;
                if (RecyclerView.R(view) % 3 != 2) {
                    rect.right = 0;
                    break;
                }
                break;
            case 15:
                int L2 = i0.L(5.0f);
                rect.right = L2;
                rect.bottom = L2;
                break;
            default:
                super.c(rect, view, recyclerView, z0Var);
                int R2 = RecyclerView.R(view);
                rect.left = i0.L(8.0f);
                if (R2 == z0Var.b() - 1) {
                    rect.right = i0.L(10.0f);
                }
                if (R2 == 0) {
                    rect.left = i0.L(10.0f);
                    break;
                }
                break;
        }
    }

    @Override // s4.m0
    public void e(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 12:
                int width = recyclerView.getWidth();
                int childCount = recyclerView.getChildCount();
                int i10 = childCount - 1;
                int i11 = 0;
                while (i11 < i10) {
                    View childAt = recyclerView.getChildAt(i11);
                    View childAt2 = i11 < childCount + (-2) ? recyclerView.getChildAt(i11 + 1) : null;
                    if (RecyclerView.R(childAt) >= 0 && !(childAt instanceof z3) && !(childAt2 instanceof z3)) {
                        float bottom = childAt.getBottom();
                        canvas.drawLine(dd.X ? 0.0f : i0.L(72.0f), bottom, width - (dd.X ? i0.L(72.0f) : 0), bottom, t6.k0);
                    }
                    i11++;
                }
                break;
        }
    }
}
