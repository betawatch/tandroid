// default package

import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mab implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rbb b;

    public /* synthetic */ mab(rbb rbbVar, byte b) {
        this.a = b;
        this.b = rbbVar;
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
        rbb rbbVar = this.b;
        int i3 = 0;
        switch (b) {
            case 0:
                rbbVar.j();
                rbbVar.X1 = false;
                int i4 = rbbVar.c;
                if (rbbVar.L1 == null) {
                    rbbVar.o(true);
                    break;
                } else {
                    rbbVar.w();
                    dab dabVar = new dab(rbbVar, (byte) 1);
                    if (rbbVar.I1 == null) {
                        c8b c8bVar = rbbVar.L1;
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
                                rbbVar.I1 = arrayList;
                                if (arrayList != null) {
                                    rbbVar.J1 = new ArrayList();
                                    rbbVar.K1 = new ArrayList();
                                    for (int i6 = i2; i6 < rbbVar.I1.size(); i6 = qd4.g(i6, i6, 1, rbbVar.K1)) {
                                        rbbVar.J1.add(Integer.valueOf(i6));
                                    }
                                }
                            }
                        }
                        i = i4;
                        i2 = 0;
                        arrayList = null;
                        rbbVar.I1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i = i4;
                        i2 = 0;
                    }
                    if (rbbVar.I1 != null) {
                        ArrayList arrayList2 = rbbVar.K1;
                        int size = arrayList2.size();
                        int i7 = i2;
                        while (i7 < size) {
                            Object obj = arrayList2.get(i7);
                            i7++;
                            Integer num = (Integer) obj;
                            if (rbbVar.J1.contains(num)) {
                                c8b c8bVar2 = (c8b) rbbVar.I1.get(num.intValue());
                                c8b c8bVar3 = rbbVar.L1;
                                if (c8bVar3 == c8bVar2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[i2] = rbbVar.d1.getText();
                                    ArrayList Y = uc7.s1(i).l5() ? ls6.d0(i).Y(charSequenceArr, true, true) : new ArrayList();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[i2] = rbbVar.L1.C0;
                                    ArrayList Y2 = uc7.s1(i).l5() ? ls6.d0(i).Y(charSequenceArr2, true, true) : new ArrayList();
                                    c8b c8bVar4 = rbbVar.L1;
                                    c8bVar4.k = (TextUtils.equals(c8bVar4.C0, charSequenceArr[i2]) && ls6.M(Y, Y2)) ? i2 : 1;
                                    rbbVar.L1.C0 = new SpannableString(rbbVar.d1.getText());
                                } else if (c8bVar2.C0 == null) {
                                    c8bVar3.k = i2;
                                    c8bVar3.C0 = new SpannableString("");
                                }
                                dabVar.a(c8bVar2);
                                i2 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {rbbVar.d1.getText()};
                        ArrayList Y3 = uc7.s1(i).l5() ? ls6.d0(i).Y(charSequenceArr3, true, true) : new ArrayList();
                        ArrayList Y4 = uc7.s1(i).l5() ? ls6.d0(i).Y(new CharSequence[]{rbbVar.L1.C0}, true, true) : new ArrayList();
                        c8b c8bVar5 = rbbVar.L1;
                        c8bVar5.k = (TextUtils.equals(c8bVar5.C0, charSequenceArr3[0]) && ls6.M(Y3, Y4)) ? false : true;
                        rbbVar.L1.C0 = new SpannableString(rbbVar.d1.getText());
                        dabVar.a(rbbVar.L1);
                    }
                    long j6 = yac.h(i).n;
                    TLRPC.InputPeer inputPeer = rbbVar.L1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j6 = wf3.m(inputPeer);
                    }
                    rbbVar.L1 = null;
                    rbbVar.w = true;
                    rbbVar.x = j6;
                    rbbVar.C2 = true;
                    rbbVar.l();
                    pqa pqaVar = new pqa(rbbVar, j6, (byte) 6);
                    ibb ibbVar = rbbVar.y;
                    if (ibbVar != null) {
                        ibbVar.c(j6, pqaVar);
                    } else {
                        pqaVar.run();
                    }
                    uc7.e1().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            default:
                rbbVar.d = false;
                hl.K3(rbbVar.b);
                if (rbbVar.C0 != null) {
                    if (rbbVar.R1) {
                        CameraController.getInstance().stopVideoRecording(rbbVar.C0.getCameraSession(), false);
                    }
                    rbbVar.t(false);
                }
                gbb gbbVar = rbbVar.Y0;
                if (gbbVar != null) {
                    gbbVar.set(null);
                }
                rbbVar.x();
                rbbVar.w();
                File file = rbbVar.H1;
                if (file != null && !rbbVar.w) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                rbbVar.H1 = null;
                hl.d3(new bab(rbbVar, (byte) 27), 16L);
                mbb mbbVar = rbbVar.G;
                if (mbbVar != null) {
                    mbbVar.f(false);
                }
                if (rbbVar.y2 != null) {
                    rbbVar.y2 = null;
                }
                rbbVar.m2 = null;
                rbb rbbVar2 = rbb.G2;
                if (rbbVar2 != null) {
                    rbbVar2.o(false);
                }
                rbb.G2 = null;
                qbb qbbVar = rbbVar.n;
                if (qbbVar != null) {
                    qbbVar.setTag(R.id.bulletin_delegate_tag, null);
                }
                h8b h8bVar = rbbVar.m0;
                if (h8bVar != null) {
                    h8bVar.setTag(R.id.bulletin_delegate_tag, null);
                }
                fbb fbbVar = rbbVar.B0;
                if (fbbVar != null) {
                    fbbVar.b();
                    break;
                }
                break;
        }
    }
}
