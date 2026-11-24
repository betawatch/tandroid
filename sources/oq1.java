// default package

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class oq1 extends c49 {
    public final /* synthetic */ byte a;

    public /* synthetic */ oq1(byte b) {
        this.a = b;
    }

    @Override // c49
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        gb2 gb2Var;
        f27 currentMessagesGroup;
        gb2 gb2Var2;
        f27 currentMessagesGroup2;
        gb2 gb2Var3;
        f27 currentMessagesGroup3;
        gb2 gb2Var4;
        f27 currentMessagesGroup4;
        switch (this.a) {
            case 0:
                rect.bottom = 0;
                if ((view instanceof gb2) && (currentMessagesGroup = (gb2Var = (gb2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList = currentMessagesGroup.e;
                    c27 currentPosition = gb2Var.getCurrentPosition();
                    if (currentPosition != null && currentPosition.m != null) {
                        Point point = gl.q;
                        float max = Math.max(point.x, point.y) * 0.5f;
                        int extraInsetHeight = gb2Var.getExtraInsetHeight();
                        int i = 0;
                        while (true) {
                            if (i >= currentPosition.m.length) {
                                int round = (Math.round(gl.p * 7.0f) * (currentPosition.d - currentPosition.c)) + extraInsetHeight;
                                int size = arrayList.size();
                                while (true) {
                                    if (r8 < size) {
                                        c27 c27Var = (c27) arrayList.get(r8);
                                        byte b = c27Var.c;
                                        byte b2 = currentPosition.c;
                                        if (b != b2 || ((c27Var.a == currentPosition.a && c27Var.b == currentPosition.b && b == b2 && c27Var.d == currentPosition.d) || b != b2)) {
                                            r8++;
                                        } else {
                                            round = de9.f(4.0f, (int) Math.ceil(max * c27Var.f), round);
                                        }
                                    }
                                }
                                rect.bottom = -round;
                                break;
                            } else {
                                extraInsetHeight += (int) Math.ceil(r1[i] * max);
                                i++;
                            }
                        }
                    }
                }
                break;
            case 1:
                int S = RecyclerView.S(view);
                rect.setEmpty();
                if (S != 1) {
                    if (S == 2) {
                        rect.left = gl.L(31.0f) + (-gl.L(85.0f));
                        break;
                    }
                } else {
                    rect.left = gl.L(31.0f) + (-gl.L(85.0f));
                    break;
                }
                break;
            case 2:
                rect.right = gl.L(2.0f);
                break;
            case 3:
                rect.right = gl.L(2.0f);
                break;
            case 4:
                super.e(rect, view, recyclerView, p49Var);
                int R = RecyclerView.R(view);
                rect.left = gl.L(8.0f);
                if (R == p49Var.b() - 1) {
                    rect.right = gl.L(10.0f);
                }
                if (R == 0) {
                    rect.left = gl.L(10.0f);
                    break;
                }
                break;
            case 5:
                int L = gl.L(4.0f);
                rect.top = 0;
                rect.bottom = L;
                rect.right = L;
                rect.left = L;
                if (RecyclerView.R(view) % 3 != 2) {
                    rect.right = 0;
                    break;
                }
                break;
            case 6:
                int L2 = gl.L(5.0f);
                rect.right = L2;
                rect.bottom = L2;
                break;
            case 7:
                rect.top = gl.L(6.0f);
                break;
            case 8:
                rect.bottom = 0;
                if ((view instanceof gb2) && (currentMessagesGroup2 = (gb2Var2 = (gb2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList2 = currentMessagesGroup2.e;
                    c27 currentPosition2 = gb2Var2.getCurrentPosition();
                    if (currentPosition2 != null && currentPosition2.m != null) {
                        Point point2 = gl.q;
                        float max2 = Math.max(point2.x, point2.y) * 0.5f;
                        int extraInsetHeight2 = gb2Var2.getExtraInsetHeight();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= currentPosition2.m.length) {
                                int round2 = (Math.round(gl.p * 7.0f) * (currentPosition2.d - currentPosition2.c)) + extraInsetHeight2;
                                int size2 = arrayList2.size();
                                while (true) {
                                    if (r8 < size2) {
                                        c27 c27Var2 = (c27) arrayList2.get(r8);
                                        byte b3 = c27Var2.c;
                                        byte b4 = currentPosition2.c;
                                        if (b3 != b4 || ((c27Var2.a == currentPosition2.a && c27Var2.b == currentPosition2.b && b3 == b4 && c27Var2.d == currentPosition2.d) || b3 != b4)) {
                                            r8++;
                                        } else {
                                            round2 = de9.f(4.0f, (int) Math.ceil(max2 * c27Var2.f), round2);
                                        }
                                    }
                                }
                                rect.bottom = -round2;
                                break;
                            } else {
                                extraInsetHeight2 += (int) Math.ceil(r1[i2] * max2);
                                i2++;
                            }
                        }
                    }
                }
                break;
            case 9:
                rect.bottom = 0;
                if ((view instanceof gb2) && (currentMessagesGroup3 = (gb2Var3 = (gb2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList3 = currentMessagesGroup3.e;
                    c27 currentPosition3 = gb2Var3.getCurrentPosition();
                    if (currentPosition3 != null && currentPosition3.m != null) {
                        Point point3 = gl.q;
                        float max3 = Math.max(point3.x, point3.y) * 0.5f;
                        int extraInsetHeight3 = gb2Var3.getExtraInsetHeight();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= currentPosition3.m.length) {
                                int round3 = (Math.round(gl.p * 7.0f) * (currentPosition3.d - currentPosition3.c)) + extraInsetHeight3;
                                int size3 = arrayList3.size();
                                while (true) {
                                    if (r8 < size3) {
                                        c27 c27Var3 = (c27) arrayList3.get(r8);
                                        byte b5 = c27Var3.c;
                                        byte b6 = currentPosition3.c;
                                        if (b5 != b6 || ((c27Var3.a == currentPosition3.a && c27Var3.b == currentPosition3.b && b5 == b6 && c27Var3.d == currentPosition3.d) || b5 != b6)) {
                                            r8++;
                                        } else {
                                            round3 = de9.f(4.0f, (int) Math.ceil(max3 * c27Var3.f), round3);
                                        }
                                    }
                                }
                                rect.bottom = -round3;
                                break;
                            } else {
                                extraInsetHeight3 += (int) Math.ceil(r1[i3] * max3);
                                i3++;
                            }
                        }
                    }
                }
                break;
            case 10:
                rect.bottom = 0;
                if ((view instanceof gb2) && (currentMessagesGroup4 = (gb2Var4 = (gb2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList4 = currentMessagesGroup4.e;
                    c27 currentPosition4 = gb2Var4.getCurrentPosition();
                    if (currentPosition4 != null && currentPosition4.m != null) {
                        Point point4 = gl.q;
                        float max4 = Math.max(point4.x, point4.y) * 0.5f;
                        int extraInsetHeight4 = gb2Var4.getExtraInsetHeight();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= currentPosition4.m.length) {
                                int round4 = (Math.round(gl.p * 7.0f) * (currentPosition4.d - currentPosition4.c)) + extraInsetHeight4;
                                int size4 = arrayList4.size();
                                while (true) {
                                    if (r8 < size4) {
                                        c27 c27Var4 = (c27) arrayList4.get(r8);
                                        byte b7 = c27Var4.c;
                                        byte b8 = currentPosition4.c;
                                        if (b7 != b8 || ((c27Var4.a == currentPosition4.a && c27Var4.b == currentPosition4.b && b7 == b8 && c27Var4.d == currentPosition4.d) || b7 != b8)) {
                                            r8++;
                                        } else {
                                            round4 = de9.f(4.0f, (int) Math.ceil(max4 * c27Var4.f), round4);
                                        }
                                    }
                                }
                                rect.bottom = -round4;
                                break;
                            } else {
                                extraInsetHeight4 += (int) Math.ceil(r1[i4] * max4);
                                i4++;
                            }
                        }
                    }
                }
                break;
            case 11:
                y29 y29Var = (y29) recyclerView.T(view);
                if (y29Var == null) {
                    rect.left = gl.L(4.0f);
                    rect.right = gl.L(4.0f);
                    break;
                } else {
                    int b9 = y29Var.b() % 4;
                    rect.left = b9 == 0 ? 0 : gl.L(4.0f);
                    rect.right = b9 != 3 ? gl.L(4.0f) : 0;
                    break;
                }
            case 12:
                y29 y29Var2 = (y29) recyclerView.T(view);
                if (y29Var2 == null) {
                    rect.left = gl.L(4.0f);
                    rect.right = gl.L(4.0f);
                    break;
                } else {
                    int b10 = y29Var2.b() % 4;
                    rect.left = b10 == 0 ? 0 : gl.L(4.0f);
                    rect.right = b10 != 3 ? gl.L(4.0f) : 0;
                    break;
                }
            case 13:
                y29 y29Var3 = (y29) recyclerView.T(view);
                if (y29Var3 == null) {
                    rect.left = gl.L(4.0f);
                    rect.right = gl.L(4.0f);
                    break;
                } else if (y29Var3.f == 5) {
                    int b11 = y29Var3.b() % 4;
                    rect.left = b11 == 0 ? 0 : gl.L(4.0f);
                    rect.right = b11 != 3 ? gl.L(4.0f) : 0;
                    break;
                } else {
                    rect.right = 0;
                    rect.left = 0;
                    break;
                }
            case 14:
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
                break;
            case 15:
                int R2 = RecyclerView.R(view);
                rect.left = gl.L(12.0f);
                rect.top = 0;
                rect.bottom = 0;
                if (R2 == p49Var.b() - 1) {
                    rect.right = gl.L(12.0f);
                    break;
                }
                break;
            default:
                super.e(rect, view, recyclerView, p49Var);
                rect.top = 1;
                break;
        }
    }

    @Override // c49
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        switch (this.a) {
            case 16:
                int width = recyclerView.getWidth();
                int childCount = recyclerView.getChildCount();
                int i = childCount - 1;
                int i2 = 0;
                while (i2 < i) {
                    View childAt = recyclerView.getChildAt(i2);
                    View childAt2 = i2 < childCount + (-2) ? recyclerView.getChildAt(i2 + 1) : null;
                    if (RecyclerView.R(childAt) < 0 || (childAt instanceof l35) || (childAt2 instanceof l35)) {
                        canvas2 = canvas;
                    } else {
                        float bottom = childAt.getBottom();
                        canvas2 = canvas;
                        canvas2.drawLine(k96.a0 ? 0.0f : gl.L(72.0f), bottom, width - (k96.a0 ? gl.L(72.0f) : 0), bottom, bkb.j0);
                    }
                    i2++;
                    canvas = canvas2;
                }
                break;
        }
    }
}
