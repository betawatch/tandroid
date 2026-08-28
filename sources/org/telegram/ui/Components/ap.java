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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ap extends vk0 {
    public final org.telegram.ui.ActionBar.b6 c;
    public ArrayList d;
    public WeakReference e;
    public int f;
    public final int h;
    public final int n;
    public final long r;
    public final HashMap s;
    public final HashMap v;

    public ap(int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        this.f = -1;
        this.s = new HashMap();
        this.v = new HashMap();
        this.n = i10;
        this.r = j10;
        this.c = b6Var;
        this.h = i9;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    public final void E(int i9) {
        int i10 = this.f;
        if (i10 == i9) {
            return;
        }
        if (i10 >= 0) {
            m(i10);
            WeakReference weakReference = this.e;
            a11 a11Var = weakReference == null ? null : (a11) weakReference.get();
            if (a11Var != null) {
                a11Var.setSelected(false);
            }
        }
        this.f = i9;
        m(i9);
    }

    @Override // f2.r0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        FileInputStream fileInputStream;
        int s10;
        int intValue;
        String[] split;
        a11 a11Var = (a11) q1Var.a;
        org.telegram.ui.ActionBar.e6 j10 = ((bp) this.d.get(i9)).a.j(((bp) this.d.get(i9)).c);
        if (j10 != null && j10.b != null && !j10.P && new File(j10.b).exists() && j10.b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(j10.b));
                int i10 = 0;
                boolean z10 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.ma.e3);
                        if (read == -1) {
                            fileInputStream = fileInputStream2;
                            break;
                        }
                        int i11 = i10;
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            if (i12 >= read) {
                                fileInputStream = fileInputStream2;
                                break;
                            }
                            byte[] bArr = org.telegram.ui.Cells.ma.e3;
                            if (bArr[i12] == 10) {
                                int i14 = i12 - i13;
                                int i15 = i14 + 1;
                                String str = new String(bArr, i13, i14, "UTF-8");
                                if (str.startsWith("WLS=")) {
                                    String substring = str.substring(4);
                                    Uri parse = Uri.parse(substring);
                                    j10.e = parse.getQueryParameter("slug");
                                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                    StringBuilder sb2 = new StringBuilder();
                                    fileInputStream = fileInputStream2;
                                    try {
                                        sb2.append(Utilities.MD5(substring));
                                        sb2.append(".wp");
                                        j10.c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
                                        String queryParameter = parse.getQueryParameter("mode");
                                        if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 >= split.length) {
                                                    break;
                                                }
                                                if ("blur".equals(split[i16])) {
                                                    j10.h = true;
                                                    break;
                                                }
                                                i16++;
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
                                        i13 += i15;
                                        i11 += i15;
                                    } catch (Throwable th) {
                                        th = th;
                                        Throwable th2 = th;
                                        try {
                                            fileInputStream.close();
                                            throw th2;
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                            throw th2;
                                        }
                                    }
                                } else {
                                    fileInputStream = fileInputStream2;
                                    if (str.startsWith("WPS")) {
                                        j10.L = i15 + i11;
                                        z10 = true;
                                        break;
                                    }
                                    int indexOf = str.indexOf(61);
                                    if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.e5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.f6.ra || s10 == org.telegram.ui.ActionBar.f6.Aa || s10 == org.telegram.ui.ActionBar.f6.Nd || s10 == org.telegram.ui.ActionBar.f6.Od || s10 == org.telegram.ui.ActionBar.f6.Pd || s10 == org.telegram.ui.ActionBar.f6.Qd)) {
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
                                        if (s10 == org.telegram.ui.ActionBar.f6.ra) {
                                            j10.M = intValue;
                                        } else if (s10 == org.telegram.ui.ActionBar.f6.Aa) {
                                            j10.N = intValue;
                                        } else if (s10 == org.telegram.ui.ActionBar.f6.Nd) {
                                            j10.H = intValue;
                                        } else if (s10 == org.telegram.ui.ActionBar.f6.Od) {
                                            j10.I = intValue;
                                        } else if (s10 == org.telegram.ui.ActionBar.f6.Pd) {
                                            j10.J = intValue;
                                        } else if (s10 == org.telegram.ui.ActionBar.f6.Qd) {
                                            j10.K = intValue;
                                        }
                                    }
                                    i13 += i15;
                                    i11 += i15;
                                }
                            } else {
                                fileInputStream = fileInputStream2;
                            }
                            i12++;
                            fileInputStream2 = fileInputStream;
                        }
                        if (z10 || i10 == i11) {
                            break;
                        }
                        fileInputStream.getChannel().position(i11);
                        i10 = i11;
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th4) {
                        th = th4;
                        fileInputStream = fileInputStream2;
                    }
                }
                fileInputStream.close();
            } catch (Throwable th5) {
                FileLog.e(th5);
            }
            if (j10.c == null || j10.f || new File(j10.c).exists()) {
                j10.P = true;
            } else {
                HashMap hashMap = this.v;
                if (!hashMap.containsKey(j10)) {
                    hashMap.put(j10, j10.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = j10.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(j10.A).sendRequest(getwallpaper, new org.telegram.ui.rc(14, this, j10));
                }
            }
        }
        bp bpVar = (bp) this.d.get(i9);
        bp bpVar2 = a11Var.C;
        boolean z11 = bpVar2 != null && nf.b.a(bpVar2.a.c, bpVar.a.c) && !org.telegram.ui.dy.t4 && a11Var.R == bpVar.c;
        a11Var.setFocusable(true);
        a11Var.setEnabled(true);
        a11Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i5, false));
        a11Var.f(bpVar, this.r, z11);
        a11Var.g(i9 == this.f, z11);
        if (i9 == this.f) {
            this.e = new WeakReference(a11Var);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        return new ik0(new a11(this.h, this.n, context, b6Var));
    }

    public ap(int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        this(i9, 0L, b6Var, i10);
    }
}
