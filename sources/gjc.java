// default package

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class gjc implements kn3 {
    public static boolean n0;
    public static final HashMap o0 = new HashMap();
    public volatile char E;
    public volatile byte F;
    public volatile boolean G;
    public String H;
    public final cjc I;
    public boolean J;
    public yic K;
    public long N;
    public long O;
    public boolean T;
    public ln3 U;
    public final cjc W;
    public EditTextBoldCursor X;
    public int Y;
    public int Z;
    public final Context a;
    public final c b;
    public int b0;
    public am3 d;
    public igb e;
    public String e0;
    public ln3 f;
    public int f0;
    public String g0;
    public jjc h;
    public boolean h0;
    public boolean i0;
    public final bjc j0;
    public String l0;
    public final bjc m0;
    public long r;
    public long s;
    public volatile long w;
    public volatile long x;
    public volatile int y;
    public byte c = 0;
    public String n = "";
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public float P = 0.0f;
    public float Q = 1.0f;
    public float R = 0.0f;
    public float S = 1.0f;
    public final float[] V = new float[3];
    public String a0 = "";
    public final int[] c0 = new int[2];
    public final int[] d0 = new int[2];
    public final cjc k0 = new cjc(this, 2);

    public gjc(Context context, c cVar) {
        byte b = 0;
        this.I = new cjc(this, b);
        byte b2 = 1;
        this.W = new cjc(this, b2);
        this.j0 = new bjc(this, b);
        this.m0 = new bjc(this, b2);
        this.a = context;
        this.b = cVar;
    }

    public static ArrayList w(String[] strArr, boolean z, p8c p8cVar) {
        p8c p8cVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            int i2 = i + 1;
            vl3 L = DictationAsr.L(str);
            String[] d = L != null ? L.d(str) : new String[0];
            if (d.length < 2) {
                arrayList.add(null);
                p8cVar2 = p8cVar;
            } else {
                String g0 = DictationAsr.g0(L, str);
                ArrayList arrayList2 = new ArrayList();
                int i3 = -1;
                for (int i4 = 0; i4 < d.length; i4++) {
                    arrayList2.add(jm3.N(d[i4]));
                    if (!z && DictationAsr.z(str) && d[i4].equals(g0)) {
                        i3 = i4;
                    }
                }
                p8cVar2 = p8cVar;
                arrayList.add(new djc(jm3.O(g0), arrayList2, i3, new go2((Object) str, (Object) d, (Object) p8cVar2, i2, (byte) 7)));
            }
            p8cVar = p8cVar2;
            i = i2;
        }
        return arrayList;
    }

    @Override // kn3
    public final void a(String str, String str2) {
        if (this.c == 2) {
            if (!str.isEmpty()) {
                this.n = str;
            }
            StringBuilder p = ug8.p("recogniser ended error=", str2, " chars=");
            p.append(this.n.length());
            p.append(" (the voice recording goes on)");
            Log.d("VoiceLive", p.toString());
            this.f = null;
            if (xxe.a == this) {
                xxe.a = null;
            }
            this.d = null;
            this.e = null;
            boolean isEmpty = TextUtils.isEmpty(this.n.trim());
            jjc jjcVar = this.h;
            if (isEmpty) {
                if (jjcVar != null) {
                    jjcVar.m();
                }
            } else if (jjcVar != null) {
                jjcVar.setText(this.n);
                this.h.setListening(false);
            }
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        ArrayList arrayList2 = this.M;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        return arrayList3;
    }

    public final void c() {
        String c0 = DictationAsr.c0();
        if (c0 != null) {
            String H = jm3.H(c0);
            jjc jjcVar = this.h;
            if (jjcVar != null) {
                jjcVar.setLanguage(H);
            }
            yic yicVar = this.K;
            if (yicVar == null || !this.J) {
                return;
            }
            this.l0 = H;
            yicVar.setLanguage(H);
        }
    }

    @Override // kn3
    public final void d(float f) {
        if (this.c == 2) {
            if (this.J) {
                yic yicVar = this.K;
                if (yicVar != null) {
                    yicVar.setLevel(f);
                    return;
                }
                return;
            }
            jjc jjcVar = this.h;
            if (jjcVar != null) {
                jjcVar.setLevel(f);
            }
        }
    }

    @Override // kn3
    public final void e(String str) {
        f(-1, str);
    }

    @Override // kn3
    public final void f(int i, String str) {
        if (this.c == 2) {
            if (str == null) {
                str = "";
            }
            this.n = str;
            jjc jjcVar = this.h;
            if (jjcVar != null) {
                jjcVar.t(i, str);
            }
        }
    }

    @Override // kn3
    public final void g(String str) {
        String H = str == null ? null : jm3.H(str);
        jjc jjcVar = this.h;
        if (jjcVar != null && this.c == 2) {
            jjcVar.setLanguage(H);
        }
        yic yicVar = this.K;
        if (yicVar != null && this.J && this.c == 2) {
            this.l0 = H;
            yicVar.setLanguage(H);
        }
    }

    public final void h() {
        ArrayList arrayList = this.L;
        ArrayList arrayList2 = this.M;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
    }

    public final boolean[] i(ArrayList arrayList, float f, float f2) {
        boolean[] zArr = new boolean[arrayList.size()];
        if (this.c == 4) {
            long j = this.O;
            if (j > 0 && (f > 0.001f || f2 < 0.999f)) {
                float f3 = j;
                long j2 = (long) (f * f3);
                long j3 = (long) (f2 * f3);
                int i = 0;
                long j4 = 0;
                while (i < arrayList.size()) {
                    long j5 = ((fjc) arrayList.get(i)).b;
                    long max = ((((fjc) arrayList.get(i)).c >= 0 ? ((fjc) arrayList.get(i)).c : Math.max(j4, j5 - 900)) + j5) / 2;
                    zArr[i] = max < j2 || max > j3;
                    i++;
                    j4 = j5;
                }
            }
        }
        return zArr;
    }

    public final void j(String str, boolean z) {
        jjc jjcVar;
        yic yicVar;
        byte b = this.c;
        if (b == 0 && this.h == null && this.K == null) {
            return;
        }
        boolean z2 = this.J && b == 4 && this.b.c() && ("chat paused".equals(str) || "destroy".equals(str));
        if (this.J && this.c != 0 && !z2) {
            o0.remove(r());
        }
        if (this.c != 0) {
            StringBuilder p = ug8.p("dispose (", str, ") state=");
            byte b2 = this.c;
            p.append(b2 == 2 ? "live" : b2 == 3 ? "review" : b2 == 4 ? "paused" : "buffering");
            p.append(" chars=");
            p.append(this.n.length());
            p.append(" chunks=");
            p.append(this.y);
            Log.d("VoiceLive", p.toString());
        }
        this.c = (byte) 0;
        this.H = null;
        gl.r(this.W);
        ln3 ln3Var = this.U;
        if (ln3Var != null) {
            ln3Var.c();
            this.U = null;
        }
        k(true);
        if (z2) {
            if (this.U == null) {
                h();
            }
            ejc ejcVar = new ejc();
            ArrayList arrayList = ejcVar.a;
            ArrayList arrayList2 = this.L;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                fjc fjcVar = (fjc) obj;
                fjc fjcVar2 = new fjc(fjcVar.a, fjcVar.b);
                fjcVar2.c = fjcVar.c;
                arrayList.add(fjcVar2);
            }
            ArrayList arrayList3 = this.M;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                fjc fjcVar3 = (fjc) obj2;
                fjc fjcVar4 = new fjc(fjcVar3.a, fjcVar3.b);
                fjcVar4.c = fjcVar3.c;
                arrayList.add(fjcVar4);
            }
            ejcVar.b = this.O;
            ejcVar.c = this.P;
            ejcVar.d = this.Q;
            ejcVar.e = this.e0;
            ejcVar.g = this.f0;
            ejcVar.f = this.g0;
            ejcVar.h = this.h0;
            ejcVar.i = this.l0;
            o0.put(r(), ejcVar);
            StringBuilder sb = new StringBuilder("field: kept for the chat (");
            sb.append(arrayList.size());
            sb.append(" words");
            sb.append(this.e0 != null ? ", styled / edited" : "");
            sb.append(")");
            Log.d("VoiceLive", sb.toString());
        }
        this.e0 = null;
        this.g0 = null;
        this.i0 = false;
        this.b.g(Float.NaN, 0.0f);
        if (z && (yicVar = this.K) != null && yicVar.R) {
            yicVar.R = false;
            yicVar.f0 = -1;
            yicVar.invalidate();
        }
        gl.r(this.I);
        DictationAsr.T(this.m0);
        gl.r(this.k0);
        gl.r(this.j0);
        if (xxe.a == this) {
            xxe.a = null;
        }
        ln3 ln3Var2 = this.f;
        if (ln3Var2 != null) {
            ln3Var2.c();
            this.f = null;
        }
        am3 am3Var = this.d;
        if (am3Var != null) {
            am3Var.d();
            this.d = null;
        }
        this.e = null;
        if (!z || (jjcVar = this.h) == null) {
            return;
        }
        jjcVar.m();
    }

    public final void k(boolean z) {
        EditTextBoldCursor editTextBoldCursor = this.X;
        if (editTextBoldCursor == null) {
            return;
        }
        this.X = null;
        String obj = editTextBoldCursor.getText() == null ? this.n : editTextBoldCursor.getText().toString();
        this.n = obj;
        this.e0 = obj.trim();
        this.f0 = b().size();
        if (z && this.K != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.n);
            this.K.x(arrayList, null, false);
        }
        if (editTextBoldCursor.hasFocus()) {
            gl.t1(editTextBoldCursor);
        }
        gl.B2(editTextBoldCursor);
    }

    public final void l(Object obj) {
        if (obj == null || this.i0 || this.K == null) {
            return;
        }
        if (this.X != null) {
            k(false);
        }
        String str = this.g0;
        if (str == null) {
            str = this.n.trim();
            this.g0 = str;
            this.h0 = this.e0 != null;
        }
        if (str.isEmpty()) {
            return;
        }
        this.i0 = true;
        this.K.setBusy(true);
        StringBuilder sb = new StringBuilder("field: style ");
        c cVar = this.b;
        cVar.getClass();
        sb.append(obj instanceof kl3 ? ((kl3) obj).a() : null);
        sb.append(" in place on ");
        sb.append(str.length());
        sb.append(" chars");
        Log.d("VoiceLive", sb.toString());
        cVar.f(obj, str, new hy3(this, SystemClock.uptimeMillis(), (byte) 3));
    }

    public final void m(String str) {
        boolean z = this.c == 4;
        j(str, false);
        yic yicVar = this.K;
        if (yicVar == null) {
            return;
        }
        gl.d3(new mhc(this, yicVar, (byte) 3), z ? 470L : 60L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(ByteBuffer byteBuffer, int i, int i2, int i3) {
        am3 am3Var = this.d;
        igb igbVar = this.e;
        if (am3Var == null || igbVar == null) {
            return;
        }
        this.E = i2;
        this.F = i3;
        this.y++;
        this.w += i;
        int c = igbVar.c(byteBuffer, i, i2);
        if (igbVar.b <= 0) {
            if (this.G) {
                return;
            }
            this.G = true;
            Log.w("VoiceLive", "recorder rate " + i2 + " Hz isn't a multiple of 16 kHz: no transcript");
            return;
        }
        if (c > 0) {
            this.x += c;
            byte[] bArr = (byte[]) igbVar.g;
            if (c > 0) {
                synchronized (am3Var.a) {
                    if (am3Var.d) {
                        return;
                    }
                    am3Var.a(c, bArr);
                    int i4 = c / 2;
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = i5 << 1;
                        double d = (short) ((bArr[i6] & 255) | (bArr[i6 + 1] << 8));
                        am3Var.h = (d * d) + am3Var.h;
                    }
                    int i7 = am3Var.i + i4;
                    am3Var.i = i7;
                    if (i7 >= 1600) {
                        double sqrt = Math.sqrt(am3Var.h / Math.max(1, i7));
                        am3Var.h = 0.0d;
                        am3Var.i = 0;
                        gn3 gn3Var = am3Var.g;
                        if (gn3Var != null) {
                            gn3Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, sqrt)) * 20.0d) - 42.0d) / 30.0d)));
                        }
                    }
                }
            }
        }
    }

    public final void o(ln3 ln3Var, String str, int i) {
        if (ln3Var == this.f || ln3Var == this.U) {
            if (!this.J) {
                f(i, str);
                return;
            }
            byte b = this.c;
            if (b == 2 || b == 4) {
                v(ln3Var, str);
                p();
            }
        }
    }

    public final void p() {
        String str;
        int i;
        ArrayList b = b();
        EditTextBoldCursor editTextBoldCursor = this.X;
        int i2 = 0;
        if (editTextBoldCursor != null) {
            Editable text = editTextBoldCursor.getText();
            if (text != null) {
                int i3 = this.Z;
                if (i3 < 0 || this.a0.length() + i3 != text.length() || !text.toString().substring(this.Z).equals(this.a0)) {
                    this.Y = Math.min(this.b0, b.size());
                    this.Z = text.length();
                    this.a0 = "";
                }
                if (this.Y > b.size()) {
                    this.Y = b.size();
                }
                this.b0 = b.size();
                StringBuilder sb = new StringBuilder();
                for (int i4 = this.Y; i4 < b.size(); i4++) {
                    if (sb.length() > 0) {
                        sb.append(' ');
                    }
                    sb.append(((fjc) b.get(i4)).a);
                }
                if (sb.length() == 0 && this.a0.isEmpty()) {
                    return;
                }
                if (sb.length() > 0 && (i = this.Z) > 0 && !Character.isWhitespace(text.charAt(i - 1))) {
                    i2 = 1;
                }
                if (sb.length() != 0) {
                    str = (i2 != 0 ? " " : "") + ((Object) sb);
                }
                if (str.equals(this.a0)) {
                    return;
                }
                text.replace(this.Z, text.length(), str);
                this.a0 = str;
                return;
            }
            return;
        }
        if (this.e0 != null) {
            if (this.f0 > b.size()) {
                this.f0 = b.size();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.e0);
            StringBuilder sb2 = new StringBuilder(this.e0);
            for (int i5 = this.f0; i5 < b.size(); i5++) {
                arrayList.add(((fjc) b.get(i5)).a);
                sb2.append(' ');
                sb2.append(((fjc) b.get(i5)).a);
            }
            this.n = sb2.toString();
            yic yicVar = this.K;
            if (yicVar != null) {
                yicVar.x(arrayList, null, false);
                return;
            }
            return;
        }
        boolean[] i6 = i(b, this.P, this.Q);
        boolean[] i7 = this.T ? i(b, this.R, this.S) : null;
        StringBuilder sb3 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList(b.size());
        boolean[] zArr = new boolean[b.size()];
        int i8 = 0;
        while (i2 < b.size()) {
            if (i7 == null || !i7[i2] || !i6[i2]) {
                arrayList2.add(((fjc) b.get(i2)).a);
                int i9 = i8 + 1;
                zArr[i8] = i6[i2];
                if (!i6[i2]) {
                    if (sb3.length() > 0) {
                        sb3.append(' ');
                    }
                    sb3.append(((fjc) b.get(i2)).a);
                }
                i8 = i9;
            }
            i2++;
        }
        this.n = sb3.toString();
        yic yicVar2 = this.K;
        if (yicVar2 != null) {
            yicVar2.x(arrayList2, Arrays.copyOf(zArr, i8), this.T);
        }
    }

    public final void q() {
        c cVar = this.b;
        cja cjaVar = cVar.a.c2;
        if (cjaVar == null) {
            return;
        }
        if (this.K == null) {
            this.K = new yic(this.a, cVar.a.L4, new c5a(this, cjaVar));
        }
        View a = cVar.a();
        if (this.K.getParent() != cjaVar) {
            gl.B2(this.K);
            int indexOfChild = (a == null || a.getParent() != cjaVar) ? -1 : cjaVar.indexOfChild(a);
            yic yicVar = this.K;
            if (indexOfChild >= 0) {
                cjaVar.addView(yicVar, indexOfChild, nme.c(-1.0f, -1));
            } else {
                cjaVar.addView(yicVar, nme.c(-1.0f, -1));
            }
        }
        this.K.E();
        this.K.setPaused(false);
        this.K.setListening(true);
        p();
        this.K.z();
        Log.d("VoiceLive", "field shown");
    }

    public final String r() {
        StringBuilder sb = new StringBuilder();
        c cVar = this.b;
        sb.append(cVar.a.R);
        sb.append(":");
        sb.append(cVar.a.G3);
        return sb.toString();
    }

    public final void s() {
        v8b v8bVar = new v8b(this);
        ChatActivityEnterView chatActivityEnterView = this.b.a;
        ln3 ln3Var = new ln3(this.a, chatActivityEnterView.R, chatActivityEnterView.G3, false, v8bVar);
        v8bVar.b = ln3Var;
        this.f = ln3Var;
        ln3Var.w = this.d;
        ln3Var.l();
    }

    public final void t() {
        byte b;
        String str;
        String str2;
        long j;
        ejc ejcVar;
        long j2;
        byte b2 = this.c;
        if (b2 != 3) {
            String str3 = "VoiceLive";
            if (b2 == 0 && na7.c1().getBoolean("design_voice_live_field", true) && !this.b.d() && this.b.c() && (ejcVar = (ejc) o0.get(r())) != null) {
                cjc cjcVar = this.k0;
                cjc cjcVar2 = this.W;
                float[] fArr = this.V;
                this.J = true;
                ArrayList arrayList = this.L;
                arrayList.clear();
                ArrayList arrayList2 = ejcVar.a;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    fjc fjcVar = (fjc) arrayList2.get(i);
                    fjc fjcVar2 = new fjc(fjcVar.a, fjcVar.b);
                    fjcVar2.c = fjcVar.c;
                    arrayList.add(fjcVar2);
                }
                long j3 = 0;
                this.M.clear();
                this.O = ejcVar.b;
                this.e0 = ejcVar.e;
                this.f0 = Math.min(ejcVar.g, arrayList.size());
                this.g0 = ejcVar.f;
                this.h0 = ejcVar.h;
                this.l0 = ejcVar.i;
                this.c = (byte) 4;
                this.P = 0.0f;
                this.Q = 1.0f;
                this.T = false;
                boolean z = ejcVar.c > 0.001f || ejcVar.d < 0.999f;
                boolean z2 = this.b.b(fArr) && (fArr[0] > 0.001f || fArr[1] < 0.999f);
                if (z && !z2 && this.O > 0) {
                    float f = ejcVar.c;
                    this.P = f;
                    float f2 = ejcVar.d;
                    this.Q = f2;
                    boolean[] i2 = i(arrayList, f, f2);
                    float f3 = this.P;
                    float f4 = this.O;
                    long j4 = (long) (f3 * f4);
                    long j5 = (long) (this.Q * f4);
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = 0;
                    while (i3 < arrayList.size()) {
                        if (i2[i3]) {
                            j2 = j5;
                        } else {
                            fjc fjcVar3 = (fjc) arrayList.get(i3);
                            j2 = j5;
                            long j6 = j3;
                            fjcVar3.b = Math.max(j6, fjcVar3.b - j4);
                            long j7 = fjcVar3.c;
                            if (j7 >= j6) {
                                fjcVar3.c = Math.max(j6, j7 - j4);
                            }
                            arrayList3.add(fjcVar3);
                        }
                        i3++;
                        j5 = j2;
                        j3 = 0;
                    }
                    arrayList.clear();
                    arrayList.addAll(arrayList3);
                    this.O = Math.max(0L, j5 - j4);
                    this.P = 0.0f;
                    this.Q = 1.0f;
                } else if (z2) {
                    this.P = fArr[0];
                    this.Q = fArr[1];
                }
                Log.d("VoiceLive", "field: back with the chat (" + arrayList.size() + " words, " + this.O + " ms)");
                q();
                yic yicVar = this.K;
                if (yicVar != null) {
                    yicVar.setListening(false);
                    this.K.setPaused(true);
                    this.K.setRevertShown(this.g0 != null);
                    yic yicVar2 = this.K;
                    yicVar2.z();
                    yicVar2.W = 1.0f;
                    boolean z3 = yicVar2.T;
                    yicVar2.a0 = z3 ? 1.0f : 0.0f;
                    yicVar2.T0 = z3 ? 1.0f : 0.0f;
                    yicVar2.b0 = 0.0f;
                    yicVar2.E0 = -1.0f;
                    yicVar2.invalidate();
                    this.K.setLanguage(this.l0);
                    c();
                }
                p();
                gl.r(cjcVar2);
                gl.d3(cjcVar2, 50L);
                gl.r(cjcVar);
                gl.d3(cjcVar, 250L);
                return;
            }
            byte b3 = this.c;
            c cVar = this.b;
            if (b3 == 4) {
                if (!cVar.d()) {
                    if (this.b.c()) {
                        return;
                    }
                    j("draft gone", true);
                    return;
                }
                gl.r(this.W);
                ln3 ln3Var = this.U;
                if (ln3Var != null) {
                    this.U = null;
                    ln3Var.c();
                    h();
                }
                h();
                float f5 = this.P;
                long j8 = this.O;
                float f6 = j8;
                long j9 = (long) (f5 * f6);
                float f7 = this.Q;
                long j10 = (long) (f6 * f7);
                if (j8 <= 0 || (f5 <= 0.001f && f7 >= 0.999f)) {
                    this.N = j8;
                    Log.d("VoiceLive", "field: resumed at " + this.N + " ms");
                } else {
                    boolean[] i4 = i(this.L, f5, f7);
                    ArrayList arrayList4 = new ArrayList();
                    int i5 = 0;
                    while (i5 < this.L.size()) {
                        if (i4[i5]) {
                            j = j9;
                        } else {
                            fjc fjcVar4 = (fjc) this.L.get(i5);
                            j = j9;
                            fjcVar4.b = Math.max(0L, fjcVar4.b - j);
                            long j11 = fjcVar4.c;
                            if (j11 >= 0) {
                                fjcVar4.c = Math.max(0L, j11 - j);
                            }
                            arrayList4.add(fjcVar4);
                        }
                        i5++;
                        j9 = j;
                    }
                    long j12 = j9;
                    this.L.clear();
                    this.L.addAll(arrayList4);
                    this.N = Math.max(0L, j10 - j12);
                    StringBuilder o = ug8.o(j12, "field: resumed after a trim ", "..");
                    o.append(j10);
                    o.append(" ms, ");
                    o.append(this.L.size());
                    o.append(" words kept");
                    Log.d("VoiceLive", o.toString());
                }
                this.P = 0.0f;
                this.Q = 1.0f;
                this.T = false;
                if (this.e0 != null) {
                    this.f0 = this.L.size();
                }
                if (this.X != null) {
                    int size2 = this.L.size();
                    this.b0 = size2;
                    this.Y = size2;
                    this.Z = this.X.length();
                    this.a0 = "";
                }
                this.d = new am3();
                this.e = new igb((byte) 1);
                xxe.a = this;
                this.c = (byte) 2;
                s();
                yic yicVar3 = this.K;
                if (yicVar3 != null) {
                    yicVar3.setPaused(false);
                    this.K.setListening(true);
                }
                c();
                DictationAsr.T(this.m0);
                DictationAsr.i(this.m0);
                u();
                p();
                gl.r(this.k0);
                gl.d3(this.k0, 250L);
                return;
            }
            ChatActivityEnterView chatActivityEnterView = cVar.a;
            if (!wxe.a()) {
                if (this.c != 0) {
                    j("unavailable", true);
                    return;
                }
                return;
            }
            if (!this.b.d()) {
                if (this.J && this.c == 2) {
                    c cVar2 = this.b;
                    cVar2.getClass();
                    if ((MediaController.w().F() || cVar2.a.R3 != null) && this.b.c()) {
                        cjc cjcVar3 = this.W;
                        this.c = (byte) 4;
                        gl.r(this.j0);
                        this.O = this.N + (this.d != null ? r2.c() / 32 : 0L);
                        if (xxe.a == this) {
                            xxe.a = null;
                        }
                        ln3 ln3Var2 = this.f;
                        if (ln3Var2 != null) {
                            this.U = ln3Var2;
                            this.f = null;
                            am3 am3Var = this.d;
                            if (am3Var != null) {
                                am3Var.d();
                            }
                            this.U.m();
                        } else {
                            h();
                        }
                        this.d = null;
                        this.e = null;
                        this.P = 0.0f;
                        this.Q = 1.0f;
                        this.T = false;
                        Log.d("VoiceLive", "field: paused at " + this.O + " ms, " + (this.M.size() + this.L.size()) + " words");
                        yic yicVar4 = this.K;
                        if (yicVar4 != null) {
                            yicVar4.setListening(false);
                            this.K.setPaused(true);
                        }
                        p();
                        gl.r(cjcVar3);
                        gl.d3(cjcVar3, 50L);
                        return;
                    }
                }
                if (this.c != 0) {
                    j("not recording", true);
                    return;
                }
                return;
            }
            if (this.c == 0) {
                if (n0) {
                    str = "VoiceLive";
                } else {
                    n0 = true;
                    StringBuilder sb = new StringBuilder("resampler self-test (expect 1000Hz≈0dB, 12000Hz<-50dB): ");
                    StringBuilder sb2 = new StringBuilder();
                    int[] iArr = {1000, 12000};
                    int i6 = 0;
                    while (i6 < 2) {
                        int i7 = iArr[i6];
                        igb igbVar = new igb((byte) 1);
                        ByteBuffer allocate = ByteBuffer.allocate(19200);
                        int i8 = 0;
                        while (i8 < 9600) {
                            int i9 = i6;
                            short sin = (short) (Math.sin(((i7 * 6.283185307179586d) * i8) / 48000.0d) * 16000.0d);
                            int i10 = i8 << 1;
                            allocate.put(i10, (byte) sin);
                            allocate.put(i10 + 1, (byte) (sin >> 8));
                            i8++;
                            str3 = str3;
                            i6 = i9;
                        }
                        int i11 = i6;
                        String str4 = str3;
                        int c = igbVar.c(allocate, 19200, 48000);
                        byte[] bArr = (byte[]) igbVar.g;
                        double d = 0.0d;
                        int i12 = 0;
                        for (int i13 = kk7.d3; i13 < c / 2; i13++) {
                            int i14 = i13 << 1;
                            double d2 = (short) ((bArr[i14] & 255) | (bArr[i14 + 1] << 8));
                            d += d2 * d2;
                            i12++;
                        }
                        double log10 = Math.log10(Math.max(1.0E-9d, Math.sqrt(d / Math.max(1, i12)) / 11313.708498984759d)) * 20.0d;
                        sb2.append(i7);
                        sb2.append("Hz=");
                        sb2.append(String.format(Locale.US, "%.1f", Double.valueOf(log10)));
                        sb2.append("dB ");
                        i6 = i11 + 1;
                        str3 = str4;
                    }
                    sb.append(sb2.toString().trim());
                    str = str3;
                    Log.d(str, sb.toString());
                }
                this.d = new am3();
                this.e = new igb((byte) 1);
                this.x = 0L;
                this.w = 0L;
                this.y = 0;
                this.E = (char) 0;
                this.F = (byte) 0;
                this.G = false;
                this.n = "";
                this.J = na7.c1().getBoolean("design_voice_live_field", true);
                this.L.clear();
                this.M.clear();
                this.N = 0L;
                this.P = 0.0f;
                this.Q = 1.0f;
                this.T = false;
                this.r = SystemClock.elapsedRealtime();
                b = 1;
                this.c = (byte) 1;
                xxe.a = this;
                gl.r(this.k0);
                gl.d3(this.k0, 250L);
                Log.d(str, "buffering: recorder tap on");
            } else {
                b = 1;
                str = "VoiceLive";
            }
            if (this.c == b && this.b.a.S0()) {
                this.c = (byte) 2;
                this.l0 = null;
                this.s = SystemClock.elapsedRealtime();
                StringBuilder sb3 = new StringBuilder("locked → live: buffered ");
                sb3.append((this.d.c() * 1000) / 32000);
                sb3.append(" ms, chunks=");
                sb3.append(this.y);
                sb3.append(" rate=");
                sb3.append((int) this.E);
                sb3.append(" source=");
                byte b4 = this.F;
                sb3.append(b4 == 1 ? "MediaController" : b4 == 2 ? "AudioRecorderV2" : "none");
                sb3.append(" (");
                sb3.append(this.s - this.r);
                sb3.append(" ms since start)");
                Log.d(str, sb3.toString());
                s();
                if (this.J) {
                    q();
                } else {
                    c cVar3 = this.b;
                    cja cjaVar = cVar3.a.c2;
                    if (cjaVar != null) {
                        if (this.h == null) {
                            this.h = new jjc(this.a, cVar3.a.L4, this);
                        }
                        View a = cVar3.a();
                        int indexOfChild = (a == null || a.getParent() != cjaVar) ? -1 : cjaVar.indexOfChild(a);
                        if (this.h.getParent() != cjaVar || (indexOfChild >= 0 && cjaVar.indexOfChild(this.h) != indexOfChild - 1)) {
                            gl.B2(this.h);
                            int indexOfChild2 = (a == null || a.getParent() != cjaVar) ? -1 : cjaVar.indexOfChild(a);
                            jjc jjcVar = this.h;
                            if (indexOfChild2 >= 0) {
                                cjaVar.addView(jjcVar, indexOfChild2, nme.e(-1, -1, 80));
                            } else {
                                cjaVar.addView(jjcVar, nme.e(-1, -1, 80));
                                Log.w(str, "composer isn't a direct child of the root: overlay on top");
                            }
                        }
                        jjc jjcVar2 = this.h;
                        ChatActivityEnterView chatActivityEnterView2 = cVar3.a;
                        int i15 = bkb.Oe;
                        int i16 = ChatActivityEnterView.r7;
                        jjcVar2.setAccent(chatActivityEnterView2.F0(i15) | (-16777216));
                        jjc jjcVar3 = this.h;
                        TextPaint textPaint = jjcVar3.c;
                        int i17 = bkb.c6;
                        wjb wjbVar = jjcVar3.b;
                        jjcVar3.g0 = gl.B(bkb.v0(i17, wjbVar)) < 0.5f;
                        int v0 = bkb.v0(bkb.F6, wjbVar) | (-16777216);
                        jjcVar3.h0 = v0;
                        textPaint.setColor(v0);
                        int i18 = jjcVar3.h0;
                        jjc.Y1 = i18;
                        boolean z4 = jjcVar3.g0;
                        int i19 = jjcVar3.i0;
                        jjc.X1 = z4 ? bm2.f(0.12f, i19, -1) : bm2.f(0.32f, i19, i18);
                        jjc.Z1 = gl.L(7.0f);
                        jjcVar3.d.setColor(bkb.p1(jjcVar3.g0 ? 0.42f : 0.36f, jjcVar3.h0));
                        jjcVar3.j0 = Build.VERSION.SDK_INT >= 31 && gba.o() != 0;
                        jjcVar3.r = 0;
                        jjcVar3.s.setColor(jjcVar3.g0 ? 0 : 335544320);
                        jjcVar3.k0 = "";
                        jjcVar3.y1 = -1;
                        jjcVar3.l0 = null;
                        jjcVar3.o0.clear();
                        jjcVar3.U0 = true;
                        jjcVar3.D0 = 0.0f;
                        jjcVar3.C0 = 0.0f;
                        jjcVar3.E0 = 0.0f;
                        jjcVar3.F0 = 0.0f;
                        jjcVar3.H0 = -1.0f;
                        jjcVar3.G0 = -1.0f;
                        jjcVar3.J0 = -1.0f;
                        jjcVar3.L0 = false;
                        jjcVar3.setStyleIcon(null);
                        jjcVar3.M0 = false;
                        jjcVar3.P0 = false;
                        jjcVar3.x1 = null;
                        jjcVar3.P1 = false;
                        jjcVar3.z1 = false;
                        jjcVar3.D1 = null;
                        jjcVar3.E1.clear();
                        textPaint.setShader(null);
                        jjcVar3.S0 = 0L;
                        jjcVar3.T0 = 0.0f;
                        jjcVar3.A0 = true;
                        jjcVar3.X0 = 0.0f;
                        jjcVar3.Y0 = 0.0f;
                        jjcVar3.Z0 = true;
                        jjcVar3.a1 = 1.0f;
                        jjcVar3.b1 = 0.0f;
                        jjcVar3.l1 = -1;
                        Arrays.fill(jjcVar3.m1, 0.0f);
                        jjcVar3.O = null;
                        jjcVar3.P = 0.0f;
                        jjcVar3.Q = 0.0f;
                        jjcVar3.W = false;
                        jjcVar3.R.setEmpty();
                        jjcVar3.setPlaceholder(null);
                        jjcVar3.p0 = true;
                        jjcVar3.r0 = SystemClock.uptimeMillis();
                        jjcVar3.t0 = 0L;
                        jjcVar3.f0 = 0L;
                        jjcVar3.setVisibility(0);
                        jjcVar3.invalidate();
                        Log.d(str, "overlay shown at index " + cjaVar.indexOfChild(this.h) + "/" + cjaVar.getChildCount());
                    }
                }
                yic yicVar5 = this.K;
                if (yicVar5 != null && this.J && (str2 = this.l0) != null) {
                    yicVar5.setLanguage(str2);
                }
                c();
                DictationAsr.T(this.m0);
                DictationAsr.i(this.m0);
                u();
                gl.d3(this.j0, 1500L);
            }
        }
    }

    public final void u() {
        String a0 = DictationAsr.J(new long[2]) ? k96.a0(null, null, 2131745065, Long.valueOf(Math.round(r1[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(r1[1] / 1048576.0d)))) : null;
        jjc jjcVar = this.h;
        if (jjcVar != null) {
            jjcVar.setPlaceholder(a0);
        }
        yic yicVar = this.K;
        if (yicVar == null || !this.J) {
            return;
        }
        yicVar.setPlaceholder(a0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[LOOP:1: B:23:0x0086->B:25:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(ln3 ln3Var, String str) {
        int i;
        int min;
        long j;
        long max;
        int length;
        int i2;
        int[] iArr;
        long j2;
        long j3;
        int i3;
        long j4;
        int i4;
        String[] split = str == null ? new String[0] : str.trim().split("\\s+");
        int i5 = 0;
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                i5++;
            }
        }
        yl3 yl3Var = ln3Var.n;
        int i6 = yl3Var != null ? yl3Var.m : -1;
        if (i6 < 0) {
            am3 am3Var = this.d;
            if (am3Var == null) {
                i = 0;
                long max2 = Math.max(0L, i - 350) + this.N;
                min = Math.min(this.M.size(), i5);
                int i7 = 1;
                if (min <= 0) {
                    max = ((fjc) this.M.get(min - 1)).b;
                    j = 0;
                } else {
                    boolean isEmpty = this.L.isEmpty();
                    long j5 = this.N;
                    if (isEmpty) {
                        j = 0;
                        max = j5;
                    } else {
                        j = 0;
                        max = Math.max(j5, ((fjc) b00.f(1, this.L)).b);
                    }
                }
                int i8 = i5 - min;
                while (this.M.size() > i5) {
                    tb4.v(1, this.M);
                }
                length = split.length;
                i2 = 0;
                int i9 = 0;
                int i10 = 0;
                while (i2 < length) {
                    String str3 = split[i2];
                    if (str3.isEmpty()) {
                        j4 = max2;
                        j3 = j;
                        i3 = i10;
                        i4 = length;
                    } else {
                        j3 = j;
                        if (i9 < min) {
                            ((fjc) this.M.get(i9)).a = str3;
                            j4 = max2;
                            i3 = i10;
                            i4 = length;
                        } else {
                            i3 = i10 + 1;
                            j4 = max2;
                            i4 = length;
                            this.M.add(new fjc(str3, Math.max(max, (((Math.max(max2, max) - max) * i3) / Math.max(i7, i8)) + max)));
                        }
                        i9++;
                    }
                    i2++;
                    length = i4;
                    max2 = j4;
                    i7 = 1;
                    i10 = i3;
                    j = j3;
                }
                long j6 = j;
                yl3 yl3Var2 = ln3Var.n;
                iArr = yl3Var2 == null ? yl3Var2.g : null;
                if (iArr != null || iArr.length < 4 || str == null) {
                    return;
                }
                int length2 = split.length;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (i11 < length2) {
                    String str4 = split[i11];
                    if (str4.isEmpty()) {
                        j2 = j6;
                    } else {
                        int indexOf = str.indexOf(str4, i12);
                        if (indexOf < 0) {
                            return;
                        }
                        int length3 = str4.length() + indexOf;
                        long j7 = -1;
                        long j8 = -1;
                        while (true) {
                            int i15 = i14 + 3;
                            if (i15 >= iArr.length || iArr[i14 + 1] > length3) {
                                break;
                            }
                            if (iArr[i14] >= indexOf) {
                                if (j8 < j6) {
                                    j8 = iArr[i14 + 2];
                                }
                                j7 = iArr[i15];
                            }
                            i14 += 4;
                        }
                        if (j7 < j6 || i13 >= this.M.size()) {
                            j2 = j6;
                        } else {
                            fjc fjcVar = (fjc) this.M.get(i13);
                            long j9 = this.N;
                            fjcVar.b = j7 + j9;
                            j2 = j6;
                            fjcVar.c = Math.max(j2, j8) + j9;
                        }
                        i13++;
                        i12 = length3;
                    }
                    i11++;
                    j6 = j2;
                }
                return;
            }
            i6 = am3Var.c();
        }
        i = i6 / 32;
        long max22 = Math.max(0L, i - 350) + this.N;
        min = Math.min(this.M.size(), i5);
        int i72 = 1;
        if (min <= 0) {
        }
        int i82 = i5 - min;
        while (this.M.size() > i5) {
        }
        length = split.length;
        i2 = 0;
        int i92 = 0;
        int i102 = 0;
        while (i2 < length) {
        }
        long j62 = j;
        yl3 yl3Var22 = ln3Var.n;
        if (yl3Var22 == null) {
        }
        if (iArr != null) {
        }
    }
}
