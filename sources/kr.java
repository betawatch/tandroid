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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class kr extends j79 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kr(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    public static int D(wb2 wb2Var, int i, boolean z) {
        int w;
        ArrayList arrayList;
        CharSequence charSequence;
        float lineBottom;
        p47 p47Var;
        if (wb2Var != null) {
            dc2 dc2Var = wb2Var.ub;
            r47 messageObject = wb2Var.getMessageObject();
            if (messageObject != null) {
                if (messageObject.y2 != null) {
                    wb2Var.V2(true);
                    hl9 hl9Var = messageObject.y2;
                    ArrayList arrayList2 = hl9Var.n;
                    int size = arrayList2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        int intValue = ((Integer) hl9Var.o.get(size)).intValue();
                        if (i < intValue) {
                            size--;
                        } else {
                            Layout a = ((kmb) arrayList2.get(size)).a();
                            if (a != null) {
                                int lineForOffset = a.getLineForOffset(Math.min(i - intValue, a.getText().length()));
                                return ((kmb) arrayList2.get(size)).getY() + wb2Var.u0 + (z ? a.getLineBottom(lineForOffset) : a.getLineTop(lineForOffset));
                            }
                        }
                    }
                } else if (messageObject.c1() == 0) {
                    if (TextUtils.isEmpty(messageObject.z) || (p47Var = wb2Var.m3) == null) {
                        wb2Var.V2(true);
                        int i2 = wb2Var.u0;
                        CharSequence charSequence2 = messageObject.v;
                        ArrayList arrayList3 = messageObject.B2;
                        w = wb2Var.v1 ? uh9.w(10.0f, wb2Var.W1, i2) : i2;
                        arrayList = arrayList3;
                        charSequence = charSequence2;
                    } else {
                        w = (int) wb2Var.t3;
                        charSequence = messageObject.z;
                        arrayList = p47Var.e;
                    }
                    if (arrayList != null && charSequence != null) {
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            o47 o47Var = (o47) arrayList.get(i3);
                            StaticLayout staticLayout = o47Var.e;
                            String charSequence3 = staticLayout.getText().toString();
                            int i4 = o47Var.n;
                            if (i > i4) {
                                if (i - i4 > charSequence3.length() - 1) {
                                    lineBottom = w + ((int) (o47Var.p(arrayList, dc2Var) + o47Var.f + o47Var.w));
                                } else {
                                    int lineForOffset2 = staticLayout.getLineForOffset(i - o47Var.n);
                                    lineBottom = (z ? staticLayout.getLineBottom(lineForOffset2) : staticLayout.getLineTop(lineForOffset2)) + o47Var.p(arrayList, dc2Var) + w + o47Var.f;
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

    @Override // j79
    public final int b() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((pr) obj).f3.size();
            case 1:
                return ((kb0) obj).f3.size() + 1;
            case 2:
                return ((j81) obj).L;
            case 3:
            case 4:
                return 1;
            case 5:
                t47 t47Var = ((m57) obj).r;
                if (t47Var == null) {
                    return 0;
                }
                return t47Var.f.size();
            default:
                return ((g48) obj).f.size();
        }
    }

    @Override // j79
    public final long c(int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 1:
                if (i >= ((kb0) obj).f3.size()) {
                    return 1L;
                }
                return ((jb0) r3.get(i)).a;
            case 2:
                j81 j81Var = (j81) obj;
                return ((j81Var.J - (i / 12)) * 100) + (j81Var.K - (i % 12));
            default:
                return super.c(i);
        }
    }

    @Override // j79
    public final int d(int i) {
        switch (this.c) {
            case 1:
                return i >= ((kb0) this.d).f3.size() ? 1 : 0;
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
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean[], uob, vnb] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.view.View, java.lang.Object, org.telegram.tgnet.TLRPC$PhotoSize] */
    /* JADX WARN: Type inference failed for: r4v13 */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
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
                or orVar = (or) f89Var.a;
                g26 g26Var = (g26) ((pr) obj).f3.get(i);
                int i5 = or.h;
                nr nrVar = orVar.c;
                int i6 = g26Var.b;
                int i7 = g26Var.d;
                nrVar.setImageResource(i6);
                TextView textView = orVar.d;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                if (!g26Var.e || yac.n()) {
                    marginLayoutParams.rightMargin = 0;
                    r12 = 0;
                    textView.setText(ob6.M0(i7, null));
                } else {
                    SpannableString spannableString = new SpannableString("d ".concat(ob6.M0(i7, null)));
                    wm2 wm2Var = new wm2(R.drawable.msg_mini_premiumlock, 0);
                    wm2Var.n = 1;
                    wm2Var.c(hl.L(13.0f));
                    spannableString.setSpan(wm2Var, 0, 1, 33);
                    marginLayoutParams.rightMargin = hl.L(4.0f);
                    textView.setText(spannableString);
                    r12 = 0;
                }
                orVar.b(ere.a(g26Var), false);
                int L = hl.L(18.0f);
                int i8 = aob.i6;
                yob.R(nrVar, aob.i0(L, L, L, L, 0, aob.w0(r12, i8, false), -16777216), r12, yob.M(i8), r12);
                nrVar.setForeground(g26Var.c);
                break;
            case 1:
                kb0 kb0Var = (kb0) obj;
                ob0 ob0Var = kb0Var.k3;
                ArrayList arrayList = kb0Var.f3;
                lb0 lb0Var = (lb0) f89Var.a;
                if (f89Var.f != 0) {
                    lb0Var.d = true;
                    i2 = ((e) ob0Var).currentAccount;
                    boolean z3 = !yac.h(i2).p();
                    if (lb0Var.w != z3) {
                        lb0Var.w = z3;
                        lb0Var.invalidate();
                    }
                    lb0Var.a = kb0Var.j3;
                    z = kb0Var.h3 == 1;
                    if (lb0Var.c != z) {
                        lb0Var.c = z;
                        lb0Var.invalidate();
                        break;
                    }
                } else {
                    lb0Var.d = false;
                    jb0 jb0Var = (jb0) arrayList.get(i);
                    if (jb0Var.b) {
                        i3 = ((e) ob0Var).currentAccount;
                        if (!yac.h(i3).p()) {
                            z2 = true;
                            if (lb0Var.w != z2) {
                                lb0Var.w = z2;
                                lb0Var.invalidate();
                            }
                            lb0Var.a = jb0Var;
                            z = kb0Var.h3 == ((jb0) arrayList.get(i)).a;
                            if (lb0Var.c == z) {
                                lb0Var.c = z;
                                lb0Var.invalidate();
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (lb0Var.w != z2) {
                    }
                    lb0Var.a = jb0Var;
                    if (kb0Var.h3 == ((jb0) arrayList.get(i)).a) {
                    }
                    if (lb0Var.c == z) {
                    }
                }
                break;
            case 2:
                g81 g81Var = (g81) f89Var.a;
                j81 j81Var = (j81) obj;
                int i9 = j81Var.J - (i / 12);
                int i10 = j81Var.K - (i % 12);
                if (i10 < 0) {
                    i10 += 12;
                    i9--;
                }
                int i11 = g81Var.b;
                SparseArray sparseArray2 = (SparseArray) j81Var.T.get((i9 * 100) + i10);
                j81 j81Var2 = g81Var.y;
                boolean z4 = (i9 == g81Var.b && i10 == g81Var.c) ? false : true;
                g81Var.b = i9;
                g81Var.c = i10;
                g81Var.n = sparseArray2;
                if (z4 && g81Var.r != null) {
                    for (int i12 = 0; i12 < g81Var.r.size(); i12++) {
                        ((ImageReceiver) g81Var.r.valueAt(i12)).K();
                        ((ImageReceiver) g81Var.r.valueAt(i12)).p0(null);
                    }
                    g81Var.r = null;
                }
                if (sparseArray2 != null) {
                    if (g81Var.r == null) {
                        g81Var.r = new SparseArray();
                    }
                    int i13 = 0;
                    while (i13 < sparseArray2.size()) {
                        int keyAt = sparseArray2.keyAt(i13);
                        if (g81Var.r.get(keyAt, r4) == null && ((h81) sparseArray2.get(keyAt)).g) {
                            ImageReceiver imageReceiver = new ImageReceiver(r4);
                            imageReceiver.p0(g81Var);
                            r47 r47Var = ((h81) sparseArray2.get(keyAt)).a;
                            if (r47Var != null) {
                                boolean t2 = r47Var.t2();
                                if (r47.K4(r47Var.k)) {
                                    TLRPC.Document F0 = r47Var.F0();
                                    TLRPC.PhotoSize w = xb4.w(F0.thumbs, 50, false, r4, false);
                                    sparseArray = sparseArray2;
                                    TLRPC.PhotoSize w2 = xb4.w(F0.thumbs, jn7.q5, false, r4, false);
                                    if (w == w2) {
                                        w2 = r4;
                                    }
                                    if (w != null) {
                                        if (r47Var.I1 != null) {
                                            imageReceiver.d0(jn5.c(w2, F0), t2 ? "5_5_b" : "44_44", r47Var.I1, null, r47Var, 0);
                                        } else {
                                            imageReceiver.b0(jn5.c(w2, F0), t2 ? "5_5_b" : "44_44", jn5.c(w, F0), "b", null, r47Var, 0);
                                        }
                                    }
                                } else {
                                    sparseArray = sparseArray2;
                                    TLRPC.MessageMedia messageMedia = r47Var.k.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null && !r47Var.p0.isEmpty()) {
                                        TLRPC.PhotoSize w3 = xb4.w(r47Var.p0, 50, false, r4, false);
                                        TLRPC.PhotoSize w4 = xb4.w(r47Var.p0, jn7.q5, false, w3, false);
                                        if (!r47Var.z0) {
                                            i4 = ((e) j81Var2).currentAccount;
                                            if (!lq3.q(i4).d(r47Var)) {
                                                BitmapDrawable bitmapDrawable2 = r47Var.I1;
                                                if (bitmapDrawable2 != null) {
                                                    imageReceiver.d0(null, null, bitmapDrawable2, null, r47Var, 0);
                                                } else {
                                                    imageReceiver.b0(null, null, jn5.f(w3, r47Var.n0), "b", null, r47Var, 0);
                                                }
                                            }
                                        }
                                        if (w4 == w3) {
                                            w3 = r4;
                                        }
                                        BitmapDrawable bitmapDrawable3 = r47Var.I1;
                                        TLObject tLObject = r47Var.n0;
                                        if (bitmapDrawable3 != null) {
                                            jn5 f = jn5.f(w4, tLObject);
                                            String str = t2 ? "5_5_b" : "44_44";
                                            BitmapDrawable bitmapDrawable4 = r47Var.I1;
                                            if (w4 != null) {
                                                bitmapDrawable = bitmapDrawable4;
                                                r19 = w4.size;
                                            } else {
                                                bitmapDrawable = bitmapDrawable4;
                                            }
                                            imageReceiver.Z(f, str, null, null, bitmapDrawable, r19, null, r47Var, r47.Q5(r47Var.k) ? 2 : 1);
                                        } else {
                                            imageReceiver.Z(jn5.f(w4, tLObject), t2 ? "5_5_b" : "44_44", jn5.f(w3, r47Var.n0), "b", null, w4 != null ? w4.size : 0L, null, r47Var, r47.Q5(r47Var.k) ? 2 : 1);
                                        }
                                    }
                                }
                                imageReceiver.q0(hl.L(22.0f));
                                g81Var.r.put(keyAt, imageReceiver);
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
                g81Var.d = YearMonth.of(i9, i14).lengthOfMonth();
                Calendar calendar = Calendar.getInstance();
                calendar.set(i9, i10, 0);
                g81Var.e = (calendar.get(7) + 6) % 7;
                g81Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i15 = g81Var.d + g81Var.e;
                g81Var.f = ((int) (i15 / 7.0f)) + (i15 % 7 == 0 ? 0 : 1);
                calendar.set(i9, i14, 0);
                g81Var.a.l(ob6.e0(calendar.getTimeInMillis() / 1000, true), false);
                j81Var2.A0(g81Var, false);
                g81Var.c(j81Var.Q, j81Var.R);
                g81Var.b(1.0f);
                j81Var.A0(g81Var, false);
                break;
            case 3:
            case 4:
                break;
            case 5:
                m57 m57Var = (m57) obj;
                gu guVar = m57Var.f;
                int i16 = m57Var.a;
                t47 t47Var = m57Var.r;
                if (t47Var != null && f89Var.f == 0) {
                    wb2 wb2Var = (wb2) f89Var.a;
                    wb2Var.setInvalidateSpoilersParent(t47Var.i);
                    wb2Var.B3(guVar.getMeasuredWidth(), guVar.getMeasuredHeight());
                    int e1 = wb2Var.getMessageObject() != null ? wb2Var.getMessageObject().e1() : 0;
                    if (i16 == 2) {
                        m57Var.d0.d.b((r47) m57Var.r.f.get(i));
                    }
                    r47 r47Var2 = (r47) m57Var.r.f.get(i);
                    t47 t47Var2 = m57Var.r;
                    wb2Var.z3(r47Var2, (m47) t47Var2.d.get(((r47) t47Var2.f.get(i)).c1()), true, true, false, false);
                    if (i16 == 1) {
                        wb2Var.setDelegate(new rj2((byte) 22));
                    }
                    if (m57Var.r.f.size() > 1) {
                        wb2Var.m3(i16 == 1, false);
                        boolean z5 = e1 == ((r47) m57Var.r.f.get(i)).e1();
                        t47 t47Var3 = m57Var.r;
                        boolean z6 = t47Var3.g.get(((r47) t47Var3.f.get(i)).e1(), false);
                        wb2Var.o3(z6, z6, z5);
                        break;
                    }
                }
                break;
            default:
                TextView textView2 = (TextView) f89Var.a;
                g48 g48Var = (g48) obj;
                textView2.setText((CharSequence) g48Var.f.get(i));
                textView2.setTextColor(i == g48Var.d ? g48Var.F : g48Var.E);
                break;
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                Context context = viewGroup.getContext();
                or orVar = new or(context);
                Paint paint = new Paint(1);
                orVar.a = paint;
                Paint paint2 = new Paint(1);
                orVar.b = paint2;
                orVar.setOrientation(1);
                orVar.setWillNotDraw(false);
                nr nrVar = new nr(context);
                orVar.c = nrVar;
                nrVar.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
                orVar.addView(nrVar, tre.r(58, 58, 1));
                TextView textView = new TextView(context);
                orVar.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(aob.w0(null, aob.G6, false));
                orVar.addView(textView, tre.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, hl.L(0.5f)));
                paint2.setColor(-1);
                return new n69(orVar);
            case 1:
                kb0 kb0Var = (kb0) obj;
                return new n69(new lb0(kb0Var.k3, kb0Var.getContext()));
            case 2:
                return new n69(new g81((j81) obj, viewGroup.getContext()));
            case 3:
                return new n69(((c62) obj).w);
            case 4:
                return new n69(new tb((byte) 7, ((w72) obj).getContext(), this));
            case 5:
                Context context2 = viewGroup.getContext();
                m57 m57Var = (m57) obj;
                s57 s57Var = m57Var.d0;
                k57 k57Var = new k57(this, context2, s57Var.x, m57Var.K, s57Var.G);
                k57Var.setClipChildren(false);
                k57Var.setClipToPadding(false);
                k57Var.setDelegate(new l57(this));
                return new n69(k57Var);
            default:
                p66 p66Var = new p66(viewGroup.getContext(), null);
                p66Var.setGravity(17);
                p66Var.setTypeface(hl.o());
                p66Var.setTextSize(1, 14.0f);
                p66Var.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
                p66Var.setEllipsize(TextUtils.TruncateAt.END);
                p66Var.setSingleLine();
                p66Var.setMaxLines(1);
                p66Var.setLayoutParams(new r79(-2, hl.L(28.0f)));
                iye.b(p66Var, 0.075f, 1.4f);
                return new n69(p66Var);
        }
    }

    @Override // j79
    public final void y(f89 f89Var) {
        int i;
        int i2;
        switch (this.c) {
            case 5:
                m57 m57Var = (m57) this.d;
                g57 g57Var = m57Var.e;
                s57 s57Var = m57Var.d0;
                if (m57Var.r != null && (i = m57Var.a) != 1) {
                    View view = f89Var.a;
                    if (view instanceof wb2) {
                        wb2 wb2Var = (wb2) view;
                        if (i != 0) {
                            wb2Var.setDrawSelectionBackground(false);
                            break;
                        } else {
                            m47 c = m57Var.c(wb2Var.getMessageObject());
                            wb2Var.setDrawSelectionBackground(c == null);
                            wb2Var.o3(true, c == null, false);
                            v47 v47Var = s57Var.d;
                            if (!v47Var.i && v47Var.d != null && m57Var.d(wb2Var)) {
                                r47 messageObject = wb2Var.getMessageObject();
                                v47 v47Var2 = s57Var.d;
                                ou1 ou1Var = v47Var2.d;
                                if (ou1Var.m && messageObject != null && messageObject.y2 != null && ((i2 = v47Var2.e) < 0 || v47Var2.f <= i2)) {
                                    String str = ou1Var.i;
                                    int[] f = str == null ? null : ll9.f(messageObject, str, ou1Var.o);
                                    v47 v47Var3 = s57Var.d;
                                    if (f != null) {
                                        v47Var3.e = f[0];
                                        v47Var3.f = f[1];
                                    } else {
                                        v47Var3.e = 0;
                                        v47Var3.f = Math.min(uc7.s1(s57Var.x).k4.V1.f(), ou1.d(messageObject));
                                    }
                                }
                            }
                            v47 v47Var4 = s57Var.d;
                            if (!v47Var4.i && v47Var4.d != null && v47Var4.e >= 0 && m57Var.d(wb2Var) && !g57Var.w()) {
                                v47 v47Var5 = s57Var.d;
                                g57Var.Z(wb2Var, v47Var5.e, v47Var5.f);
                                if (m57Var.c0) {
                                    m57Var.M = D(wb2Var, s57Var.d.e, false);
                                    m57Var.N = D(wb2Var, s57Var.d.f, true);
                                    m57Var.O = true;
                                    m57Var.c0 = false;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    private final void E(f89 f89Var, int i) {
    }

    private final void F(f89 f89Var, int i) {
    }
}
