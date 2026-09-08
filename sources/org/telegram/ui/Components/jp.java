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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class jp extends kl0 {
    public final org.telegram.ui.ActionBar.f6 c;
    public ArrayList d;
    public WeakReference e;
    public int f;
    public final int h;
    public final int n;
    public final long r;
    public final HashMap s;
    public final HashMap v;

    public jp(int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this.f = -1;
        this.s = new HashMap();
        this.v = new HashMap();
        this.n = i11;
        this.r = j3;
        this.c = f6Var;
        this.h = i10;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
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
            t11 t11Var = weakReference == null ? null : (t11) weakReference.get();
            if (t11Var != null) {
                t11Var.setSelected(false);
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
    public final void v(s4.c1 c1Var, int i10) {
        FileInputStream fileInputStream;
        int s10;
        int intValue;
        String[] split;
        t11 t11Var = (t11) c1Var.a;
        org.telegram.ui.ActionBar.i6 j3 = ((kp) this.d.get(i10)).a.j(((kp) this.d.get(i10)).c);
        if (j3 != null && j3.b != null && !j3.T && new File(j3.b).exists() && j3.b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(j3.b));
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.pa.i3);
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
                            byte[] bArr = org.telegram.ui.Cells.pa.i3;
                            if (bArr[i13] == 10) {
                                int i15 = i13 - i14;
                                int i16 = i15 + 1;
                                String str = new String(bArr, i14, i15, "UTF-8");
                                if (str.startsWith("WLS=")) {
                                    String substring = str.substring(4);
                                    Uri parse = Uri.parse(substring);
                                    j3.e = parse.getQueryParameter("slug");
                                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                    StringBuilder sb2 = new StringBuilder();
                                    fileInputStream = fileInputStream2;
                                    try {
                                        sb2.append(Utilities.MD5(substring));
                                        sb2.append(".wp");
                                        j3.c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
                                        String queryParameter = parse.getQueryParameter("mode");
                                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                            int i17 = 0;
                                            while (true) {
                                                if (i17 >= split.length) {
                                                    break;
                                                }
                                                if ("blur".equals(split[i17])) {
                                                    j3.h = true;
                                                    break;
                                                }
                                                i17++;
                                            }
                                        }
                                        if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                            try {
                                                String queryParameter2 = parse.getQueryParameter("bg_color");
                                                if (!TextUtils.isEmpty(queryParameter2)) {
                                                    j3.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                    if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                        j3.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                    }
                                                    if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                        j3.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                    }
                                                    if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                        j3.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                    }
                                                }
                                            } catch (Exception unused) {
                                            }
                                            try {
                                                String queryParameter3 = parse.getQueryParameter("rotation");
                                                if (!TextUtils.isEmpty(queryParameter3)) {
                                                    j3.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                }
                                            } catch (Exception unused2) {
                                            }
                                            String queryParameter4 = parse.getQueryParameter("intensity");
                                            if (!TextUtils.isEmpty(queryParameter4)) {
                                                j3.y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                            }
                                            if (j3.y == 0) {
                                                j3.y = 50;
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
                                    if (str.startsWith("WPS")) {
                                        j3.P = i16 + i12;
                                        z10 = true;
                                        break;
                                    }
                                    int indexOf = str.indexOf(61);
                                    if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.g5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.j6.ra || s10 == org.telegram.ui.ActionBar.j6.Aa || s10 == org.telegram.ui.ActionBar.j6.Nd || s10 == org.telegram.ui.ActionBar.j6.Od || s10 == org.telegram.ui.ActionBar.j6.Pd || s10 == org.telegram.ui.ActionBar.j6.Qd)) {
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
                                        if (s10 == org.telegram.ui.ActionBar.j6.ra) {
                                            j3.Q = intValue;
                                        } else if (s10 == org.telegram.ui.ActionBar.j6.Aa) {
                                            j3.R = intValue;
                                        } else if (s10 == org.telegram.ui.ActionBar.j6.Nd) {
                                            j3.L = intValue;
                                        } else if (s10 == org.telegram.ui.ActionBar.j6.Od) {
                                            j3.M = intValue;
                                        } else if (s10 == org.telegram.ui.ActionBar.j6.Pd) {
                                            j3.N = intValue;
                                        } else if (s10 == org.telegram.ui.ActionBar.j6.Qd) {
                                            j3.O = intValue;
                                        }
                                    }
                                    i14 += i16;
                                    i12 += i16;
                                }
                            } else {
                                fileInputStream = fileInputStream2;
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
                FileLog.e(th6);
            }
            if (j3.c == null || j3.f || new File(j3.c).exists()) {
                j3.T = true;
            } else {
                HashMap hashMap = this.v;
                if (!hashMap.containsKey(j3)) {
                    hashMap.put(j3, j3.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = j3.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(j3.E).sendRequest(getwallpaper, new org.telegram.ui.ro(7, this, j3));
                }
            }
        }
        kp kpVar = (kp) this.d.get(i10);
        kp kpVar2 = t11Var.G;
        boolean z11 = kpVar2 != null && gg.b.a(kpVar2.a.c, kpVar.a.c) && !org.telegram.ui.uy.x4 && t11Var.V == kpVar.c;
        t11Var.setFocusable(true);
        t11Var.setEnabled(true);
        t11Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i5, false));
        t11Var.f(kpVar, this.r, z11);
        t11Var.g(i10 == this.f, z11);
        if (i10 == this.f) {
            this.e = new WeakReference(t11Var);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        return new vk0(new t11(this.h, this.n, context, f6Var));
    }

    public jp(int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this(i10, 0L, f6Var, i11);
    }
}
