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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class to extends sj0 {
    public final org.telegram.ui.ActionBar.e6 c;
    public ArrayList d;
    public WeakReference e;
    public final int h;
    public final int n;
    public final long r;
    public int f = -1;
    public final HashMap s = new HashMap();
    public final HashMap w = new HashMap();

    public to(int i3, long j10, org.telegram.ui.um umVar, int i10) {
        this.n = i10;
        this.r = j10;
        this.c = umVar;
        this.h = i3;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    public final void E(int i3) {
        int i10 = this.f;
        if (i10 == i3) {
            return;
        }
        if (i10 >= 0) {
            g(i10);
            WeakReference weakReference = this.e;
            yz0 yz0Var = weakReference == null ? null : (yz0) weakReference.get();
            if (yz0Var != null) {
                yz0Var.setSelected(false);
            }
        }
        this.f = i3;
        g(i3);
    }

    @Override // u4.h0
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        FileInputStream fileInputStream;
        char c2;
        int h;
        int intValue;
        String[] split;
        yz0 yz0Var = (yz0) d1Var.a;
        org.telegram.ui.ActionBar.j6 i10 = ((uo) this.d.get(i3)).a.i(((uo) this.d.get(i3)).c);
        if (i10 != null && i10.b != null && !i10.U && new File(i10.b).exists() && i10.b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(i10.b));
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.ga.q3);
                        if (read == -1) {
                            fileInputStream = fileInputStream2;
                            break;
                        }
                        int i12 = i11;
                        int i13 = 0;
                        int i14 = 0;
                        while (true) {
                            if (i13 >= read) {
                                fileInputStream = fileInputStream2;
                                break;
                            }
                            byte[] bArr = org.telegram.ui.Cells.ga.q3;
                            if (bArr[i13] == 10) {
                                int i15 = i13 - i14;
                                int i16 = i15 + 1;
                                String str = new String(bArr, i14, i15, "UTF-8");
                                if (str.startsWith("WLS=")) {
                                    String substring = str.substring(4);
                                    Uri parse = Uri.parse(substring);
                                    i10.e = parse.getQueryParameter("slug");
                                    File h7 = org.telegram.messenger.t0.h();
                                    StringBuilder sb2 = new StringBuilder();
                                    fileInputStream = fileInputStream2;
                                    try {
                                        sb2.append(Utilities.a(substring));
                                        sb2.append(".wp");
                                        i10.c = new File(h7, sb2.toString()).getAbsolutePath();
                                        String queryParameter = parse.getQueryParameter("mode");
                                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                            int i17 = 0;
                                            while (true) {
                                                if (i17 >= split.length) {
                                                    break;
                                                }
                                                if ("blur".equals(split[i17])) {
                                                    i10.h = true;
                                                    break;
                                                }
                                                i17++;
                                            }
                                        }
                                        if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                            try {
                                                String queryParameter2 = parse.getQueryParameter("bg_color");
                                                if (!TextUtils.isEmpty(queryParameter2)) {
                                                    i10.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                    if (queryParameter2.length() >= 13 && org.telegram.messenger.g0.S1(queryParameter2.charAt(6))) {
                                                        i10.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                    }
                                                    if (queryParameter2.length() >= 20 && org.telegram.messenger.g0.S1(queryParameter2.charAt(13))) {
                                                        i10.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                    }
                                                    if (queryParameter2.length() == 27 && org.telegram.messenger.g0.S1(queryParameter2.charAt(20))) {
                                                        i10.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                    }
                                                }
                                            } catch (Exception unused) {
                                            }
                                            try {
                                                String queryParameter3 = parse.getQueryParameter("rotation");
                                                if (!TextUtils.isEmpty(queryParameter3)) {
                                                    i10.y = Utilities.z(queryParameter3).intValue();
                                                }
                                            } catch (Exception unused2) {
                                            }
                                            String queryParameter4 = parse.getQueryParameter("intensity");
                                            if (!TextUtils.isEmpty(queryParameter4)) {
                                                i10.E = Utilities.z(queryParameter4).intValue();
                                            }
                                            if (i10.E == 0) {
                                                i10.E = 50;
                                            }
                                        }
                                        c2 = 65535;
                                        i14 += i16;
                                        i12 += i16;
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
                                        i10.Q = i16 + i12;
                                        z10 = true;
                                        break;
                                    }
                                    int indexOf = str.indexOf(61);
                                    c2 = 65535;
                                    if (indexOf != -1 && ((h = org.telegram.ui.ActionBar.u4.h(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.k6.ra || h == org.telegram.ui.ActionBar.k6.ob || h == org.telegram.ui.ActionBar.k6.Be || h == org.telegram.ui.ActionBar.k6.Ce || h == org.telegram.ui.ActionBar.k6.De || h == org.telegram.ui.ActionBar.k6.Ee)) {
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
                                        if (h == org.telegram.ui.ActionBar.k6.ra) {
                                            i10.R = intValue;
                                        } else if (h == org.telegram.ui.ActionBar.k6.ob) {
                                            i10.S = intValue;
                                        } else if (h == org.telegram.ui.ActionBar.k6.Be) {
                                            i10.M = intValue;
                                        } else if (h == org.telegram.ui.ActionBar.k6.Ce) {
                                            i10.N = intValue;
                                        } else if (h == org.telegram.ui.ActionBar.k6.De) {
                                            i10.O = intValue;
                                        } else if (h == org.telegram.ui.ActionBar.k6.Ee) {
                                            i10.P = intValue;
                                        }
                                    }
                                    i14 += i16;
                                    i12 += i16;
                                }
                            } else {
                                fileInputStream = fileInputStream2;
                                c2 = 65535;
                            }
                            i13++;
                            fileInputStream2 = fileInputStream;
                        }
                        if (z10 || i11 == i12) {
                            break;
                        }
                        fileInputStream.getChannel().position(i12);
                        i11 = i12;
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th5) {
                        th = th5;
                        fileInputStream = fileInputStream2;
                    }
                }
                fileInputStream.close();
            } catch (Throwable th6) {
                org.telegram.messenger.a8.g(th6, true);
            }
            if (i10.c == null || i10.f || new File(i10.c).exists()) {
                i10.U = true;
            } else {
                HashMap hashMap = this.w;
                if (!hashMap.containsKey(i10)) {
                    hashMap.put(i10, i10.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i10.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i10.F).sendRequest(getwallpaper, new org.telegram.ui.ActionBar.h6(this, i10, 16));
                }
            }
        }
        uo uoVar = (uo) this.d.get(i3);
        uo uoVar2 = yz0Var.H;
        boolean z11 = uoVar2 != null && jg.b.a(uoVar2.a.c, uoVar.a.c) && !org.telegram.ui.uw.y4 && yz0Var.W == uoVar.c;
        yz0Var.setFocusable(true);
        yz0Var.setEnabled(true);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.i5, yz0Var, null);
        yz0Var.f(uoVar, this.r, z11);
        yz0Var.g(i3 == this.f, z11);
        if (i3 == this.f) {
            this.e = new WeakReference(yz0Var);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        return new bj0(new yz0(this.h, this.n, context, e6Var));
    }
}
