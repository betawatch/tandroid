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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ip extends rl0 {
    public final org.telegram.ui.ActionBar.f6 c;
    public ArrayList d;
    public WeakReference e;
    public int f;
    public final int h;
    public final int n;
    public final long r;
    public final HashMap s;
    public final HashMap v;

    public ip(int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this.f = -1;
        this.s = new HashMap();
        this.v = new HashMap();
        this.n = i11;
        this.r = j10;
        this.c = f6Var;
        this.h = i10;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
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
            w11 w11Var = weakReference == null ? null : (w11) weakReference.get();
            if (w11Var != null) {
                w11Var.setSelected(false);
            }
        }
        this.f = i10;
        m(i10);
    }

    @Override // f2.o0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        FileInputStream fileInputStream;
        int s6;
        int intValue;
        String[] split;
        w11 w11Var = (w11) l1Var.a;
        org.telegram.ui.ActionBar.i6 j10 = ((jp) this.d.get(i10)).a.j(((jp) this.d.get(i10)).c);
        if (j10 != null && j10.b != null && !j10.Q && new File(j10.b).exists() && j10.b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(j10.b));
                int i11 = 0;
                boolean z4 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.la.f3);
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
                            byte[] bArr = org.telegram.ui.Cells.la.f3;
                            if (bArr[i13] == 10) {
                                int i15 = i13 - i14;
                                int i16 = i15 + 1;
                                String str = new String(bArr, i14, i15, "UTF-8");
                                if (str.startsWith("WLS=")) {
                                    String substring = str.substring(4);
                                    Uri parse = Uri.parse(substring);
                                    j10.e = parse.getQueryParameter("slug");
                                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                    StringBuilder sb = new StringBuilder();
                                    fileInputStream = fileInputStream2;
                                    try {
                                        sb.append(Utilities.MD5(substring));
                                        sb.append(".wp");
                                        j10.c = new File(filesDirFixed, sb.toString()).getAbsolutePath();
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
                                        j10.M = i16 + i12;
                                        z4 = true;
                                        break;
                                    }
                                    int indexOf = str.indexOf(61);
                                    if (indexOf != -1 && ((s6 = org.telegram.ui.ActionBar.h5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.j6.ra || s6 == org.telegram.ui.ActionBar.j6.Aa || s6 == org.telegram.ui.ActionBar.j6.Nd || s6 == org.telegram.ui.ActionBar.j6.Od || s6 == org.telegram.ui.ActionBar.j6.Pd || s6 == org.telegram.ui.ActionBar.j6.Qd)) {
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
                                        if (s6 == org.telegram.ui.ActionBar.j6.ra) {
                                            j10.N = intValue;
                                        } else if (s6 == org.telegram.ui.ActionBar.j6.Aa) {
                                            j10.O = intValue;
                                        } else if (s6 == org.telegram.ui.ActionBar.j6.Nd) {
                                            j10.I = intValue;
                                        } else if (s6 == org.telegram.ui.ActionBar.j6.Od) {
                                            j10.J = intValue;
                                        } else if (s6 == org.telegram.ui.ActionBar.j6.Pd) {
                                            j10.K = intValue;
                                        } else if (s6 == org.telegram.ui.ActionBar.j6.Qd) {
                                            j10.L = intValue;
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
                        if (z4 || i11 == i12) {
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
                j10.Q = true;
            } else {
                HashMap hashMap = this.v;
                if (!hashMap.containsKey(j10)) {
                    hashMap.put(j10, j10.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = j10.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(j10.B).sendRequest(getwallpaper, new org.telegram.ui.lo(7, this, j10));
                }
            }
        }
        jp jpVar = (jp) this.d.get(i10);
        jp jpVar2 = w11Var.D;
        boolean z10 = jpVar2 != null && sf.b.a(jpVar2.a.c, jpVar.a.c) && !org.telegram.ui.oy.u4 && w11Var.S == jpVar.c;
        w11Var.setFocusable(true);
        w11Var.setEnabled(true);
        w11Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i5, false));
        w11Var.f(jpVar, this.r, z10);
        w11Var.g(i10 == this.f, z10);
        if (i10 == this.f) {
            this.e = new WeakReference(w11Var);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.c;
        return new el0(new w11(this.h, this.n, context, f6Var));
    }

    public ip(int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this(i10, 0L, f6Var, i11);
    }
}
