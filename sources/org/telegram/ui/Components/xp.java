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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xp extends mm0 {
    public final org.telegram.ui.ActionBar.u6 c;
    public ArrayList d;
    public WeakReference e;
    public final int h;
    public final int n;
    public final long r;
    public int f = -1;
    public final HashMap s = new HashMap();
    public final HashMap v = new HashMap();

    public xp(int i10, long j10, org.telegram.ui.un unVar, int i11) {
        this.n = i11;
        this.r = j10;
        this.c = unVar;
        this.h = i10;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    public final void E(int i10) {
        int i11 = this.f;
        if (i11 == i10) {
            return;
        }
        if (i11 >= 0) {
            m(i11);
            WeakReference weakReference = this.e;
            e31 e31Var = weakReference == null ? null : (e31) weakReference.get();
            if (e31Var != null) {
                e31Var.setSelected(false);
            }
        }
        this.f = i10;
        m(i10);
    }

    @Override // s4.h0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        FileInputStream fileInputStream;
        char c10;
        int i11;
        int intValue;
        String[] split;
        e31 e31Var = (e31) e1Var.a;
        org.telegram.ui.ActionBar.x6 i12 = ((yp) this.d.get(i10)).a.i(((yp) this.d.get(i10)).c);
        if (i12 != null && i12.b != null && !i12.T && new File(i12.b).exists() && i12.b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(i12.b));
                int i13 = 0;
                boolean z10 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.ra.q3);
                        if (read == -1) {
                            fileInputStream = fileInputStream2;
                            break;
                        }
                        int i14 = i13;
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            if (i15 >= read) {
                                fileInputStream = fileInputStream2;
                                break;
                            }
                            byte[] bArr = org.telegram.ui.Cells.ra.q3;
                            if (bArr[i15] == 10) {
                                int i17 = i15 - i16;
                                int i18 = i17 + 1;
                                String str = new String(bArr, i16, i17, "UTF-8");
                                if (str.startsWith("WLS=")) {
                                    String substring = str.substring(4);
                                    Uri parse = Uri.parse(substring);
                                    i12.e = parse.getQueryParameter("slug");
                                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                    StringBuilder sb2 = new StringBuilder();
                                    fileInputStream = fileInputStream2;
                                    try {
                                        sb2.append(Utilities.MD5(substring));
                                        sb2.append(".wp");
                                        i12.c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
                                        String queryParameter = parse.getQueryParameter("mode");
                                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                            int i19 = 0;
                                            while (true) {
                                                if (i19 >= split.length) {
                                                    break;
                                                }
                                                if ("blur".equals(split[i19])) {
                                                    i12.h = true;
                                                    break;
                                                }
                                                i19++;
                                            }
                                        }
                                        if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                            try {
                                                String queryParameter2 = parse.getQueryParameter("bg_color");
                                                if (!TextUtils.isEmpty(queryParameter2)) {
                                                    i12.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                    if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                        i12.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                    }
                                                    if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                        i12.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                    }
                                                    if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                        i12.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                    }
                                                }
                                            } catch (Exception unused) {
                                            }
                                            try {
                                                String queryParameter3 = parse.getQueryParameter("rotation");
                                                if (!TextUtils.isEmpty(queryParameter3)) {
                                                    i12.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                }
                                            } catch (Exception unused2) {
                                            }
                                            String queryParameter4 = parse.getQueryParameter("intensity");
                                            if (!TextUtils.isEmpty(queryParameter4)) {
                                                i12.y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                            }
                                            if (i12.y == 0) {
                                                i12.y = 50;
                                            }
                                        }
                                        c10 = 65535;
                                        i16 += i18;
                                        i14 += i18;
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
                                        i12.P = i18 + i14;
                                        z10 = true;
                                        break;
                                    }
                                    int indexOf = str.indexOf(61);
                                    c10 = 65535;
                                    if (indexOf != -1 && ((i11 = org.telegram.ui.ActionBar.m5.i(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.y6.ra || i11 == org.telegram.ui.ActionBar.y6.Aa || i11 == org.telegram.ui.ActionBar.y6.Nd || i11 == org.telegram.ui.ActionBar.y6.Od || i11 == org.telegram.ui.ActionBar.y6.Pd || i11 == org.telegram.ui.ActionBar.y6.Qd)) {
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
                                        if (i11 == org.telegram.ui.ActionBar.y6.ra) {
                                            i12.Q = intValue;
                                        } else if (i11 == org.telegram.ui.ActionBar.y6.Aa) {
                                            i12.R = intValue;
                                        } else if (i11 == org.telegram.ui.ActionBar.y6.Nd) {
                                            i12.L = intValue;
                                        } else if (i11 == org.telegram.ui.ActionBar.y6.Od) {
                                            i12.M = intValue;
                                        } else if (i11 == org.telegram.ui.ActionBar.y6.Pd) {
                                            i12.N = intValue;
                                        } else if (i11 == org.telegram.ui.ActionBar.y6.Qd) {
                                            i12.O = intValue;
                                        }
                                    }
                                    i16 += i18;
                                    i14 += i18;
                                }
                            } else {
                                fileInputStream = fileInputStream2;
                                c10 = 65535;
                            }
                            i15++;
                            fileInputStream2 = fileInputStream;
                        }
                        if (z10 || i13 == i14) {
                            break;
                        }
                        fileInputStream.getChannel().position(i14);
                        i13 = i14;
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
            if (i12.c == null || i12.f || new File(i12.c).exists()) {
                i12.T = true;
            } else {
                HashMap hashMap = this.v;
                if (!hashMap.containsKey(i12)) {
                    hashMap.put(i12, i12.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i12.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i12.E).sendRequest(getwallpaper, new org.telegram.ui.z7(15, this, i12));
                }
            }
        }
        yp ypVar = (yp) this.d.get(i10);
        yp ypVar2 = e31Var.G;
        boolean z11 = ypVar2 != null && hg.b.a(ypVar2.a.c, ypVar.a.c) && !org.telegram.ui.ey.y4 && e31Var.V == ypVar.c;
        e31Var.setFocusable(true);
        e31Var.setEnabled(true);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.i5, e31Var, null);
        e31Var.f(ypVar, this.r, z11);
        e31Var.g(i10 == this.f, z11);
        if (i10 == this.f) {
            this.e = new WeakReference(e31Var);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.u6 u6Var = this.c;
        return new wl0(new e31(this.h, this.n, context, u6Var));
    }
}
