// default package

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kya implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kya(wv3 wv3Var, int i) {
        this.a = (byte) 0;
        this.b = wv3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] F0;
        ArrayList arrayList;
        ArrayList arrayList2;
        byte b = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wv3) obj).m0(0);
                break;
            case 1:
                pya pyaVar = (pya) obj;
                if (!pyaVar.x) {
                    pyaVar.E = 0.0f;
                    break;
                }
                break;
            case 2:
                hq6.d0(y6c.t0).d(2, null, ((kza) obj).f.document, (int) (System.currentTimeMillis() / 1000), false);
                break;
            case 3:
                ((e1b) obj).b();
                break;
            case 4:
                jq3 jq3Var = (jq3) obj;
                jq3Var.c(jq3Var.b);
                jq3Var.c = false;
                break;
            case 5:
                ((l5b) obj).run();
                break;
            case 6:
                k2b k2bVar = (k2b) obj;
                k2bVar.c();
                k2bVar.a(true);
                break;
            case 7:
                ((l1b) obj).a(null);
                break;
            case 8:
                ((t2b) obj).K();
                break;
            case 9:
                a3b a3bVar = (a3b) obj;
                ArrayList arrayList3 = a3bVar.c;
                if (arrayList3 != null) {
                    a3bVar.a.p1 = arrayList3;
                }
                y28 y28Var = a3bVar.a;
                long j = a3bVar.b;
                if (y28Var.r1 != j || y28Var.p1 != null) {
                    y28Var.r1 = j;
                    y28Var.h1();
                    y28Var.f1();
                    y28Var.c1(true);
                    TL_stories.PeerStories peerStories = y28Var.z0.Q0;
                    g2b g2bVar = y28Var.I1;
                    if (peerStories == null) {
                        TL_stories.PeerStories x = g2bVar.x(j);
                        if (x == null) {
                            x = g2bVar.y(j);
                        } else {
                            z = false;
                        }
                        g2bVar.U(x, z);
                        break;
                    } else {
                        g2bVar.U(peerStories, true);
                        break;
                    }
                }
                break;
            case 10:
                ((i46) obj).e(true);
                break;
            case 11:
                ((x3b) obj).requestLayout();
                break;
            case 12:
                w4b w4bVar = (w4b) obj;
                je5 je5Var = w4bVar.c;
                if (je5Var != null) {
                    je5Var.f(true);
                    w4bVar.c = null;
                }
                w4bVar.b(false);
                break;
            case 13:
                u4b u4bVar = (u4b) obj;
                if (u4bVar.w) {
                    u4bVar.F = true;
                    u4bVar.G = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    u4bVar.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    u4bVar.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    u4bVar.invalidate();
                    break;
                }
                break;
            case 14:
                u41 u41Var = (u41) obj;
                if (u41Var != null) {
                    u41Var.setLoading(false);
                    break;
                }
                break;
            case 15:
                ((v5b) ((gz9) obj).n).fullScroll(kk7.N1);
                break;
            case 16:
                s7b s7bVar = (s7b) obj;
                s7bVar.n0.onTouchEvent(gl.R());
                s7bVar.m0.X(gl.R());
                break;
            case 17:
                t7b t7bVar = (t7b) ((vr4) obj).m0;
                t7bVar.t(true);
                t7bVar.B0.setCameraThumb(t7bVar.y());
                break;
            case 18:
                y6b y6bVar = (y6b) obj;
                t7b t7bVar2 = y6bVar.c0;
                if (!t7bVar2.R1 && !t7bVar2.Q1 && t7bVar2.C0 != null && t7bVar2.g0 == 0 && t7bVar2.n1 != null) {
                    String M0 = k96.M0(y6bVar.isFrontface() ? 2131744473 : 2131744472, null);
                    je5 je5Var2 = t7bVar2.n1;
                    je5Var2.h = je5.a(M0, je5Var2.getTextPaint());
                    t7bVar2.n1.t(M0);
                    t7bVar2.n1.v();
                    na7.c1().edit().putInt("storysvddualhint", na7.c1().getInt("storysvddualhint", 0) + 1).apply();
                    break;
                }
                break;
            case 19:
                ((be0) obj).setVisibility(8);
                break;
            case 20:
                m8b m8bVar = ((v7b) obj).b;
                try {
                    a8b a8bVar = m8bVar.s;
                    if (a8bVar != null) {
                        if (m8bVar.b) {
                            gl.B2(a8bVar);
                        } else {
                            m8bVar.n.removeView(a8bVar);
                        }
                        m8bVar.s = null;
                        m8bVar.p();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 21:
                ((a8b) obj).y0.O(true);
                break;
            case 22:
                dbb dbbVar = (dbb) obj;
                int i = dbbVar.a;
                dbbVar.I = null;
                bbb bbbVar = dbbVar.c;
                if (bbbVar != null && bbbVar.getEditField() != null && dbbVar.c.getFieldText() != null) {
                    if (!dbbVar.c.a()) {
                        int selectionStart = dbbVar.c.getEditField().getSelectionStart();
                        int selectionEnd = dbbVar.c.getEditField().getSelectionEnd();
                        if (selectionStart == selectionEnd) {
                            CharSequence fieldText = dbbVar.c.getFieldText();
                            boolean z2 = fieldText instanceof Spanned;
                            su3[] su3VarArr = z2 ? (su3[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, su3.class) : null;
                            if (su3VarArr != null && su3VarArr.length > 0 && gba.E && y6c.h(i).p()) {
                                su3 su3Var = su3VarArr[su3VarArr.length - 1];
                                if (su3Var != null) {
                                    Spanned spanned = (Spanned) fieldText;
                                    int spanStart = spanned.getSpanStart(su3Var);
                                    int spanEnd = spanned.getSpanEnd(su3Var);
                                    if (selectionStart == spanEnd) {
                                        String substring = fieldText.toString().substring(spanStart, spanEnd);
                                        dbbVar.s = true;
                                        dbbVar.b();
                                        dbbVar.W = su3Var;
                                        dbbVar.c0 = null;
                                        dbbVar.b0 = null;
                                        String str = dbbVar.K;
                                        if (str == null || dbbVar.J != 2 || !str.equals(substring) || dbbVar.y || (arrayList2 = dbbVar.x) == null || arrayList2.isEmpty()) {
                                            int i2 = dbbVar.L + 1;
                                            dbbVar.L = i2;
                                            Runnable runnable = dbbVar.N;
                                            if (runnable != null) {
                                                gl.r(runnable);
                                            }
                                            dbbVar.N = new t79((Object) dbbVar, (Object) substring, i2, (byte) 21);
                                            ArrayList arrayList4 = dbbVar.x;
                                            if (arrayList4 == null || arrayList4.isEmpty()) {
                                                gl.e3(dbbVar.N, 600L);
                                            } else {
                                                dbbVar.N.run();
                                            }
                                        } else {
                                            dbbVar.w = false;
                                            dbbVar.b();
                                            zab zabVar = dbbVar.d;
                                            if (zabVar != null) {
                                                zabVar.setVisibility(0);
                                                dbbVar.d.invalidate();
                                            }
                                        }
                                        zab zabVar2 = dbbVar.d;
                                        if (zabVar2 != null) {
                                            zabVar2.invalidate();
                                            break;
                                        }
                                    }
                                }
                            } else {
                                gm[] gmVarArr = z2 ? (gm[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, gm.class) : null;
                                if ((gmVarArr == null || gmVarArr.length == 0) && selectionEnd < 52) {
                                    dbbVar.s = true;
                                    dbbVar.b();
                                    dbbVar.W = null;
                                    String substring2 = fieldText.toString().substring(0, selectionEnd);
                                    String str2 = dbbVar.K;
                                    if (str2 == null || dbbVar.J != 1 || !str2.equals(substring2) || dbbVar.y || (arrayList = dbbVar.x) == null || arrayList.isEmpty()) {
                                        int i3 = dbbVar.L + 1;
                                        dbbVar.L = i3;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (dbbVar.M == null || Math.abs(currentTimeMillis - dbbVar.O) > 360) {
                                            dbbVar.O = currentTimeMillis;
                                            F0 = gl.F0();
                                        } else {
                                            dbbVar.O = currentTimeMillis;
                                            F0 = dbbVar.M;
                                        }
                                        String[] strArr = F0;
                                        String[] strArr2 = dbbVar.M;
                                        if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                                            hq6.d0(i).O(strArr, false);
                                        }
                                        dbbVar.M = strArr;
                                        Runnable runnable2 = dbbVar.N;
                                        if (runnable2 != null) {
                                            gl.r(runnable2);
                                            dbbVar.N = null;
                                        }
                                        dbbVar.N = new ica((Object) dbbVar, (Object) strArr, (Object) substring2, i3, (byte) 5);
                                        ArrayList arrayList5 = dbbVar.x;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            gl.e3(dbbVar.N, 600L);
                                        } else {
                                            dbbVar.N.run();
                                        }
                                    } else {
                                        dbbVar.w = false;
                                        dbbVar.b();
                                        dbbVar.d.setVisibility(0);
                                        dbbVar.a0 = gl.L(10.0f);
                                        dbbVar.d.invalidate();
                                    }
                                    zab zabVar3 = dbbVar.d;
                                    if (zabVar3 != null) {
                                        zabVar3.invalidate();
                                        break;
                                    }
                                }
                            }
                            Runnable runnable3 = dbbVar.N;
                            if (runnable3 != null) {
                                gl.r(runnable3);
                                dbbVar.N = null;
                            }
                            dbbVar.s = false;
                            zab zabVar4 = dbbVar.d;
                            if (zabVar4 != null) {
                                zabVar4.invalidate();
                                break;
                            }
                        } else {
                            dbbVar.s = false;
                            zab zabVar5 = dbbVar.d;
                            if (zabVar5 != null) {
                                zabVar5.invalidate();
                                break;
                            }
                        }
                    } else {
                        dbbVar.s = false;
                        zab zabVar6 = dbbVar.d;
                        if (zabVar6 != null) {
                            zabVar6.invalidate();
                            break;
                        }
                    }
                } else {
                    dbbVar.s = false;
                    dbbVar.w = true;
                    zab zabVar7 = dbbVar.d;
                    if (zabVar7 != null) {
                        zabVar7.invalidate();
                        break;
                    }
                }
                break;
            case 23:
                pcb pcbVar = (pcb) obj;
                pcbVar.L = null;
                pcbVar.b();
                break;
            case 24:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) obj);
                break;
            case 25:
                ydb ydbVar = (ydb) obj;
                dha dhaVar = ydbVar.V;
                if (dhaVar != null && ydbVar.b0 != -1) {
                    dhaVar.a();
                    break;
                }
                break;
            case 26:
                hgb hgbVar = (hgb) obj;
                mv6 mv6Var = hgbVar.b;
                int i4 = y6c.t0;
                hgbVar.c = i4;
                hgbVar.d = gl.a1(na7.q1(i4).W3, "auto_lastSelectedDialog", 0L);
                hgbVar.e = false;
                hgbVar.f = false;
                hgbVar.g.clear();
                hgbVar.h.b();
                hgbVar.i.b();
                hgbVar.j.b();
                hgbVar.k.b();
                hgbVar.l.b();
                try {
                    mv6Var.o0(null);
                    ((zu6) mv6Var.b).a.setQueueTitle(null);
                    break;
                } catch (Throwable unused2) {
                    return;
                }
            case 27:
                kk7.f(((ggb) obj).g.c).k(kk7.f2, 0);
                break;
            case 28:
                gl.F3(((vhb) obj).s0);
                break;
            default:
                rib ribVar = (rib) obj;
                ribVar.C.invalidate();
                ribVar.R();
                break;
        }
    }

    public /* synthetic */ kya(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
