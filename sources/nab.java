// default package

import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nab implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sbb b;

    public /* synthetic */ nab(sbb sbbVar, byte b) {
        this.a = b;
        this.b = sbbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0134  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        ArrayList arrayList;
        byte b = this.a;
        sbb sbbVar = this.b;
        int i3 = 0;
        switch (b) {
            case 0:
                sbbVar.j();
                sbbVar.X1 = false;
                int i4 = sbbVar.c;
                if (sbbVar.L1 == null) {
                    sbbVar.o(true);
                    break;
                } else {
                    sbbVar.w();
                    dab dabVar = new dab(sbbVar, (byte) 1);
                    if (sbbVar.I1 == null) {
                        c8b c8bVar = sbbVar.L1;
                        if (c8bVar.K && !c8bVar.v() && !c8bVar.g) {
                            long j = c8bVar.h0;
                            if (j > 0 && !c8bVar.n) {
                                long j2 = (long) ((c8bVar.a0 - c8bVar.Z) * j);
                                if (j2 < 68999) {
                                    i = i4;
                                    arrayList = null;
                                    i2 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    c8bVar.a0 = (59000.0f / c8bVar.h0) + c8bVar.Z;
                                    arrayList.add(c8bVar);
                                    long j3 = 59000;
                                    long j4 = 59000;
                                    while (true) {
                                        i2 = i3;
                                        if (j4 < j2) {
                                            if (Math.min(j3, j2 - j4) >= 1000) {
                                                long j5 = j3;
                                                c8b g = c8bVar.g();
                                                float f = c8bVar.Z;
                                                int i5 = i4;
                                                float f2 = c8bVar.h0;
                                                g.Z = (j4 / f2) + f;
                                                g.a0 = ((j4 + r2) / f2) + c8bVar.Z;
                                                g.C0 = "";
                                                j4 += j5;
                                                arrayList.add(g);
                                                i3 = i2;
                                                c8bVar = c8bVar;
                                                j3 = j5;
                                                i4 = i5;
                                            }
                                        }
                                    }
                                    i = i4;
                                }
                                sbbVar.I1 = arrayList;
                                if (arrayList != null) {
                                    sbbVar.J1 = new ArrayList();
                                    sbbVar.K1 = new ArrayList();
                                    for (int i6 = i2; i6 < sbbVar.I1.size(); i6 = qd4.g(i6, i6, 1, sbbVar.K1)) {
                                        sbbVar.J1.add(Integer.valueOf(i6));
                                    }
                                }
                            }
                        }
                        i = i4;
                        i2 = 0;
                        arrayList = null;
                        sbbVar.I1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i = i4;
                        i2 = 0;
                    }
                    if (sbbVar.I1 != null) {
                        ArrayList arrayList2 = sbbVar.K1;
                        int size = arrayList2.size();
                        int i7 = i2;
                        while (i7 < size) {
                            Object obj = arrayList2.get(i7);
                            i7++;
                            Integer num = (Integer) obj;
                            if (sbbVar.J1.contains(num)) {
                                c8b c8bVar2 = (c8b) sbbVar.I1.get(num.intValue());
                                c8b c8bVar3 = sbbVar.L1;
                                if (c8bVar3 == c8bVar2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[i2] = sbbVar.d1.getText();
                                    ArrayList Y = uc7.s1(i).l5() ? ls6.d0(i).Y(charSequenceArr, true, true) : new ArrayList();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[i2] = sbbVar.L1.C0;
                                    ArrayList Y2 = uc7.s1(i).l5() ? ls6.d0(i).Y(charSequenceArr2, true, true) : new ArrayList();
                                    c8b c8bVar4 = sbbVar.L1;
                                    c8bVar4.k = (TextUtils.equals(c8bVar4.C0, charSequenceArr[i2]) && ls6.M(Y, Y2)) ? i2 : 1;
                                    sbbVar.L1.C0 = new SpannableString(sbbVar.d1.getText());
                                } else if (c8bVar2.C0 == null) {
                                    c8bVar3.k = i2;
                                    c8bVar3.C0 = new SpannableString("");
                                }
                                dabVar.a(c8bVar2);
                                i2 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {sbbVar.d1.getText()};
                        ArrayList Y3 = uc7.s1(i).l5() ? ls6.d0(i).Y(charSequenceArr3, true, true) : new ArrayList();
                        ArrayList Y4 = uc7.s1(i).l5() ? ls6.d0(i).Y(new CharSequence[]{sbbVar.L1.C0}, true, true) : new ArrayList();
                        c8b c8bVar5 = sbbVar.L1;
                        c8bVar5.k = (TextUtils.equals(c8bVar5.C0, charSequenceArr3[0]) && ls6.M(Y3, Y4)) ? false : true;
                        sbbVar.L1.C0 = new SpannableString(sbbVar.d1.getText());
                        dabVar.a(sbbVar.L1);
                    }
                    long j6 = yac.h(i).n;
                    TLRPC.InputPeer inputPeer = sbbVar.L1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j6 = wf3.m(inputPeer);
                    }
                    sbbVar.L1 = null;
                    sbbVar.w = true;
                    sbbVar.x = j6;
                    sbbVar.C2 = true;
                    sbbVar.l();
                    pqa pqaVar = new pqa(sbbVar, j6, (byte) 6);
                    jbb jbbVar = sbbVar.y;
                    if (jbbVar != null) {
                        jbbVar.c(j6, pqaVar);
                    } else {
                        pqaVar.run();
                    }
                    uc7.e1().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            default:
                sbbVar.d = false;
                hl.K3(sbbVar.b);
                if (sbbVar.C0 != null) {
                    if (sbbVar.R1) {
                        CameraController.getInstance().stopVideoRecording(sbbVar.C0.getCameraSession(), false);
                    }
                    sbbVar.t(false);
                }
                hbb hbbVar = sbbVar.Y0;
                if (hbbVar != null) {
                    hbbVar.set(null);
                }
                sbbVar.x();
                sbbVar.w();
                File file = sbbVar.H1;
                if (file != null && !sbbVar.w) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                sbbVar.H1 = null;
                hl.d3(new bab(sbbVar, (byte) 27), 16L);
                nbb nbbVar = sbbVar.G;
                if (nbbVar != null) {
                    nbbVar.f(false);
                }
                if (sbbVar.y2 != null) {
                    sbbVar.y2 = null;
                }
                sbbVar.m2 = null;
                sbb sbbVar2 = sbb.G2;
                if (sbbVar2 != null) {
                    sbbVar2.o(false);
                }
                sbb.G2 = null;
                rbb rbbVar = sbbVar.n;
                if (rbbVar != null) {
                    rbbVar.setTag(R.id.bulletin_delegate_tag, null);
                }
                h8b h8bVar = sbbVar.m0;
                if (h8bVar != null) {
                    h8bVar.setTag(R.id.bulletin_delegate_tag, null);
                }
                gbb gbbVar = sbbVar.B0;
                if (gbbVar != null) {
                    gbbVar.b();
                    break;
                }
                break;
        }
    }
}
