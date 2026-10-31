package dh;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.bj;
import org.telegram.messenger.cd;
import org.telegram.messenger.ej;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.ck0;
import s4.m0;
import s4.z0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g extends m0 {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i10) {
        this.a = i10;
    }

    @Override // s4.m0
    public final void c(Rect rect, View view, RecyclerView recyclerView, z0 z0Var) {
        q1 q1Var;
        ej currentMessagesGroup;
        q1 q1Var2;
        ej currentMessagesGroup2;
        q1 q1Var3;
        ej currentMessagesGroup3;
        q1 q1Var4;
        ej currentMessagesGroup4;
        switch (this.a) {
            case 0:
                rect.top = i0.L(6.0f);
                break;
            case 1:
                int i10 = 0;
                rect.bottom = 0;
                if ((view instanceof q1) && (currentMessagesGroup = (q1Var = (q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList = currentMessagesGroup.e;
                    bj currentPosition = q1Var.getCurrentPosition();
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
                                        bj bjVar = (bj) arrayList.get(i10);
                                        byte b10 = bjVar.c;
                                        byte b11 = currentPosition.c;
                                        if (b10 != b11 || ((bjVar.a == currentPosition.a && bjVar.b == currentPosition.b && b10 == b11 && bjVar.d == currentPosition.d) || b10 != b11)) {
                                            i10++;
                                        } else {
                                            round = m5.B(4.0f, (int) Math.ceil(max * bjVar.f), round);
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
                    bj currentPosition2 = q1Var2.getCurrentPosition();
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
                                        bj bjVar2 = (bj) arrayList2.get(i12);
                                        byte b12 = bjVar2.c;
                                        byte b13 = currentPosition2.c;
                                        if (b12 != b13 || ((bjVar2.a == currentPosition2.a && bjVar2.b == currentPosition2.b && b12 == b13 && bjVar2.d == currentPosition2.d) || b12 != b13)) {
                                            i12++;
                                        } else {
                                            round2 = m5.B(4.0f, (int) Math.ceil(max2 * bjVar2.f), round2);
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
                    bj currentPosition3 = q1Var3.getCurrentPosition();
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
                                        bj bjVar3 = (bj) arrayList3.get(i14);
                                        byte b14 = bjVar3.c;
                                        byte b15 = currentPosition3.c;
                                        if (b14 != b15 || ((bjVar3.a == currentPosition3.a && bjVar3.b == currentPosition3.b && b14 == b15 && bjVar3.d == currentPosition3.d) || b14 != b15)) {
                                            i14++;
                                        } else {
                                            round3 = m5.B(4.0f, (int) Math.ceil(max3 * bjVar3.f), round3);
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
                ck0 ck0Var = (ck0) recyclerView.T(view);
                if (ck0Var == null) {
                    rect.left = i0.L(4.0f);
                    rect.right = i0.L(4.0f);
                    break;
                } else {
                    int b16 = ck0Var.b() % 4;
                    rect.left = b16 == 0 ? 0 : i0.L(4.0f);
                    rect.right = b16 != 3 ? i0.L(4.0f) : 0;
                    break;
                }
            case 7:
                ck0 ck0Var2 = (ck0) recyclerView.T(view);
                if (ck0Var2 == null) {
                    rect.left = i0.L(4.0f);
                    rect.right = i0.L(4.0f);
                    break;
                } else {
                    int b17 = ck0Var2.b() % 4;
                    rect.left = b17 == 0 ? 0 : i0.L(4.0f);
                    rect.right = b17 != 3 ? i0.L(4.0f) : 0;
                    break;
                }
            case 8:
                ck0 ck0Var3 = (ck0) recyclerView.T(view);
                if (ck0Var3 == null) {
                    rect.left = i0.L(4.0f);
                    rect.right = i0.L(4.0f);
                    break;
                } else {
                    if (ck0Var3.f == 5) {
                        int b18 = ck0Var3.b() % 4;
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
                    bj currentPosition4 = q1Var4.getCurrentPosition();
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
                                        bj bjVar4 = (bj) arrayList4.get(i16);
                                        byte b19 = bjVar4.c;
                                        byte b20 = currentPosition4.c;
                                        if (b19 != b20 || ((bjVar4.a == currentPosition4.a && bjVar4.b == currentPosition4.b && b19 == b20 && bjVar4.d == currentPosition4.d) || b19 != b20)) {
                                            i16++;
                                        } else {
                                            round4 = m5.B(4.0f, (int) Math.ceil(max4 * bjVar4.f), round4);
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
                        canvas.drawLine(cd.X ? 0.0f : i0.L(72.0f), bottom, width - (cd.X ? i0.L(72.0f) : 0), bottom, t6.k0);
                    }
                    i11++;
                }
                break;
        }
    }
}
