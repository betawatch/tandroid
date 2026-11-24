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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class js extends y59 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    public /* synthetic */ js(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    public static int D(rc2 rc2Var, int i, boolean z) {
        int v;
        ArrayList arrayList;
        CharSequence charSequence;
        float lineBottom;
        i47 i47Var;
        if (rc2Var != null) {
            yc2 yc2Var = rc2Var.ub;
            k47 messageObject = rc2Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.y2 != null) {
                    rc2Var.V2(true);
                    uj9 uj9Var = messageObject.y2;
                    ArrayList arrayList2 = uj9Var.n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) uj9Var.o.get(size)).intValue();
                        if (i < intValue) {
                            size--;
                        } else {
                            Layout a = ((qkb) arrayList2.get(size)).a();
                            if (a != null) {
                                int lineForOffset = a.getLineForOffset(Math.min(i - intValue, a.getText().length()));
                                return ((qkb) arrayList2.get(size)).getY() + rc2Var.u0 + (z ? a.getLineBottom(lineForOffset) : a.getLineTop(lineForOffset));
                            }
                        }
                    }
                } else if (messageObject.c1() == 0) {
                    if (TextUtils.isEmpty(messageObject.z) || (i47Var = rc2Var.m3) == null) {
                        rc2Var.V2(true);
                        int i2 = rc2Var.u0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.B2;
                        v = rc2Var.v1 ? hg9.v(10.0f, rc2Var.W1, i2) : i2;
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    } else {
                        v = (int) rc2Var.t3;
                        charSequence = messageObject.z;
                        arrayList = i47Var.e;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            h47 h47Var = (h47) arrayList.get(i3);
                            StaticLayout staticLayout = h47Var.e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i4 = h47Var.n;
                            if (i > i4) {
                                if (i - i4 > charSequence3.length() - 1) {
                                    lineBottom = v + ((int) (h47Var.p(arrayList, yc2Var) + h47Var.f + h47Var.w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i - h47Var.n);
                                    lineBottom = (z ? staticLayout.getLineBottom(lineForOffset2) : staticLayout.getLineTop(lineForOffset2)) + h47Var.p(arrayList, yc2Var) + v + h47Var.f;
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

    @Override // y59
    public final int b() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((os) obj).f3.size();
            case 1:
                return ((ic0) obj).f3.size() + 1;
            case 2:
                return ((k91) obj).L;
            case 3:
            case 4:
                return 1;
            case 5:
                m47 m47Var = ((f57) obj).r;
                if (m47Var == null) {
                    return 0;
                }
                return m47Var.f.size();
            default:
                return ((c38) obj).f.size();
        }
    }

    @Override // y59
    public final long c(int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 1:
                if (i >= ((ic0) obj).f3.size()) {
                    return 1L;
                }
                return ((hc0) r3.get(i)).a;
            case 2:
                k91 k91Var = (k91) obj;
                return ((k91Var.J - (i / 12)) * 100) + (k91Var.K - (i % 12));
            default:
                return super.c(i);
        }
    }

    @Override // y59
    public final int d(int i) {
        switch (this.c) {
            case 1:
                return i >= ((ic0) this.d).f3.size() ? 1 : 0;
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
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean[], wmb, ylb] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.view.View, java.lang.Object, org.telegram.tgnet.TLRPC$PhotoSize] */
    /* JADX WARN: Type inference failed for: r4v13 */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
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
                ns nsVar = (ns) u69Var.a;
                c26 c26Var = (c26) ((os) obj).f3.get(i);
                int i5 = ns.h;
                ms msVar = nsVar.c;
                int i6 = c26Var.b;
                int i7 = c26Var.d;
                msVar.setImageResource(i6);
                TextView textView = nsVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!c26Var.e || z8c.n()) {
                    marginLayoutParams.rightMargin = 0;
                    r12 = 0;
                    textView.setText(jb6.M0(i7, null));
                } else {
                    SpannableString spannableString = new SpannableString("d ".concat(jb6.M0(i7, null)));
                    pn2 pn2Var = new pn2(R.drawable.msg_mini_premiumlock, 0);
                    pn2Var.n = 1;
                    pn2Var.c(gm.L(13.0f));
                    spannableString.setSpan(pn2Var, 0, 1, 33);
                    marginLayoutParams.rightMargin = gm.L(4.0f);
                    textView.setText(spannableString);
                    r12 = 0;
                }
                nsVar.b(moe.a(c26Var), false);
                int L = gm.L(18.0f);
                int i8 = cmb.h6;
                anb.R(msVar, cmb.i0(L, L, L, L, 0, cmb.w0(r12, i8, false), -16777216), r12, anb.M(i8), r12);
                msVar.setForeground(c26Var.c);
                break;
            case 1:
                ic0 ic0Var = (ic0) obj;
                mc0 mc0Var = ic0Var.k3;
                ArrayList arrayList = ic0Var.f3;
                jc0 jc0Var = (jc0) u69Var.a;
                if (u69Var.f != 0) {
                    jc0Var.d = true;
                    i2 = ((d) mc0Var).currentAccount;
                    boolean z3 = !z8c.h(i2).p();
                    if (jc0Var.w != z3) {
                        jc0Var.w = z3;
                        jc0Var.invalidate();
                    }
                    jc0Var.a = ic0Var.j3;
                    z = ic0Var.h3 == 1;
                    if (jc0Var.c != z) {
                        jc0Var.c = z;
                        jc0Var.invalidate();
                        break;
                    }
                } else {
                    jc0Var.d = false;
                    hc0 hc0Var = (hc0) arrayList.get(i);
                    if (hc0Var.b) {
                        i3 = ((d) mc0Var).currentAccount;
                        if (!z8c.h(i3).p()) {
                            z2 = true;
                            if (jc0Var.w != z2) {
                                jc0Var.w = z2;
                                jc0Var.invalidate();
                            }
                            jc0Var.a = hc0Var;
                            z = ic0Var.h3 == ((hc0) arrayList.get(i)).a;
                            if (jc0Var.c == z) {
                                jc0Var.c = z;
                                jc0Var.invalidate();
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (jc0Var.w != z2) {
                    }
                    jc0Var.a = hc0Var;
                    if (ic0Var.h3 == ((hc0) arrayList.get(i)).a) {
                    }
                    if (jc0Var.c == z) {
                    }
                }
                break;
            case 2:
                h91 h91Var = (h91) u69Var.a;
                k91 k91Var = (k91) obj;
                int i9 = k91Var.J - (i / 12);
                int i10 = k91Var.K - (i % 12);
                if (i10 < 0) {
                    i10 += 12;
                    i9--;
                }
                int i11 = h91Var.b;
                SparseArray sparseArray2 = (SparseArray) k91Var.T.get((i9 * 100) + i10);
                k91 k91Var2 = h91Var.y;
                boolean z4 = (i9 == h91Var.b && i10 == h91Var.c) ? false : true;
                h91Var.b = i9;
                h91Var.c = i10;
                h91Var.n = sparseArray2;
                if (z4 && h91Var.r != null) {
                    for (int i12 = 0; i12 < h91Var.r.size(); i12++) {
                        ((ImageReceiver) h91Var.r.valueAt(i12)).K();
                        ((ImageReceiver) h91Var.r.valueAt(i12)).p0(null);
                    }
                    h91Var.r = null;
                }
                if (sparseArray2 != null) {
                    if (h91Var.r == null) {
                        h91Var.r = new SparseArray();
                    }
                    int i13 = 0;
                    while (i13 < sparseArray2.size()) {
                        int keyAt = sparseArray2.keyAt(i13);
                        if (h91Var.r.get(keyAt, r4) == null && ((i91) sparseArray2.get(keyAt)).g) {
                            ImageReceiver imageReceiver = new ImageReceiver(r4);
                            imageReceiver.p0(h91Var);
                            k47 k47Var = ((i91) sparseArray2.get(keyAt)).a;
                            if (k47Var != null) {
                                boolean t2 = k47Var.t2();
                                if (k47.K4(k47Var.k)) {
                                    TLRPC.Document F0 = k47Var.F0();
                                    TLRPC.PhotoSize w = bc4.w(F0.thumbs, 50, false, r4, false);
                                    sparseArray = sparseArray2;
                                    TLRPC.PhotoSize w2 = bc4.w(F0.thumbs, nm7.q5, false, r4, false);
                                    if (w == w2) {
                                        w2 = r4;
                                    }
                                    if (w != null) {
                                        if (k47Var.I1 != null) {
                                            imageReceiver.d0(gn5.c(w2, F0), t2 ? "5_5_b" : "44_44", k47Var.I1, null, k47Var, 0);
                                        } else {
                                            imageReceiver.b0(gn5.c(w2, F0), t2 ? "5_5_b" : "44_44", gn5.c(w, F0), "b", null, k47Var, 0);
                                        }
                                    }
                                } else {
                                    sparseArray = sparseArray2;
                                    TLRPC.MessageMedia messageMedia = k47Var.k.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !k47Var.p0.isEmpty()) {
                                        TLRPC.PhotoSize w3 = bc4.w(k47Var.p0, 50, false, r4, false);
                                        TLRPC.PhotoSize w4 = bc4.w(k47Var.p0, nm7.q5, false, w3, false);
                                        if (!k47Var.z0) {
                                            i4 = ((d) k91Var2).currentAccount;
                                            if (!er3.q(i4).d(k47Var)) {
                                                BitmapDrawable bitmapDrawable2 = k47Var.I1;
                                                if (bitmapDrawable2 != null) {
                                                    imageReceiver.d0(null, null, bitmapDrawable2, null, k47Var, 0);
                                                } else {
                                                    imageReceiver.b0(null, null, gn5.f(w3, k47Var.n0), "b", null, k47Var, 0);
                                                }
                                            }
                                        }
                                        if (w4 == w3) {
                                            w3 = r4;
                                        }
                                        BitmapDrawable bitmapDrawable3 = k47Var.I1;
                                        TLObject tLObject = k47Var.n0;
                                        if (bitmapDrawable3 != null) {
                                            gn5 f = gn5.f(w4, tLObject);
                                            String str = t2 ? "5_5_b" : "44_44";
                                            BitmapDrawable bitmapDrawable4 = k47Var.I1;
                                            if (w4 != null) {
                                                bitmapDrawable = bitmapDrawable4;
                                                r19 = w4.size;
                                            } else {
                                                bitmapDrawable = bitmapDrawable4;
                                            }
                                            imageReceiver.Z(f, str, null, null, bitmapDrawable, r19, null, k47Var, k47.Q5(k47Var.k) ? 2 : 1);
                                        } else {
                                            imageReceiver.Z(gn5.f(w4, tLObject), t2 ? "5_5_b" : "44_44", gn5.f(w3, k47Var.n0), "b", null, w4 != null ? w4.size : 0L, null, k47Var, k47.Q5(k47Var.k) ? 2 : 1);
                                        }
                                    }
                                }
                                imageReceiver.q0(gm.L(22.0f));
                                h91Var.r.put(keyAt, imageReceiver);
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
                h91Var.d = YearMonth.of(i9, i14).lengthOfMonth();
                Calendar calendar = Calendar.getInstance();
                calendar.set(i9, i10, 0);
                h91Var.e = (calendar.get(7) + 6) % 7;
                h91Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i15 = h91Var.d + h91Var.e;
                h91Var.f = ((int) (i15 / 7.0f)) + (i15 % 7 == 0 ? 0 : 1);
                calendar.set(i9, i14, 0);
                h91Var.a.l(jb6.e0(calendar.getTimeInMillis() / 1000, true), false);
                k91Var2.A0(h91Var, false);
                h91Var.c(k91Var.Q, k91Var.R);
                h91Var.b(1.0f);
                k91Var.A0(h91Var, false);
                break;
            case 3:
            case 4:
                break;
            case 5:
                f57 f57Var = (f57) obj;
                fv fvVar = f57Var.f;
                int i16 = f57Var.a;
                m47 m47Var = f57Var.r;
                if (m47Var != null && u69Var.f == 0) {
                    rc2 rc2Var = (rc2) u69Var.a;
                    rc2Var.setInvalidateSpoilersParent(m47Var.i);
                    rc2Var.B3(fvVar.getMeasuredWidth(), fvVar.getMeasuredHeight());
                    int e1 = rc2Var.getMessageObject() != null ? rc2Var.getMessageObject().e1() : 0;
                    if (i16 == 2) {
                        f57Var.d0.d.b((k47) f57Var.r.f.get(i));
                    }
                    k47 k47Var2 = (k47) f57Var.r.f.get(i);
                    m47 m47Var2 = f57Var.r;
                    rc2Var.z3(k47Var2, (f47) m47Var2.d.get(((k47) m47Var2.f.get(i)).c1()), true, true, false, false);
                    if (i16 == 1) {
                        rc2Var.setDelegate(new jk2((byte) 22));
                    }
                    if (f57Var.r.f.size() > 1) {
                        rc2Var.m3(i16 == 1, false);
                        boolean z5 = e1 == ((k47) f57Var.r.f.get(i)).e1();
                        m47 m47Var3 = f57Var.r;
                        boolean z6 = m47Var3.g.get(((k47) m47Var3.f.get(i)).e1(), false);
                        rc2Var.o3(z6, z6, z5);
                        break;
                    }
                }
                break;
            default:
                TextView textView2 = (TextView) u69Var.a;
                c38 c38Var = (c38) obj;
                textView2.setText((CharSequence) c38Var.f.get(i));
                textView2.setTextColor(i == c38Var.d ? c38Var.F : c38Var.E);
                break;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                Context context = viewGroup.getContext();
                ns nsVar = new ns(context);
                Paint paint = new Paint(1);
                nsVar.a = paint;
                Paint paint2 = new Paint(1);
                nsVar.b = paint2;
                nsVar.setOrientation(1);
                nsVar.setWillNotDraw(false);
                ms msVar = new ms(context);
                nsVar.c = msVar;
                msVar.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
                nsVar.addView(msVar, qoe.r(58, 58, 1));
                TextView textView = new TextView(context);
                nsVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(cmb.w0(null, cmb.F6, false));
                nsVar.addView(textView, qoe.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, gm.L(0.5f)));
                paint2.setColor(-1);
                return new b59(nsVar);
            case 1:
                ic0 ic0Var = (ic0) obj;
                return new b59(new jc0(ic0Var.k3, ic0Var.getContext()));
            case 2:
                return new b59(new h91((k91) obj, viewGroup.getContext()));
            case 3:
                return new b59(((x62) obj).w);
            case 4:
                return new b59(new sb((byte) 7, ((q82) obj).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                f57 f57Var = (f57) obj;
                l57 l57Var = f57Var.d0;
                d57 d57Var = new d57(this, context2, l57Var.x, f57Var.K, l57Var.G);
                d57Var.setClipChildren(false);
                d57Var.setClipToPadding(false);
                d57Var.setDelegate(new e57(this));
                return new b59(d57Var);
            default:
                l66 l66Var = new l66(viewGroup.getContext(), null);
                l66Var.setGravity(17);
                l66Var.setTypeface(gm.o());
                l66Var.setTextSize(1, 14.0f);
                l66Var.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
                l66Var.setEllipsize(TextUtils.TruncateAt.END);
                l66Var.setSingleLine();
                l66Var.setMaxLines(1);
                l66Var.setLayoutParams(new g69(-2, gm.L(28.0f)));
                rve.b(l66Var, 0.075f, 1.4f);
                return new b59(l66Var);
        }
    }

    @Override // y59
    public final void y(u69 u69Var) {
        int i;
        int i2;
        switch (this.c) {
            case 5:
                f57 f57Var = (f57) this.d;
                z47 z47Var = f57Var.e;
                l57 l57Var = f57Var.d0;
                if (f57Var.r != null && (i = f57Var.a) != 1) {
                    View view = u69Var.a;
                    if (view instanceof rc2) {
                        rc2 rc2Var = (rc2) view;
                        if (i != 0) {
                            rc2Var.setDrawSelectionBackground(false);
                            break;
                        } else {
                            f47 c = f57Var.c(rc2Var.getMessageObject());
                            rc2Var.setDrawSelectionBackground(c == null);
                            rc2Var.o3(true, c == null, false);
                            o47 o47Var = l57Var.d;
                            if (!o47Var.i && o47Var.d != null && f57Var.d(rc2Var)) {
                                k47 messageObject = rc2Var.getMessageObject();
                                o47 o47Var2 = l57Var.d;
                                nv1 nv1Var = o47Var2.d;
                                if (nv1Var.m && messageObject != null && messageObject.y2 != null && ((i2 = o47Var2.e) < 0 || o47Var2.f <= i2)) {
                                    String str = nv1Var.i;
                                    int[] f = str == null ? null : yj9.f(messageObject, str, nv1Var.o);
                                    o47 o47Var3 = l57Var.d;
                                    if (f != null) {
                                        o47Var3.e = f[0];
                                        o47Var3.f = f[1];
                                    } else {
                                        o47Var3.e = 0;
                                        o47Var3.f = Math.min(oc7.r1(l57Var.x).l4.N1.f(), nv1.d(messageObject));
                                    }
                                }
                            }
                            o47 o47Var4 = l57Var.d;
                            if (!o47Var4.i && o47Var4.d != null && o47Var4.e >= 0 && f57Var.d(rc2Var) && !z47Var.w()) {
                                o47 o47Var5 = l57Var.d;
                                z47Var.Z(rc2Var, o47Var5.e, o47Var5.f);
                                if (f57Var.c0) {
                                    f57Var.M = D(rc2Var, l57Var.d.e, false);
                                    f57Var.N = D(rc2Var, l57Var.d.f, true);
                                    f57Var.O = true;
                                    f57Var.c0 = false;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    private final void E(u69 u69Var, int i) {
    }

    private final void F(u69 u69Var, int i) {
    }
}
