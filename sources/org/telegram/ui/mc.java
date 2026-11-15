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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class mc extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ oc e;

    public mc(oc ocVar, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = ocVar;
        this.c = i7;
        this.d = e6Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override // v4.h0
    public final int b() {
        return this.e.c.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02e7  */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        FileInputStream fileInputStream;
        boolean z11;
        int h;
        int intValue;
        String[] split;
        org.telegram.ui.Components.b01 b01Var = (org.telegram.ui.Components.b01) e1Var.a;
        oc ocVar = this.e;
        ArrayList arrayList = ocVar.c;
        org.telegram.ui.ActionBar.i6 i10 = ((org.telegram.ui.Components.dp) arrayList.get(i7)).a.i(((org.telegram.ui.Components.dp) arrayList.get(i7)).c);
        if (i10 != null && i10.b != null && !i10.U && new File(i10.b).exists()) {
            HashMap hashMap = ocVar.y;
            if (i10.b != null) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(i10.b));
                    int i11 = 0;
                    boolean z12 = false;
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
                                    fileInputStream = fileInputStream2;
                                    try {
                                        String str = new String(bArr, i14, i15, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            i10.e = parse.getQueryParameter("slug");
                                            File h7 = org.telegram.messenger.t0.h();
                                            StringBuilder sb2 = new StringBuilder();
                                            z11 = z12;
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
                                        } else {
                                            z11 = z12;
                                            if (str.startsWith("WPS")) {
                                                i10.Q = i12 + i16;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            if (indexOf != -1 && ((h = org.telegram.ui.ActionBar.s4.h(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.j6.ra || h == org.telegram.ui.ActionBar.j6.rb || h == org.telegram.ui.ActionBar.j6.Ee || h == org.telegram.ui.ActionBar.j6.Fe || h == org.telegram.ui.ActionBar.j6.Ge || h == org.telegram.ui.ActionBar.j6.He)) {
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
                                                if (h == org.telegram.ui.ActionBar.j6.ra) {
                                                    i10.R = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.j6.rb) {
                                                    i10.S = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.j6.Ee) {
                                                    i10.M = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.j6.Fe) {
                                                    i10.N = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.j6.Ge) {
                                                    i10.O = intValue;
                                                } else if (h == org.telegram.ui.ActionBar.j6.He) {
                                                    i10.P = intValue;
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
                                    z11 = z12;
                                }
                                i13++;
                                fileInputStream2 = fileInputStream;
                                z12 = z11;
                            }
                            if (z12 || i11 == i12) {
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
                    z10 = true;
                    i10.U = true;
                    org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) arrayList.get(i7);
                    b01Var.setEnabled(z10);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.i5, b01Var, null);
                    b01Var.f(dpVar, 0L, false);
                    b01Var.g(dpVar.d, false);
                    b01Var.setFallbackWallpaper(dpVar.a.b ? null : ocVar.w);
                }
                if (!hashMap.containsKey(i10)) {
                    hashMap.put(i10, i10.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i10.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i10.F).sendRequest(getwallpaper, new v7(1, ocVar, i10));
                }
            }
        }
        z10 = true;
        org.telegram.ui.Components.dp dpVar2 = (org.telegram.ui.Components.dp) arrayList.get(i7);
        b01Var.setEnabled(z10);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.i5, b01Var, null);
        b01Var.f(dpVar2, 0L, false);
        b01Var.g(dpVar2.d, false);
        b01Var.setFallbackWallpaper(dpVar2.a.b ? null : ocVar.w);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new org.telegram.ui.Components.cj0(new lc(this.c, 3, viewGroup.getContext(), this.d));
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        oc ocVar = this.e;
        ArrayList arrayList = ocVar.c;
        int b10 = e1Var.b();
        View view = e1Var.a;
        if (b10 < 0 || b10 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) arrayList.get(b10);
        org.telegram.ui.Components.b01 b01Var = (org.telegram.ui.Components.b01) view;
        b01Var.g(dpVar.d, false);
        b01Var.setFallbackWallpaper(dpVar.a.b ? null : ocVar.w);
    }
}
