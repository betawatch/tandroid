package org.telegram.ui;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class nc extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ pc e;

    public nc(pc pcVar, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = pcVar;
        this.c = i7;
        this.d = f6Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
    public final int b() {
        return this.e.c.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02e8  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        FileInputStream fileInputStream;
        boolean z10;
        int h;
        int intValue;
        String[] split;
        org.telegram.ui.Components.yz0 yz0Var = (org.telegram.ui.Components.yz0) d1Var.a;
        pc pcVar = this.e;
        ArrayList arrayList = pcVar.c;
        org.telegram.ui.ActionBar.j6 i10 = ((org.telegram.ui.Components.uo) arrayList.get(i7)).a.i(((org.telegram.ui.Components.uo) arrayList.get(i7)).c);
        if (i10 != null && i10.b != null && !i10.T && new File(i10.b).exists()) {
            HashMap hashMap = pcVar.y;
            if (i10.b != null) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(i10.b));
                    int i11 = 0;
                    boolean z11 = false;
                    while (true) {
                        try {
                            int read = fileInputStream2.read(org.telegram.ui.Cells.ga.p3);
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
                                byte[] bArr = org.telegram.ui.Cells.ga.p3;
                                if (bArr[i13] == 10) {
                                    int i15 = i13 - i14;
                                    int i16 = i15 + 1;
                                    fileInputStream = fileInputStream2;
                                    try {
                                        String str = new String(bArr, i14, i15, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            i10.e = parse.getQueryParameter("slug");
                                            File h7 = org.telegram.messenger.t0.h();
                                            StringBuilder sb2 = new StringBuilder();
                                            z10 = z11;
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
                                                    i10.D = Utilities.z(queryParameter4).intValue();
                                                }
                                                if (i10.D == 0) {
                                                    i10.D = 50;
                                                }
                                            }
                                        } else {
                                            z10 = z11;
                                            if (str.startsWith("WPS")) {
                                                i10.P = i12 + i16;
                                                z11 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
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
                                                    i10.Q = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.k6.ob) {
                                                    i10.R = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.k6.Be) {
                                                    i10.L = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.k6.Ce) {
                                                    i10.M = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.k6.De) {
                                                    i10.N = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.k6.Ee) {
                                                    i10.O = intValue;
                                                }
                                            }
                                        }
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
                                    z10 = z11;
                                }
                                i13++;
                                fileInputStream2 = fileInputStream;
                                z11 = z10;
                            }
                            if (z11 || i11 == i12) {
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
                    z9 = true;
                    i10.T = true;
                    org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(i7);
                    yz0Var.setEnabled(z9);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.i5, yz0Var, null);
                    yz0Var.f(uoVar, 0L, false);
                    yz0Var.g(uoVar.d, false);
                    yz0Var.setFallbackWallpaper(uoVar.a.b ? null : pcVar.w);
                }
                if (!hashMap.containsKey(i10)) {
                    hashMap.put(i10, i10.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i10.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i10.E).sendRequest(getwallpaper, new bi.j(29, pcVar, i10));
                }
            }
        }
        z9 = true;
        org.telegram.ui.Components.uo uoVar2 = (org.telegram.ui.Components.uo) arrayList.get(i7);
        yz0Var.setEnabled(z9);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.i5, yz0Var, null);
        yz0Var.f(uoVar2, 0L, false);
        yz0Var.g(uoVar2.d, false);
        yz0Var.setFallbackWallpaper(uoVar2.a.b ? null : pcVar.w);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new org.telegram.ui.Components.xi0(new mc(this.c, 3, viewGroup.getContext(), this.d));
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        pc pcVar = this.e;
        ArrayList arrayList = pcVar.c;
        int b10 = d1Var.b();
        View view = d1Var.a;
        if (b10 < 0 || b10 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList.get(b10);
        org.telegram.ui.Components.yz0 yz0Var = (org.telegram.ui.Components.yz0) view;
        yz0Var.g(uoVar.d, false);
        yz0Var.setFallbackWallpaper(uoVar.a.b ? null : pcVar.w);
    }
}
