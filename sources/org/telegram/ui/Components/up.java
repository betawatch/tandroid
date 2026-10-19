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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class up extends hm0 {
    public final org.telegram.ui.ActionBar.d6 c;
    public ArrayList d;
    public WeakReference e;
    public final int h;
    public final int n;
    public final long r;
    public int f = -1;
    public final HashMap s = new HashMap();
    public final HashMap v = new HashMap();

    public up(int i10, long j10, org.telegram.ui.on onVar, int i11) {
        this.n = i11;
        this.r = j10;
        this.c = onVar;
        this.h = i10;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
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
            q21 q21Var = weakReference == null ? null : (q21) weakReference.get();
            if (q21Var != null) {
                q21Var.setSelected(false);
            }
        }
        this.f = i10;
        m(i10);
    }

    @Override // s4.g0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        FileInputStream fileInputStream;
        char c10;
        int v;
        int intValue;
        String[] split;
        q21 q21Var = (q21) b1Var.a;
        org.telegram.ui.ActionBar.g6 i11 = ((vp) this.d.get(i10)).a.i(((vp) this.d.get(i10)).c);
        if (i11 != null && i11.b != null && !i11.T && new File(i11.b).exists() && i11.b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(i11.b));
                int i12 = 0;
                boolean z10 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.ma.g3);
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
                            byte[] bArr = org.telegram.ui.Cells.ma.g3;
                            if (bArr[i14] == 10) {
                                int i16 = i14 - i15;
                                int i17 = i16 + 1;
                                String str = new String(bArr, i15, i16, "UTF-8");
                                if (str.startsWith("WLS=")) {
                                    String substring = str.substring(4);
                                    Uri parse = Uri.parse(substring);
                                    i11.e = parse.getQueryParameter("slug");
                                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                    StringBuilder sb2 = new StringBuilder();
                                    fileInputStream = fileInputStream2;
                                    try {
                                        sb2.append(Utilities.MD5(substring));
                                        sb2.append(".wp");
                                        i11.c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
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
                                                    if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                        i11.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                    }
                                                    if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                        i11.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                    }
                                                    if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                        i11.w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                    }
                                                }
                                            } catch (Exception unused) {
                                            }
                                            try {
                                                String queryParameter3 = parse.getQueryParameter("rotation");
                                                if (!TextUtils.isEmpty(queryParameter3)) {
                                                    i11.x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                }
                                            } catch (Exception unused2) {
                                            }
                                            String queryParameter4 = parse.getQueryParameter("intensity");
                                            if (!TextUtils.isEmpty(queryParameter4)) {
                                                i11.y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                            }
                                            if (i11.y == 0) {
                                                i11.y = 50;
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
                                    if (indexOf != -1 && ((v = org.telegram.ui.ActionBar.g5.v(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.h6.ra || v == org.telegram.ui.ActionBar.h6.Aa || v == org.telegram.ui.ActionBar.h6.Nd || v == org.telegram.ui.ActionBar.h6.Od || v == org.telegram.ui.ActionBar.h6.Pd || v == org.telegram.ui.ActionBar.h6.Qd)) {
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
                                        if (v == org.telegram.ui.ActionBar.h6.ra) {
                                            i11.Q = intValue;
                                        } else if (v == org.telegram.ui.ActionBar.h6.Aa) {
                                            i11.R = intValue;
                                        } else if (v == org.telegram.ui.ActionBar.h6.Nd) {
                                            i11.L = intValue;
                                        } else if (v == org.telegram.ui.ActionBar.h6.Od) {
                                            i11.M = intValue;
                                        } else if (v == org.telegram.ui.ActionBar.h6.Pd) {
                                            i11.N = intValue;
                                        } else if (v == org.telegram.ui.ActionBar.h6.Qd) {
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
                FileLog.e(th6);
            }
            if (i11.c == null || i11.f || new File(i11.c).exists()) {
                i11.T = true;
            } else {
                HashMap hashMap = this.v;
                if (!hashMap.containsKey(i11)) {
                    hashMap.put(i11, i11.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i11.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i11.E).sendRequest(getwallpaper, new org.telegram.ui.vc(14, this, i11));
                }
            }
        }
        vp vpVar = (vp) this.d.get(i10);
        vp vpVar2 = q21Var.G;
        boolean z11 = vpVar2 != null && gg.b.a(vpVar2.a.c, vpVar.a.c) && !org.telegram.ui.cy.x4 && q21Var.V == vpVar.c;
        q21Var.setFocusable(true);
        q21Var.setEnabled(true);
        q21Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i5, false));
        q21Var.f(vpVar, this.r, z11);
        q21Var.g(i10 == this.f, z11);
        if (i10 == this.f) {
            this.e = new WeakReference(q21Var);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.c;
        return new sl0(new q21(this.h, this.n, context, d6Var));
    }
}
