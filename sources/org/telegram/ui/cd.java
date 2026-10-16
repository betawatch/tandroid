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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class cd extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;
    public final /* synthetic */ ed e;

    public cd(ed edVar, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.e = edVar;
        this.c = i10;
        this.d = c6Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.c.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x02eb  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        FileInputStream fileInputStream;
        boolean z11;
        int s10;
        int intValue;
        String[] split;
        org.telegram.ui.Components.w21 w21Var = (org.telegram.ui.Components.w21) b1Var.a;
        ed edVar = this.e;
        ArrayList arrayList = edVar.c;
        org.telegram.ui.ActionBar.f6 j10 = ((org.telegram.ui.Components.yp) arrayList.get(i10)).a.j(((org.telegram.ui.Components.yp) arrayList.get(i10)).c);
        if (j10 != null && j10.b != null && !j10.T && new File(j10.b).exists()) {
            HashMap hashMap = edVar.x;
            if (j10.b != null) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File(j10.b));
                    int i11 = 0;
                    boolean z12 = false;
                    while (true) {
                        try {
                            int read = fileInputStream2.read(org.telegram.ui.Cells.na.g3);
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
                                byte[] bArr = org.telegram.ui.Cells.na.g3;
                                if (bArr[i13] == 10) {
                                    int i15 = i13 - i14;
                                    int i16 = i15 + 1;
                                    fileInputStream = fileInputStream2;
                                    try {
                                        String str = new String(bArr, i14, i15, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            j10.e = parse.getQueryParameter("slug");
                                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                            StringBuilder sb2 = new StringBuilder();
                                            z11 = z12;
                                            sb2.append(Utilities.MD5(substring));
                                            sb2.append(".wp");
                                            j10.c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
                                            String queryParameter = parse.getQueryParameter("mode");
                                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                int i17 = 0;
                                                while (true) {
                                                    if (i17 >= split.length) {
                                                        break;
                                                    }
                                                    if ("blur".equals(split[i17])) {
                                                        j10.h = true;
                                                        break;
                                                    }
                                                    i17++;
                                                }
                                            }
                                            if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                                try {
                                                    String queryParameter2 = parse.getQueryParameter("bg_color");
                                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                                        j10.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                        if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                            j10.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                        }
                                                        if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                            j10.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                        }
                                                        if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                            j10.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                }
                                                try {
                                                    String queryParameter3 = parse.getQueryParameter("rotation");
                                                    if (!TextUtils.isEmpty(queryParameter3)) {
                                                        j10.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                    }
                                                } catch (Exception unused2) {
                                                }
                                                String queryParameter4 = parse.getQueryParameter("intensity");
                                                if (!TextUtils.isEmpty(queryParameter4)) {
                                                    j10.y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                                }
                                                if (j10.y == 0) {
                                                    j10.y = 50;
                                                }
                                            }
                                        } else {
                                            z11 = z12;
                                            if (str.startsWith("WPS")) {
                                                j10.P = i12 + i16;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.e5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.g6.ra || s10 == org.telegram.ui.ActionBar.g6.Aa || s10 == org.telegram.ui.ActionBar.g6.Nd || s10 == org.telegram.ui.ActionBar.g6.Od || s10 == org.telegram.ui.ActionBar.g6.Pd || s10 == org.telegram.ui.ActionBar.g6.Qd)) {
                                                String substring2 = str.substring(indexOf + 1);
                                                if (substring2.length() <= 0 || substring2.charAt(0) != '#') {
                                                    intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                                } else {
                                                    try {
                                                        intValue = Color.parseColor(substring2);
                                                    } catch (Exception unused3) {
                                                        intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                                    }
                                                }
                                                if (s10 == org.telegram.ui.ActionBar.g6.ra) {
                                                    j10.Q = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Aa) {
                                                    j10.R = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Nd) {
                                                    j10.L = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Od) {
                                                    j10.M = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Pd) {
                                                    j10.N = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.g6.Qd) {
                                                    j10.O = intValue;
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
                    FileLog.e(th6);
                }
                if (j10.c == null || j10.f || new File(j10.c).exists()) {
                    z10 = true;
                    j10.T = true;
                    org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList.get(i10);
                    w21Var.setEnabled(z10);
                    w21Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.i5, false));
                    w21Var.f(ypVar, 0L, false);
                    w21Var.g(ypVar.d, false);
                    w21Var.setFallbackWallpaper(ypVar.a.b ? null : edVar.v);
                }
                if (!hashMap.containsKey(j10)) {
                    hashMap.put(j10, j10.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = j10.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(j10.E).sendRequest(getwallpaper, new bi.m1(23, edVar, j10));
                }
            }
        }
        z10 = true;
        org.telegram.ui.Components.yp ypVar2 = (org.telegram.ui.Components.yp) arrayList.get(i10);
        w21Var.setEnabled(z10);
        w21Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.i5, false));
        w21Var.f(ypVar2, 0L, false);
        w21Var.g(ypVar2.d, false);
        w21Var.setFallbackWallpaper(ypVar2.a.b ? null : edVar.v);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.wl0(new bd(this.c, 3, viewGroup.getContext(), this.d));
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        ed edVar = this.e;
        ArrayList arrayList = edVar.c;
        int b10 = b1Var.b();
        View view = b1Var.a;
        if (b10 < 0 || b10 >= arrayList.size()) {
            return;
        }
        org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList.get(b10);
        org.telegram.ui.Components.w21 w21Var = (org.telegram.ui.Components.w21) view;
        w21Var.g(ypVar.d, false);
        w21Var.setFallbackWallpaper(ypVar.a.b ? null : edVar.v);
    }
}
