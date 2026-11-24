// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jr extends w39 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jr(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    public static int D(gb2 gb2Var, int i, boolean z) {
        int w;
        ArrayList arrayList;
        CharSequence charSequence;
        float lineBottom;
        i27 i27Var;
        if (gb2Var != null) {
            nb2 nb2Var = gb2Var.ub;
            k27 messageObject = gb2Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.y2 != null) {
                    gb2Var.V2(true);
                    rh9 rh9Var = messageObject.y2;
                    ArrayList arrayList2 = rh9Var.n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) rh9Var.o.get(size)).intValue();
                        if (i < intValue) {
                            size--;
                        } else {
                            Layout a = ((pib) arrayList2.get(size)).a();
                            if (a != null) {
                                int lineForOffset = a.getLineForOffset(Math.min(i - intValue, a.getText().length()));
                                return ((pib) arrayList2.get(size)).getY() + gb2Var.u0 + (z ? a.getLineBottom(lineForOffset) : a.getLineTop(lineForOffset));
                            }
                        }
                    }
                } else if (messageObject.c1() == 0) {
                    if (TextUtils.isEmpty(messageObject.z) || (i27Var = gb2Var.m3) == null) {
                        gb2Var.V2(true);
                        int i2 = gb2Var.u0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.B2;
                        w = gb2Var.v1 ? de9.w(10.0f, gb2Var.W1, i2) : i2;
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    } else {
                        w = (int) gb2Var.t3;
                        charSequence = messageObject.z;
                        arrayList = i27Var.e;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            h27 h27Var = (h27) arrayList.get(i3);
                            StaticLayout staticLayout = h27Var.e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i4 = h27Var.n;
                            if (i > i4) {
                                if (i - i4 > charSequence3.length() - 1) {
                                    lineBottom = w + ((int) (h27Var.p(arrayList, nb2Var) + h27Var.f + h27Var.w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i - h27Var.n);
                                    lineBottom = (z ? staticLayout.getLineBottom(lineForOffset2) : staticLayout.getLineTop(lineForOffset2)) + h27Var.p(arrayList, nb2Var) + w + h27Var.f;
                                }
                                return (int) lineBottom;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // w39
    public final int b() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((or) obj).f3.size();
            case 1:
                return ((ib0) obj).f3.size() + 1;
            case 2:
                return ((b81) obj).L;
            case 3:
            case 4:
                return 1;
            case 5:
                m27 m27Var = ((f37) obj).r;
                if (m27Var == null) {
                    return 0;
                }
                return m27Var.f.size();
            default:
                return ((z08) obj).f.size();
        }
    }

    @Override // w39
    public final long c(int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 1:
                if (i >= ((ib0) obj).f3.size()) {
                    return 1L;
                }
                return ((hb0) r3.get(i)).a;
            case 2:
                b81 b81Var = (b81) obj;
                return ((b81Var.J - (i / 12)) * 100) + (b81Var.K - (i % 12));
            default:
                return super.c(i);
        }
    }

    @Override // w39
    public final int d(int i) {
        switch (this.c) {
            case 1:
                return i >= ((ib0) this.d).f3.size() ? 1 : 0;
            case 5:
                return 0;
            default:
                return super.d(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0377  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean[], vkb, wjb] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.view.View, java.lang.Object, org.telegram.tgnet.TLRPC$PhotoSize] */
    /* JADX WARN: Type inference failed for: r4v13 */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        ?? r12;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        SparseArray sparseArray;
        BitmapDrawable bitmapDrawable;
        int i4;
        byte b = this.c;
        ?? r4 = 0;
        Object obj = this.d;
        switch (b) {
            case 0:
                nr nrVar = (nr) s49Var.a;
                c06 c06Var = (c06) ((or) obj).f3.get(i);
                int i5 = nr.h;
                mr mrVar = nrVar.c;
                int i6 = c06Var.b;
                int i7 = c06Var.d;
                mrVar.setImageResource(i6);
                TextView textView = nrVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!c06Var.e || y6c.n()) {
                    marginLayoutParams.rightMargin = 0;
                    r12 = 0;
                    textView.setText(k96.M0(i7, null));
                } else {
                    SpannableString spannableString = new SpannableString("d ".concat(k96.M0(i7, null)));
                    cm2 cm2Var = new cm2(R.drawable.msg_mini_premiumlock, 0);
                    cm2Var.n = 1;
                    cm2Var.c(gl.L(13.0f));
                    spannableString.setSpan(cm2Var, 0, 1, 33);
                    marginLayoutParams.rightMargin = gl.L(4.0f);
                    textView.setText(spannableString);
                    r12 = 0;
                }
                nrVar.b(jme.a(c06Var), false);
                int L = gl.L(18.0f);
                int i8 = bkb.h6;
                zkb.R(mrVar, bkb.i0(L, L, L, L, 0, bkb.w0(r12, i8, false), -16777216), r12, zkb.M(i8), r12);
                mrVar.setForeground(c06Var.c);
                break;
            case 1:
                ib0 ib0Var = (ib0) obj;
                mb0 mb0Var = ib0Var.k3;
                ArrayList arrayList = ib0Var.f3;
                jb0 jb0Var = (jb0) s49Var.a;
                if (s49Var.f != 0) {
                    jb0Var.d = true;
                    i2 = ((d) mb0Var).currentAccount;
                    boolean z3 = !y6c.h(i2).p();
                    if (jb0Var.w != z3) {
                        jb0Var.w = z3;
                        jb0Var.invalidate();
                    }
                    jb0Var.a = ib0Var.j3;
                    z = ib0Var.h3 == 1;
                    if (jb0Var.c != z) {
                        jb0Var.c = z;
                        jb0Var.invalidate();
                        break;
                    }
                } else {
                    jb0Var.d = false;
                    hb0 hb0Var = (hb0) arrayList.get(i);
                    if (hb0Var.b) {
                        i3 = ((d) mb0Var).currentAccount;
                        if (!y6c.h(i3).p()) {
                            z2 = true;
                            if (jb0Var.w != z2) {
                                jb0Var.w = z2;
                                jb0Var.invalidate();
                            }
                            jb0Var.a = hb0Var;
                            z = ib0Var.h3 == ((hb0) arrayList.get(i)).a;
                            if (jb0Var.c == z) {
                                jb0Var.c = z;
                                jb0Var.invalidate();
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (jb0Var.w != z2) {
                    }
                    jb0Var.a = hb0Var;
                    if (ib0Var.h3 == ((hb0) arrayList.get(i)).a) {
                    }
                    if (jb0Var.c == z) {
                    }
                }
                break;
            case 2:
                y71 y71Var = (y71) s49Var.a;
                b81 b81Var = (b81) obj;
                int i9 = b81Var.J - (i / 12);
                int i10 = b81Var.K - (i % 12);
                if (i10 < 0) {
                    i10 += 12;
                    i9--;
                }
                int i11 = y71Var.b;
                SparseArray sparseArray2 = (SparseArray) b81Var.T.get((i9 * 100) + i10);
                b81 b81Var2 = y71Var.y;
                boolean z4 = (i9 == y71Var.b && i10 == y71Var.c) ? false : true;
                y71Var.b = i9;
                y71Var.c = i10;
                y71Var.n = sparseArray2;
                if (z4 && y71Var.r != null) {
                    for (int i12 = 0; i12 < y71Var.r.size(); i12++) {
                        ((ImageReceiver) y71Var.r.valueAt(i12)).K();
                        ((ImageReceiver) y71Var.r.valueAt(i12)).p0(null);
                    }
                    y71Var.r = null;
                }
                if (sparseArray2 != null) {
                    if (y71Var.r == null) {
                        y71Var.r = new SparseArray();
                    }
                    int i13 = 0;
                    while (i13 < sparseArray2.size()) {
                        int keyAt = sparseArray2.keyAt(i13);
                        if (y71Var.r.get(keyAt, r4) == null && ((z71) sparseArray2.get(keyAt)).g) {
                            ImageReceiver imageReceiver = new ImageReceiver(r4);
                            imageReceiver.p0(y71Var);
                            k27 k27Var = ((z71) sparseArray2.get(keyAt)).a;
                            if (k27Var != null) {
                                boolean t2 = k27Var.t2();
                                if (k27.K4(k27Var.k)) {
                                    TLRPC.Document F0 = k27Var.F0();
                                    TLRPC.PhotoSize w = ba4.w(F0.thumbs, 50, false, r4, false);
                                    sparseArray = sparseArray2;
                                    TLRPC.PhotoSize w2 = ba4.w(F0.thumbs, kk7.q5, false, r4, false);
                                    if (w == w2) {
                                        w2 = r4;
                                    }
                                    if (w != null) {
                                        if (k27Var.I1 != null) {
                                            imageReceiver.d0(gl5.c(w2, F0), t2 ? "5_5_b" : "44_44", k27Var.I1, null, k27Var, 0);
                                        } else {
                                            imageReceiver.b0(gl5.c(w2, F0), t2 ? "5_5_b" : "44_44", gl5.c(w, F0), "b", null, k27Var, 0);
                                        }
                                    }
                                } else {
                                    sparseArray = sparseArray2;
                                    TLRPC.MessageMedia messageMedia = k27Var.k.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !k27Var.p0.isEmpty()) {
                                        TLRPC.PhotoSize w3 = ba4.w(k27Var.p0, 50, false, r4, false);
                                        TLRPC.PhotoSize w4 = ba4.w(k27Var.p0, kk7.q5, false, w3, false);
                                        if (!k27Var.z0) {
                                            i4 = ((d) b81Var2).currentAccount;
                                            if (!up3.q(i4).d(k27Var)) {
                                                BitmapDrawable bitmapDrawable2 = k27Var.I1;
                                                if (bitmapDrawable2 != null) {
                                                    imageReceiver.d0(null, null, bitmapDrawable2, null, k27Var, 0);
                                                } else {
                                                    imageReceiver.b0(null, null, gl5.f(w3, k27Var.n0), "b", null, k27Var, 0);
                                                }
                                            }
                                        }
                                        if (w4 == w3) {
                                            w3 = r4;
                                        }
                                        BitmapDrawable bitmapDrawable3 = k27Var.I1;
                                        TLObject tLObject = k27Var.n0;
                                        if (bitmapDrawable3 != null) {
                                            gl5 f = gl5.f(w4, tLObject);
                                            String str = t2 ? "5_5_b" : "44_44";
                                            BitmapDrawable bitmapDrawable4 = k27Var.I1;
                                            if (w4 != null) {
                                                bitmapDrawable = bitmapDrawable4;
                                                r19 = w4.size;
                                            } else {
                                                bitmapDrawable = bitmapDrawable4;
                                            }
                                            imageReceiver.Z(f, str, null, null, bitmapDrawable, r19, null, k27Var, k27.Q5(k27Var.k) ? 2 : 1);
                                        } else {
                                            imageReceiver.Z(gl5.f(w4, tLObject), t2 ? "5_5_b" : "44_44", gl5.f(w3, k27Var.n0), "b", null, w4 != null ? w4.size : 0L, null, k27Var, k27.Q5(k27Var.k) ? 2 : 1);
                                        }
                                    }
                                }
                                imageReceiver.q0(gl.L(22.0f));
                                y71Var.r.put(keyAt, imageReceiver);
                                i13++;
                                sparseArray2 = sparseArray;
                                r4 = 0;
                            }
                        }
                        sparseArray = sparseArray2;
                        i13++;
                        sparseArray2 = sparseArray;
                        r4 = 0;
                    }
                }
                int i14 = i10 + 1;
                y71Var.d = YearMonth.of(i9, i14).lengthOfMonth();
                Calendar calendar = Calendar.getInstance();
                calendar.set(i9, i10, 0);
                y71Var.e = (calendar.get(7) + 6) % 7;
                y71Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i15 = y71Var.d + y71Var.e;
                y71Var.f = ((int) (i15 / 7.0f)) + (i15 % 7 == 0 ? 0 : 1);
                calendar.set(i9, i14, 0);
                y71Var.a.l(k96.e0(calendar.getTimeInMillis() / 1000, true), false);
                b81Var2.z0(y71Var, false);
                y71Var.c(b81Var.Q, b81Var.R);
                y71Var.b(1.0f);
                b81Var.z0(y71Var, false);
                break;
            case 3:
            case 4:
                break;
            case 5:
                f37 f37Var = (f37) obj;
                fu fuVar = f37Var.f;
                int i16 = f37Var.a;
                m27 m27Var = f37Var.r;
                if (m27Var != null && s49Var.f == 0) {
                    gb2 gb2Var = (gb2) s49Var.a;
                    gb2Var.setInvalidateSpoilersParent(m27Var.i);
                    gb2Var.B3(fuVar.getMeasuredWidth(), fuVar.getMeasuredHeight());
                    int e1 = gb2Var.getMessageObject() != null ? gb2Var.getMessageObject().e1() : 0;
                    if (i16 == 2) {
                        f37Var.d0.d.b((k27) f37Var.r.f.get(i));
                    }
                    k27 k27Var2 = (k27) f37Var.r.f.get(i);
                    m27 m27Var2 = f37Var.r;
                    gb2Var.z3(k27Var2, (f27) m27Var2.d.get(((k27) m27Var2.f.get(i)).c1()), true, true, false, false);
                    if (i16 == 1) {
                        gb2Var.setDelegate(new vi2((byte) 22));
                    }
                    if (f37Var.r.f.size() > 1) {
                        gb2Var.m3(i16 == 1, false);
                        boolean z5 = e1 == ((k27) f37Var.r.f.get(i)).e1();
                        m27 m27Var3 = f37Var.r;
                        boolean z6 = m27Var3.g.get(((k27) m27Var3.f.get(i)).e1(), false);
                        gb2Var.o3(z6, z6, z5);
                        break;
                    }
                }
                break;
            default:
                TextView textView2 = (TextView) s49Var.a;
                z08 z08Var = (z08) obj;
                textView2.setText((CharSequence) z08Var.f.get(i));
                textView2.setTextColor(i == z08Var.d ? z08Var.F : z08Var.E);
                break;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                Context context = viewGroup.getContext();
                nr nrVar = new nr(context);
                Paint paint = new Paint(1);
                nrVar.a = paint;
                Paint paint2 = new Paint(1);
                nrVar.b = paint2;
                nrVar.setOrientation(1);
                nrVar.setWillNotDraw(false);
                mr mrVar = new mr(context);
                nrVar.c = mrVar;
                mrVar.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
                nrVar.addView(mrVar, nme.r(58, 58, 1));
                TextView textView = new TextView(context);
                nrVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(bkb.w0(null, bkb.F6, false));
                nrVar.addView(textView, nme.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, gl.L(0.5f)));
                paint2.setColor(-1);
                return new y29(nrVar);
            case 1:
                ib0 ib0Var = (ib0) obj;
                return new y29(new jb0(ib0Var.k3, ib0Var.getContext()));
            case 2:
                return new y29(new y71((b81) obj, viewGroup.getContext()));
            case 3:
                return new y29(((m52) obj).w);
            case 4:
                return new y29(new sb((byte) 6, ((f72) obj).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                f37 f37Var = (f37) obj;
                l37 l37Var = f37Var.d0;
                d37 d37Var = new d37(this, context2, l37Var.x, f37Var.K, l37Var.G);
                d37Var.setClipChildren(false);
                d37Var.setClipToPadding(false);
                d37Var.setDelegate(new e37(this));
                return new y29(d37Var);
            default:
                l46 l46Var = new l46(viewGroup.getContext(), null);
                l46Var.setGravity(17);
                l46Var.setTypeface(gl.o());
                l46Var.setTextSize(1, 14.0f);
                l46Var.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
                l46Var.setEllipsize(TextUtils.TruncateAt.END);
                l46Var.setSingleLine();
                l46Var.setMaxLines(1);
                l46Var.setLayoutParams(new e49(-2, gl.L(28.0f)));
                ote.b(l46Var, 0.075f, 1.4f);
                return new y29(l46Var);
        }
    }

    @Override // w39
    public final void y(s49 s49Var) {
        int i;
        int i2;
        switch (this.c) {
            case 5:
                f37 f37Var = (f37) this.d;
                z27 z27Var = f37Var.e;
                l37 l37Var = f37Var.d0;
                if (f37Var.r != null && (i = f37Var.a) != 1) {
                    View view = s49Var.a;
                    if (view instanceof gb2) {
                        gb2 gb2Var = (gb2) view;
                        if (i != 0) {
                            gb2Var.setDrawSelectionBackground(false);
                            break;
                        } else {
                            f27 c = f37Var.c(gb2Var.getMessageObject());
                            gb2Var.setDrawSelectionBackground(c == null);
                            gb2Var.o3(true, c == null, false);
                            o27 o27Var = l37Var.d;
                            if (!o27Var.i && o27Var.d != null && f37Var.d(gb2Var)) {
                                k27 messageObject = gb2Var.getMessageObject();
                                o27 o27Var2 = l37Var.d;
                                bu1 bu1Var = o27Var2.d;
                                if (bu1Var.m && messageObject != null && messageObject.y2 != null && ((i2 = o27Var2.e) < 0 || o27Var2.f <= i2)) {
                                    String str = bu1Var.i;
                                    int[] f = str == null ? null : vh9.f(messageObject, str, bu1Var.o);
                                    o27 o27Var3 = l37Var.d;
                                    if (f != null) {
                                        o27Var3.e = f[0];
                                        o27Var3.f = f[1];
                                    } else {
                                        o27Var3.e = 0;
                                        o27Var3.f = Math.min(na7.q1(l37Var.x).k4.N1.f(), bu1.d(messageObject));
                                    }
                                }
                            }
                            o27 o27Var4 = l37Var.d;
                            if (!o27Var4.i && o27Var4.d != null && o27Var4.e >= 0 && f37Var.d(gb2Var) && !z27Var.w()) {
                                o27 o27Var5 = l37Var.d;
                                z27Var.Z(gb2Var, o27Var5.e, o27Var5.f);
                                if (f37Var.c0) {
                                    f37Var.M = D(gb2Var, l37Var.d.e, false);
                                    f37Var.N = D(gb2Var, l37Var.d.f, true);
                                    f37Var.O = true;
                                    f37Var.c0 = false;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    private final void E(s49 s49Var, int i) {
    }

    private final void F(s49 s49Var, int i) {
    }
}
