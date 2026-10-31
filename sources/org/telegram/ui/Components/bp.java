package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bp extends sk0 {
    public final org.telegram.ui.ActionBar.p6 c;
    public ArrayList d;
    public WeakReference e;
    public final int h;
    public final int n;
    public final long r;
    public int f = -1;
    public final HashMap s = new HashMap();
    public final HashMap w = new HashMap();

    public bp(int i10, long j10, org.telegram.ui.sn snVar, int i11) {
        this.n = i11;
        this.r = j10;
        this.c = snVar;
        this.h = i10;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(int i10) {
        int i11 = this.f;
        if (i11 == i10) {
            return;
        }
        if (i11 >= 0) {
            g(i11);
            WeakReference weakReference = this.e;
            e11 e11Var = weakReference == null ? null : (e11) weakReference.get();
            if (e11Var != null) {
                e11Var.setSelected(false);
            }
        }
        this.f = i10;
        g(i10);
    }

    @Override // s4.g0
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        FileInputStream fileInputStream;
        char c10;
        int h;
        int intValue;
        String[] split;
        e11 e11Var = (e11) c1Var.a;
        org.telegram.ui.ActionBar.s6 i11 = ((cp) this.d.get(i10)).a.i(((cp) this.d.get(i10)).c);
        if (i11 != null && i11.b != null && !i11.T && new File(i11.b).exists() && i11.b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(i11.b));
                int i12 = 0;
                boolean z10 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.ga.p3);
                        if (read == -1) {
                            fileInputStream = fileInputStream2;
                            break;
                        }
                        int i13 = i12;
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            if (i14 >= read) {
                                fileInputStream = fileInputStream2;
                                break;
                            }
                            byte[] bArr = org.telegram.ui.Cells.ga.p3;
                            if (bArr[i14] == 10) {
                                int i16 = i14 - i15;
                                int i17 = i16 + 1;
                                String str = new String(bArr, i15, i16, "UTF-8");
                                if (str.startsWith("WLS=")) {
                                    String substring = str.substring(4);
                                    Uri parse = Uri.parse(substring);
                                    i11.e = parse.getQueryParameter("slug");
                                    File h10 = org.telegram.messenger.w0.h();
                                    StringBuilder sb2 = new StringBuilder();
                                    fileInputStream = fileInputStream2;
                                    try {
                                        sb2.append(Utilities.a(substring));
                                        sb2.append(".wp");
                                        i11.c = new File(h10, sb2.toString()).getAbsolutePath();
                                        String queryParameter = parse.getQueryParameter("mode");
                                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                            int i18 = 0;
                                            while (true) {
                                                if (i18 >= split.length) {
                                                    break;
                                                }
                                                if ("blur".equals(split[i18])) {
                                                    i11.h = true;
                                                    break;
                                                }
                                                i18++;
                                            }
                                        }
                                        if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                            try {
                                                String queryParameter2 = parse.getQueryParameter("bg_color");
                                                if (!TextUtils.isEmpty(queryParameter2)) {
                                                    i11.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                    if (queryParameter2.length() >= 13 && org.telegram.messenger.i0.S1(queryParameter2.charAt(6))) {
                                                        i11.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                    }
                                                    if (queryParameter2.length() >= 20 && org.telegram.messenger.i0.S1(queryParameter2.charAt(13))) {
                                                        i11.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                    }
                                                    if (queryParameter2.length() == 27 && org.telegram.messenger.i0.S1(queryParameter2.charAt(20))) {
                                                        i11.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                    }
                                                }
                                            } catch (Exception unused) {
                                            }
                                            try {
                                                String queryParameter3 = parse.getQueryParameter("rotation");
                                                if (!TextUtils.isEmpty(queryParameter3)) {
                                                    i11.y = Utilities.z(queryParameter3).intValue();
                                                }
                                            } catch (Exception unused2) {
                                            }
                                            String queryParameter4 = parse.getQueryParameter("intensity");
                                            if (!TextUtils.isEmpty(queryParameter4)) {
                                                i11.D = Utilities.z(queryParameter4).intValue();
                                            }
                                            if (i11.D == 0) {
                                                i11.D = 50;
                                            }
                                        }
                                        c10 = 65535;
                                        i15 += i17;
                                        i13 += i17;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Throwable th3 = th;
                                        try {
                                            fileInputStream.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                    }
                                } else {
                                    fileInputStream = fileInputStream2;
                                    if (str.startsWith("WPS")) {
                                        i11.P = i17 + i13;
                                        z10 = true;
                                        break;
                                    }
                                    int indexOf = str.indexOf(61);
                                    c10 = 65535;
                                    if (indexOf != -1 && ((h = org.telegram.ui.ActionBar.d5.h(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.t6.ra || h == org.telegram.ui.ActionBar.t6.ob || h == org.telegram.ui.ActionBar.t6.Be || h == org.telegram.ui.ActionBar.t6.Ce || h == org.telegram.ui.ActionBar.t6.De || h == org.telegram.ui.ActionBar.t6.Ee)) {
                                        String substring2 = str.substring(indexOf + 1);
                                        if (substring2.length() <= 0 || substring2.charAt(0) != '#') {
                                            intValue = Utilities.z(substring2).intValue();
                                        } else {
                                            try {
                                                intValue = Color.parseColor(substring2);
                                            } catch (Exception unused3) {
                                                intValue = Utilities.z(substring2).intValue();
                                            }
                                        }
                                        if (h == org.telegram.ui.ActionBar.t6.ra) {
                                            i11.Q = intValue;
                                        } else if (h == org.telegram.ui.ActionBar.t6.ob) {
                                            i11.R = intValue;
                                        } else if (h == org.telegram.ui.ActionBar.t6.Be) {
                                            i11.L = intValue;
                                        } else if (h == org.telegram.ui.ActionBar.t6.Ce) {
                                            i11.M = intValue;
                                        } else if (h == org.telegram.ui.ActionBar.t6.De) {
                                            i11.N = intValue;
                                        } else if (h == org.telegram.ui.ActionBar.t6.Ee) {
                                            i11.O = intValue;
                                        }
                                    }
                                    i15 += i17;
                                    i13 += i17;
                                }
                            } else {
                                fileInputStream = fileInputStream2;
                                c10 = 65535;
                            }
                            i14++;
                            fileInputStream2 = fileInputStream;
                        }
                        if (z10 || i12 == i13) {
                            break;
                        }
                        fileInputStream.getChannel().position(i13);
                        i12 = i13;
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th5) {
                        th = th5;
                        fileInputStream = fileInputStream2;
                    }
                }
                fileInputStream.close();
            } catch (Throwable th6) {
                org.telegram.messenger.f8.g(th6, true);
            }
            if (i11.c == null || i11.f || new File(i11.c).exists()) {
                i11.T = true;
            } else {
                HashMap hashMap = this.w;
                if (!hashMap.containsKey(i11)) {
                    hashMap.put(i11, i11.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i11.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i11.E).sendRequest(getwallpaper, new ag.k0(27, this, i11));
                }
            }
        }
        cp cpVar = (cp) this.d.get(i10);
        cp cpVar2 = e11Var.G;
        boolean z11 = cpVar2 != null && yf.b.a(cpVar2.a.c, cpVar.a.c) && !org.telegram.ui.ay.x4 && e11Var.V == cpVar.c;
        e11Var.setFocusable(true);
        e11Var.setEnabled(true);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.i5, e11Var, null);
        e11Var.f(cpVar, this.r, z11);
        e11Var.g(i10 == this.f, z11);
        if (i10 == this.f) {
            this.e = new WeakReference(e11Var);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        return new ck0(new e11(this.h, this.n, context, p6Var));
    }
}
