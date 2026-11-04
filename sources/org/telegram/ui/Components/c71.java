package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c71 extends AsyncTask {
    public final String a;
    public final CountDownLatch b = new CountDownLatch(1);
    public final String[] c = new String[2];
    public String d;
    public final /* synthetic */ d71 e;

    public c71(d71 d71Var, String str) {
        this.e = d71Var;
        this.a = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0247, code lost:
    
        r2 = r24.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x024b, code lost:
    
        if (r2[r19] != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x024d, code lost:
    
        if (r10 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x024f, code lost:
    
        r2[r19] = r10;
        r2[1] = "other";
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0257, code lost:
    
        r2 = r2[r19];
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0259, code lost:
    
        if (r2 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x025b, code lost:
    
        if (r0 != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0261, code lost:
    
        if (r2.contains("/s/") == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0267, code lost:
    
        if (r4 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0269, code lost:
    
        r0 = r24.c[r19].indexOf("/s/");
        r2 = r24.c[r19].indexOf(47, r0 + 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x027e, code lost:
    
        if (r0 == (-1)) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0280, code lost:
    
        if (r2 != (-1)) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0282, code lost:
    
        r2 = r24.c[r19].length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x028a, code lost:
    
        r24.d = r24.c[r19].substring(r0, r2);
        r0 = org.telegram.ui.Components.d71.v0.matcher(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x029e, code lost:
    
        if (r0.find() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02bf, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02c0, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02c1, code lost:
    
        if (r0 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02c3, code lost:
    
        r2 = org.telegram.ui.Components.d71.B0.matcher(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02cd, code lost:
    
        if (r2.find() != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02cf, code lost:
    
        r2 = r2.group(r3) + r2.group(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e9, code lost:
    
        r5 = r19;
        r3 = org.telegram.messenger.t0.b.getSharedPreferences("youtubecode", r5);
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f6, code lost:
    
        if (r2 != null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02f8, code lost:
    
        r7 = r3.getString(r2, null);
        r8 = r3.getString(r2.concat("n"), null);
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0307, code lost:
    
        if (r6 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x030f, code lost:
    
        if (r0.startsWith("//") != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0311, code lost:
    
        r0 = "https:".concat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0326, code lost:
    
        r24.e.getClass();
        r7 = null;
        r0 = org.telegram.ui.Components.d71.c(r24, r0, null, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0335, code lost:
    
        if (isCancelled() == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x033a, code lost:
    
        if (r0 != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x033c, code lost:
    
        r10 = org.telegram.ui.Components.d71.w0.matcher(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0346, code lost:
    
        if (r10.find() != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0348, code lost:
    
        r8 = r10.group(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x035d, code lost:
    
        if (r8 != null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x035f, code lost:
    
        r6 = new za.p(r0).l(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x036c, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0370, code lost:
    
        r3.edit().putString(r2, r6).putString(r2 + "n", r8).commit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x038f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0390, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x034d, code lost:
    
        r10 = org.telegram.ui.Components.d71.x0.matcher(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0357, code lost:
    
        if (r10.find() != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0359, code lost:
    
        r8 = r10.group(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x039a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03bf, code lost:
    
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.p11(8, r24, r6 + r8 + "('" + r24.d.substring(3) + "');"));
        r24.b.await();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03e2, code lost:
    
        if (isCancelled() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03ea, code lost:
    
        return r24.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03cf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03d0, code lost:
    
        r3 = 1;
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03db, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03d5, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x031e, code lost:
    
        if (r0.startsWith("/") != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0320, code lost:
    
        r0 = "https://www.youtube.com".concat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0395, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0306, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02e8, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03d7, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02a0, code lost:
    
        r0 = new org.json.JSONTokener(r0.group(1)).nextValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02b0, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02b2, code lost:
    
        r0 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02b9, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02b8, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02b5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02b6, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02bb, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03d9, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0264, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03dd, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r3v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        int i3;
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        d71 d71Var = this.e;
        String str2 = "https://www.youtube.com/embed/" + this.a;
        d71Var.getClass();
        HashMap hashMap = null;
        boolean z10 = true;
        String c2 = d71.c(this, str2, null, true);
        if (!isCancelled()) {
            String s6 = a1.g.s(new StringBuilder("video_id="), this.a, "&ps=default&gl=US&hl=en");
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(s6);
                sb2.append("&eurl=");
                sb2.append(URLEncoder.encode("https://youtube.googleapis.com/v/" + this.a, "UTF-8"));
                s6 = sb2.toString();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (c2 != null) {
                Matcher matcher = d71.u0.matcher(c2);
                if (matcher.find()) {
                    StringBuilder h = t4.c.h(s6, "&sts=");
                    h.append(c2.substring(matcher.start() + 6, matcher.end()));
                    s6 = h.toString();
                } else {
                    s6 = t4.c.q(s6, "&sts=");
                }
            }
            this.c[1] = "dash";
            String[] strArr = {"", "&el=leanback", "&el=embedded", "&el=detailpage", "&el=vevo"};
            int i14 = 0;
            String str3 = null;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int i17 = 2;
                if (i16 >= 5) {
                    i3 = i14;
                    break;
                }
                d71 d71Var2 = this.e;
                String str4 = "https://www.youtube.com/get_video_info?" + s6 + strArr[i16];
                d71Var2.getClass();
                String c10 = d71.c(this, str4, hashMap, z10);
                if (isCancelled()) {
                    return hashMap;
                }
                if (c10 != null) {
                    String[] split = c10.split("&");
                    ?? r16 = hashMap;
                    int i18 = i14;
                    i10 = i18;
                    i11 = i10;
                    String str5 = str3;
                    int i19 = i15;
                    ?? r5 = z10;
                    while (i18 < split.length) {
                        if (split[i18].startsWith("dashmpd")) {
                            String[] split2 = split[i18].split("=");
                            if (split2.length == i17) {
                                try {
                                    this.c[i14] = URLDecoder.decode(split2[r5], "UTF-8");
                                } catch (Exception e11) {
                                    org.telegram.messenger.a8.g(e11, r5);
                                }
                            }
                            i11 = r5;
                            i12 = i14;
                        } else {
                            i12 = i14;
                            if (split[i18].startsWith("url_encoded_fmt_stream_map")) {
                                String[] split3 = split[i18].split("=");
                                if (split3.length == i17) {
                                    try {
                                        String[] split4 = URLDecoder.decode(split3[r5], "UTF-8").split("[&,]");
                                        i13 = r5;
                                        int i20 = i12;
                                        int i21 = i20;
                                        String str6 = null;
                                        while (true) {
                                            try {
                                                if (i20 < split4.length) {
                                                    String[] split5 = split4[i20].split("=");
                                                    String[] strArr2 = split4;
                                                    if (split5[i12].startsWith(TeXSymbolParser.TYPE_ATTR)) {
                                                        if (URLDecoder.decode(split5[i13], "UTF-8").contains("video/mp4")) {
                                                            i21 = i13;
                                                        }
                                                    } else if (split5[i12].startsWith("url")) {
                                                        str6 = URLDecoder.decode(split5[i13], "UTF-8");
                                                    } else if (split5[i12].startsWith("itag")) {
                                                        i21 = i12;
                                                        str6 = null;
                                                    }
                                                    if (i21 != 0 && str6 != null) {
                                                        str5 = str6;
                                                        break;
                                                    }
                                                    i20++;
                                                    split4 = strArr2;
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                org.telegram.messenger.a8.g(e, i13);
                                                i18++;
                                                i14 = i12;
                                                r5 = 1;
                                                i17 = 2;
                                                r16 = r16;
                                            }
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        i13 = r5;
                                    }
                                }
                            } else if (split[i18].startsWith("use_cipher_signature")) {
                                String[] split6 = split[i18].split("=");
                                if (split6.length == 2 && split6[1].toLowerCase().equals("true")) {
                                    i19 = 1;
                                }
                            } else if (split[i18].startsWith("hlsvp")) {
                                String[] split7 = split[i18].split("=");
                                if (split7.length == 2) {
                                    try {
                                        r16 = URLDecoder.decode(split7[1], "UTF-8");
                                    } catch (Exception e14) {
                                        org.telegram.messenger.a8.g(e14, true);
                                    }
                                }
                            } else if (split[i18].startsWith("livestream")) {
                                String[] split8 = split[i18].split("=");
                                if (split8.length == 2 && split8[1].toLowerCase().equals("1")) {
                                    i10 = 1;
                                }
                            }
                        }
                        i18++;
                        i14 = i12;
                        r5 = 1;
                        i17 = 2;
                        r16 = r16;
                    }
                    i3 = i14;
                    i15 = i19;
                    str3 = str5;
                    str = r16;
                } else {
                    i3 = i14;
                    i10 = i3;
                    i11 = i10;
                    str = null;
                }
                if (i10 != 0) {
                    if (str == null || i15 != 0 || str.contains("/s/")) {
                        break;
                    }
                    String[] strArr3 = this.c;
                    strArr3[i3] = str;
                    strArr3[1] = "hls";
                }
                if (i11 != 0) {
                    break;
                }
                i16++;
                i14 = i3;
                hashMap = null;
                z10 = true;
            }
        } else {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        d71 d71Var = this.e;
        if (str == null) {
            if (isCancelled()) {
                return;
            }
            d71Var.h();
            return;
        }
        if (org.telegram.messenger.r2.a) {
            StringBuilder sb2 = new StringBuilder("start play youtube video ");
            sb2.append(strArr[1]);
            sb2.append(" ");
            k2.p1.w(strArr[0], sb2);
        }
        d71Var.x = true;
        d71Var.y = strArr[0];
        String str2 = strArr[1];
        d71Var.E = str2;
        if (str2.equals("hls")) {
            d71Var.I = true;
        }
        if (d71Var.s) {
            d71Var.i();
        }
        d71Var.j(false, true);
        d71Var.g0.d(true, true);
    }
}
