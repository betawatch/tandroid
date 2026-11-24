// default package

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class as1 extends e69 {
    public final /* synthetic */ byte a;

    public /* synthetic */ as1(byte b) {
        this.a = b;
    }

    @Override // e69
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        rc2 rc2Var;
        f47 currentMessagesGroup;
        rc2 rc2Var2;
        f47 currentMessagesGroup2;
        rc2 rc2Var3;
        f47 currentMessagesGroup3;
        rc2 rc2Var4;
        f47 currentMessagesGroup4;
        switch (this.a) {
            case 0:
                rect.bottom = 0;
                if ((view instanceof rc2) && (currentMessagesGroup = (rc2Var = (rc2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList = currentMessagesGroup.e;
                    c47 currentPosition = rc2Var.getCurrentPosition();
                    if (currentPosition != null && currentPosition.m != null) {
                        Point point = gm.q;
                        float max = Math.max(point.x, point.y) * 0.5f;
                        int extraInsetHeight = rc2Var.getExtraInsetHeight();
                        int i = 0;
                        while (true) {
                            if (i >= currentPosition.m.length) {
                                int round = (Math.round(gm.p * 7.0f) * (currentPosition.d - currentPosition.c)) + extraInsetHeight;
                                int size = arrayList.size();
                                while (true) {
                                    if (r8 < size) {
                                        c47 c47Var = (c47) arrayList.get(r8);
                                        byte b = c47Var.c;
                                        byte b2 = currentPosition.c;
                                        if (b != b2 || ((c47Var.a == currentPosition.a && c47Var.b == currentPosition.b && b == b2 && c47Var.d == currentPosition.d) || b != b2)) {
                                            r8++;
                                        } else {
                                            round = hg9.f(4.0f, (int) Math.ceil(max * c47Var.f), round);
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
                        rect.left = gm.L(31.0f) + (-gm.L(85.0f));
                        break;
                    }
                } else {
                    rect.left = gm.L(31.0f) + (-gm.L(85.0f));
                    break;
                }
                break;
            case 2:
                rect.right = gm.L(2.0f);
                break;
            case 3:
                rect.right = gm.L(2.0f);
                break;
            case 4:
                super.d(rect, view, recyclerView, r69Var);
                int R = RecyclerView.R(view);
                rect.left = gm.L(8.0f);
                if (R == r69Var.b() - 1) {
                    rect.right = gm.L(10.0f);
                }
                if (R == 0) {
                    rect.left = gm.L(10.0f);
                    break;
                }
                break;
            case 5:
                int L = gm.L(4.0f);
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
                int L2 = gm.L(5.0f);
                rect.right = L2;
                rect.bottom = L2;
                break;
            case 7:
                rect.top = gm.L(6.0f);
                break;
            case 8:
                rect.bottom = 0;
                if ((view instanceof rc2) && (currentMessagesGroup2 = (rc2Var2 = (rc2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList2 = currentMessagesGroup2.e;
                    c47 currentPosition2 = rc2Var2.getCurrentPosition();
                    if (currentPosition2 != null && currentPosition2.m != null) {
                        Point point2 = gm.q;
                        float max2 = Math.max(point2.x, point2.y) * 0.5f;
                        int extraInsetHeight2 = rc2Var2.getExtraInsetHeight();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= currentPosition2.m.length) {
                                int round2 = (Math.round(gm.p * 7.0f) * (currentPosition2.d - currentPosition2.c)) + extraInsetHeight2;
                                int size2 = arrayList2.size();
                                while (true) {
                                    if (r8 < size2) {
                                        c47 c47Var2 = (c47) arrayList2.get(r8);
                                        byte b3 = c47Var2.c;
                                        byte b4 = currentPosition2.c;
                                        if (b3 != b4 || ((c47Var2.a == currentPosition2.a && c47Var2.b == currentPosition2.b && b3 == b4 && c47Var2.d == currentPosition2.d) || b3 != b4)) {
                                            r8++;
                                        } else {
                                            round2 = hg9.f(4.0f, (int) Math.ceil(max2 * c47Var2.f), round2);
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
                if ((view instanceof rc2) && (currentMessagesGroup3 = (rc2Var3 = (rc2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList3 = currentMessagesGroup3.e;
                    c47 currentPosition3 = rc2Var3.getCurrentPosition();
                    if (currentPosition3 != null && currentPosition3.m != null) {
                        Point point3 = gm.q;
                        float max3 = Math.max(point3.x, point3.y) * 0.5f;
                        int extraInsetHeight3 = rc2Var3.getExtraInsetHeight();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= currentPosition3.m.length) {
                                int round3 = (Math.round(gm.p * 7.0f) * (currentPosition3.d - currentPosition3.c)) + extraInsetHeight3;
                                int size3 = arrayList3.size();
                                while (true) {
                                    if (r8 < size3) {
                                        c47 c47Var3 = (c47) arrayList3.get(r8);
                                        byte b5 = c47Var3.c;
                                        byte b6 = currentPosition3.c;
                                        if (b5 != b6 || ((c47Var3.a == currentPosition3.a && c47Var3.b == currentPosition3.b && b5 == b6 && c47Var3.d == currentPosition3.d) || b5 != b6)) {
                                            r8++;
                                        } else {
                                            round3 = hg9.f(4.0f, (int) Math.ceil(max3 * c47Var3.f), round3);
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
                if ((view instanceof rc2) && (currentMessagesGroup4 = (rc2Var4 = (rc2) view).getCurrentMessagesGroup()) != null) {
                    ArrayList arrayList4 = currentMessagesGroup4.e;
                    c47 currentPosition4 = rc2Var4.getCurrentPosition();
                    if (currentPosition4 != null && currentPosition4.m != null) {
                        Point point4 = gm.q;
                        float max4 = Math.max(point4.x, point4.y) * 0.5f;
                        int extraInsetHeight4 = rc2Var4.getExtraInsetHeight();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= currentPosition4.m.length) {
                                int round4 = (Math.round(gm.p * 7.0f) * (currentPosition4.d - currentPosition4.c)) + extraInsetHeight4;
                                int size4 = arrayList4.size();
                                while (true) {
                                    if (r8 < size4) {
                                        c47 c47Var4 = (c47) arrayList4.get(r8);
                                        byte b7 = c47Var4.c;
                                        byte b8 = currentPosition4.c;
                                        if (b7 != b8 || ((c47Var4.a == currentPosition4.a && c47Var4.b == currentPosition4.b && b7 == b8 && c47Var4.d == currentPosition4.d) || b7 != b8)) {
                                            r8++;
                                        } else {
                                            round4 = hg9.f(4.0f, (int) Math.ceil(max4 * c47Var4.f), round4);
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
                b59 b59Var = (b59) recyclerView.T(view);
                if (b59Var == null) {
                    rect.left = gm.L(4.0f);
                    rect.right = gm.L(4.0f);
                    break;
                } else {
                    int b9 = b59Var.b() % 4;
                    rect.left = b9 == 0 ? 0 : gm.L(4.0f);
                    rect.right = b9 != 3 ? gm.L(4.0f) : 0;
                    break;
                }
            case 12:
                b59 b59Var2 = (b59) recyclerView.T(view);
                if (b59Var2 == null) {
                    rect.left = gm.L(4.0f);
                    rect.right = gm.L(4.0f);
                    break;
                } else {
                    int b10 = b59Var2.b() % 4;
                    rect.left = b10 == 0 ? 0 : gm.L(4.0f);
                    rect.right = b10 != 3 ? gm.L(4.0f) : 0;
                    break;
                }
            case 13:
                b59 b59Var3 = (b59) recyclerView.T(view);
                if (b59Var3 == null) {
                    rect.left = gm.L(4.0f);
                    rect.right = gm.L(4.0f);
                    break;
                } else if (b59Var3.f == 5) {
                    int b11 = b59Var3.b() % 4;
                    rect.left = b11 == 0 ? 0 : gm.L(4.0f);
                    rect.right = b11 != 3 ? gm.L(4.0f) : 0;
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
                rect.left = gm.L(12.0f);
                rect.top = 0;
                rect.bottom = 0;
                if (R2 == r69Var.b() - 1) {
                    rect.right = gm.L(12.0f);
                    break;
                }
                break;
            default:
                super.d(rect, view, recyclerView, r69Var);
                rect.top = 1;
                break;
        }
    }

    @Override // e69
    public final void e(Canvas canvas, RecyclerView recyclerView) {
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
                    if (RecyclerView.R(childAt) < 0 || (childAt instanceof l55) || (childAt2 instanceof l55)) {
                        canvas2 = canvas;
                    } else {
                        float bottom = childAt.getBottom();
                        canvas2 = canvas;
                        canvas2.drawLine(jb6.a0 ? 0.0f : gm.L(72.0f), bottom, width - (jb6.a0 ? gm.L(72.0f) : 0), bottom, cmb.j0);
                    }
                    i2++;
                    canvas = canvas2;
                }
                break;
        }
    }
}
