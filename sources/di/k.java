package di;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.aj;
import org.telegram.messenger.dj;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class k extends v4.m0 {
    public final /* synthetic */ int a;

    public /* synthetic */ k(int i7) {
        this.a = i7;
    }

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        org.telegram.ui.Cells.q1 q1Var;
        dj currentMessagesGroup;
        org.telegram.ui.Cells.q1 q1Var2;
        dj currentMessagesGroup2;
        org.telegram.ui.Cells.q1 q1Var3;
        dj currentMessagesGroup3;
        org.telegram.ui.Cells.q1 q1Var4;
        dj currentMessagesGroup4;
        switch (this.a) {
            case 0:
                int S = RecyclerView.S(view);
                rect.setEmpty();
                if (S != 1) {
                    if (S == 2) {
                        rect.left = org.telegram.messenger.g0.L(31.0f) + (-org.telegram.messenger.g0.L(85.0f));
                        break;
                    }
                } else {
                    rect.left = org.telegram.messenger.g0.L(31.0f) + (-org.telegram.messenger.g0.L(85.0f));
                    break;
                }
                break;
            case 1:
                int L = org.telegram.messenger.g0.L(4.0f);
                rect.top = 0;
                rect.bottom = L;
                rect.right = L;
                rect.left = L;
                if (RecyclerView.R(view) % 3 != 2) {
                    rect.right = 0;
                    break;
                }
                break;
            case 2:
                int L2 = org.telegram.messenger.g0.L(5.0f);
                rect.right = L2;
                rect.bottom = L2;
                break;
            case 3:
                super.e(rect, view, recyclerView, a1Var);
                int R = RecyclerView.R(view);
                rect.left = org.telegram.messenger.g0.L(8.0f);
                if (R == a1Var.b() - 1) {
                    rect.right = org.telegram.messenger.g0.L(10.0f);
                }
                if (R == 0) {
                    rect.left = org.telegram.messenger.g0.L(10.0f);
                    break;
                }
                break;
            case 4:
                rect.top = org.telegram.messenger.g0.L(6.0f);
                break;
            case 5:
                int i7 = 0;
                rect.bottom = 0;
                if ((view instanceof org.telegram.ui.Cells.q1) && (currentMessagesGroup = (q1Var = (org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList = currentMessagesGroup.e;
                    aj currentPosition = q1Var.getCurrentPosition();
                    if (currentPosition != null && currentPosition.m != null) {
                        Point point = org.telegram.messenger.g0.q;
                        float max = Math.max(point.x, point.y) * 0.5f;
                        int extraInsetHeight = q1Var.getExtraInsetHeight();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= currentPosition.m.length) {
                                int round = (Math.round(org.telegram.messenger.g0.p * 7.0f) * (currentPosition.d - currentPosition.c)) + extraInsetHeight;
                                int size = arrayList.size();
                                while (true) {
                                    if (i7 < size) {
                                        aj ajVar = (aj) arrayList.get(i7);
                                        byte b10 = ajVar.c;
                                        byte b11 = currentPosition.c;
                                        if (b10 != b11 || ((ajVar.a == currentPosition.a && ajVar.b == currentPosition.b && b10 == b11 && ajVar.d == currentPosition.d) || b10 != b11)) {
                                            i7++;
                                        } else {
                                            round = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max * ajVar.f), round);
                                        }
                                    }
                                }
                                rect.bottom = -round;
                                break;
                            } else {
                                extraInsetHeight += (int) Math.ceil(r3[i10] * max);
                                i10++;
                            }
                        }
                    }
                }
                break;
            case 6:
                rect.right = org.telegram.messenger.g0.L(2.0f);
                break;
            case 7:
                rect.right = org.telegram.messenger.g0.L(2.0f);
                break;
            case 8:
                int i11 = 0;
                rect.bottom = 0;
                if ((view instanceof org.telegram.ui.Cells.q1) && (currentMessagesGroup2 = (q1Var2 = (org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList2 = currentMessagesGroup2.e;
                    aj currentPosition2 = q1Var2.getCurrentPosition();
                    if (currentPosition2 != null && currentPosition2.m != null) {
                        Point point2 = org.telegram.messenger.g0.q;
                        float max2 = Math.max(point2.x, point2.y) * 0.5f;
                        int extraInsetHeight2 = q1Var2.getExtraInsetHeight();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= currentPosition2.m.length) {
                                int round2 = (Math.round(org.telegram.messenger.g0.p * 7.0f) * (currentPosition2.d - currentPosition2.c)) + extraInsetHeight2;
                                int size2 = arrayList2.size();
                                while (true) {
                                    if (i11 < size2) {
                                        aj ajVar2 = (aj) arrayList2.get(i11);
                                        byte b12 = ajVar2.c;
                                        byte b13 = currentPosition2.c;
                                        if (b12 != b13 || ((ajVar2.a == currentPosition2.a && ajVar2.b == currentPosition2.b && b12 == b13 && ajVar2.d == currentPosition2.d) || b12 != b13)) {
                                            i11++;
                                        } else {
                                            round2 = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max2 * ajVar2.f), round2);
                                        }
                                    }
                                }
                                rect.bottom = -round2;
                                break;
                            } else {
                                extraInsetHeight2 += (int) Math.ceil(r3[i12] * max2);
                                i12++;
                            }
                        }
                    }
                }
                break;
            case 9:
                xi0 xi0Var = (xi0) recyclerView.T(view);
                if (xi0Var == null) {
                    rect.left = org.telegram.messenger.g0.L(4.0f);
                    rect.right = org.telegram.messenger.g0.L(4.0f);
                    break;
                } else {
                    int b14 = xi0Var.b() % 4;
                    rect.left = b14 == 0 ? 0 : org.telegram.messenger.g0.L(4.0f);
                    rect.right = b14 != 3 ? org.telegram.messenger.g0.L(4.0f) : 0;
                    break;
                }
            case 10:
                xi0 xi0Var2 = (xi0) recyclerView.T(view);
                if (xi0Var2 == null) {
                    rect.left = org.telegram.messenger.g0.L(4.0f);
                    rect.right = org.telegram.messenger.g0.L(4.0f);
                    break;
                } else {
                    int b15 = xi0Var2.b() % 4;
                    rect.left = b15 == 0 ? 0 : org.telegram.messenger.g0.L(4.0f);
                    rect.right = b15 != 3 ? org.telegram.messenger.g0.L(4.0f) : 0;
                    break;
                }
            case 11:
                xi0 xi0Var3 = (xi0) recyclerView.T(view);
                if (xi0Var3 == null) {
                    rect.left = org.telegram.messenger.g0.L(4.0f);
                    rect.right = org.telegram.messenger.g0.L(4.0f);
                    break;
                } else {
                    if (xi0Var3.f == 5) {
                        int b16 = xi0Var3.b() % 4;
                        rect.left = b16 == 0 ? 0 : org.telegram.messenger.g0.L(4.0f);
                        rect.right = b16 != 3 ? org.telegram.messenger.g0.L(4.0f) : 0;
                        break;
                    } else {
                        rect.right = 0;
                        rect.left = 0;
                        break;
                    }
                }
            case 12:
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
                break;
            case 13:
                int i13 = 0;
                rect.bottom = 0;
                if ((view instanceof org.telegram.ui.Cells.q1) && (currentMessagesGroup3 = (q1Var3 = (org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList3 = currentMessagesGroup3.e;
                    aj currentPosition3 = q1Var3.getCurrentPosition();
                    if (currentPosition3 != null && currentPosition3.m != null) {
                        Point point3 = org.telegram.messenger.g0.q;
                        float max3 = Math.max(point3.x, point3.y) * 0.5f;
                        int extraInsetHeight3 = q1Var3.getExtraInsetHeight();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= currentPosition3.m.length) {
                                int round3 = (Math.round(org.telegram.messenger.g0.p * 7.0f) * (currentPosition3.d - currentPosition3.c)) + extraInsetHeight3;
                                int size3 = arrayList3.size();
                                while (true) {
                                    if (i13 < size3) {
                                        aj ajVar3 = (aj) arrayList3.get(i13);
                                        byte b17 = ajVar3.c;
                                        byte b18 = currentPosition3.c;
                                        if (b17 != b18 || ((ajVar3.a == currentPosition3.a && ajVar3.b == currentPosition3.b && b17 == b18 && ajVar3.d == currentPosition3.d) || b17 != b18)) {
                                            i13++;
                                        } else {
                                            round3 = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max3 * ajVar3.f), round3);
                                        }
                                    }
                                }
                                rect.bottom = -round3;
                                break;
                            } else {
                                extraInsetHeight3 += (int) Math.ceil(r3[i14] * max3);
                                i14++;
                            }
                        }
                    }
                }
                break;
            case 14:
                int R2 = RecyclerView.R(view);
                rect.left = org.telegram.messenger.g0.L(12.0f);
                rect.top = 0;
                rect.bottom = 0;
                if (R2 == a1Var.b() - 1) {
                    rect.right = org.telegram.messenger.g0.L(12.0f);
                    break;
                }
                break;
            case 15:
                super.e(rect, view, recyclerView, a1Var);
                rect.top = 1;
                break;
            default:
                int i15 = 0;
                rect.bottom = 0;
                if ((view instanceof org.telegram.ui.Cells.q1) && (currentMessagesGroup4 = (q1Var4 = (org.telegram.ui.Cells.q1) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList4 = currentMessagesGroup4.e;
                    aj currentPosition4 = q1Var4.getCurrentPosition();
                    if (currentPosition4 != null && currentPosition4.m != null) {
                        Point point4 = org.telegram.messenger.g0.q;
                        float max4 = Math.max(point4.x, point4.y) * 0.5f;
                        int extraInsetHeight4 = q1Var4.getExtraInsetHeight();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= currentPosition4.m.length) {
                                int round4 = (Math.round(org.telegram.messenger.g0.p * 7.0f) * (currentPosition4.d - currentPosition4.c)) + extraInsetHeight4;
                                int size4 = arrayList4.size();
                                while (true) {
                                    if (i15 < size4) {
                                        aj ajVar4 = (aj) arrayList4.get(i15);
                                        byte b19 = ajVar4.c;
                                        byte b20 = currentPosition4.c;
                                        if (b19 != b20 || ((ajVar4.a == currentPosition4.a && ajVar4.b == currentPosition4.b && b19 == b20 && ajVar4.d == currentPosition4.d) || b19 != b20)) {
                                            i15++;
                                        } else {
                                            round4 = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max4 * ajVar4.f), round4);
                                        }
                                    }
                                }
                                rect.bottom = -round4;
                                break;
                            } else {
                                extraInsetHeight4 += (int) Math.ceil(r3[i16] * max4);
                                i16++;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // v4.m0
    public void f(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 15:
                int width = recyclerView.getWidth();
                int childCount = recyclerView.getChildCount();
                int i7 = childCount - 1;
                int i10 = 0;
                while (i10 < i7) {
                    View childAt = recyclerView.getChildAt(i10);
                    View childAt2 = i10 < childCount + (-2) ? recyclerView.getChildAt(i10 + 1) : null;
                    if (RecyclerView.R(childAt) >= 0 && !(childAt instanceof org.telegram.ui.Cells.x3) && !(childAt2 instanceof org.telegram.ui.Cells.x3)) {
                        float bottom = childAt.getBottom();
                        canvas.drawLine(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(72.0f), bottom, width - (hd.a0 ? org.telegram.messenger.g0.L(72.0f) : 0), bottom, org.telegram.ui.ActionBar.k6.k0);
                    }
                    i10++;
                }
                break;
        }
    }
}
