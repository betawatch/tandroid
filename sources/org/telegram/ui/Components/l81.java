package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l81 extends AsyncTask {
    public final String a;
    public final CountDownLatch b = new CountDownLatch(1);
    public final String[] c = new String[2];
    public String d;
    public final /* synthetic */ m81 e;

    public l81(m81 m81Var, String str) {
        this.e = m81Var;
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
        r0 = org.telegram.ui.Components.m81.u0.matcher(r4);
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
    
        r2 = org.telegram.ui.Components.m81.A0.matcher(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02cd, code lost:
    
        if (r2.find() != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02cf, code lost:
    
        r2 = r2.group(r3) + r2.group(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e9, code lost:
    
        r5 = r19;
        r3 = org.telegram.messenger.w0.b.getSharedPreferences("youtubecode", r5);
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
        r0 = org.telegram.ui.Components.m81.c(r24, r0, null, true);
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
    
        r10 = org.telegram.ui.Components.m81.v0.matcher(r0);
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
    
        r6 = new xa.n(r0).q(r8);
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
    
        org.telegram.messenger.f8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x034d, code lost:
    
        r10 = org.telegram.ui.Components.m81.w0.matcher(r0);
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
    
        org.telegram.messenger.i0.g3(new org.telegram.ui.Components.gi0(26, r24, r6 + r8 + "('" + r24.d.substring(3) + "');"));
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
        org.telegram.messenger.f8.g(r0, true);
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
    
        org.telegram.messenger.f8.g(r0, true);
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
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        m81 m81Var = this.e;
        String str2 = "https://www.youtube.com/embed/" + this.a;
        m81Var.getClass();
        HashMap hashMap = null;
        boolean z10 = true;
        String c10 = m81.c(this, str2, null, true);
        if (!isCancelled()) {
            String r10 = a1.g.r(new StringBuilder("video_id="), this.a, "&ps=default&gl=US&hl=en");
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(r10);
                sb2.append("&eurl=");
                sb2.append(URLEncoder.encode("https://youtube.googleapis.com/v/" + this.a, "UTF-8"));
                r10 = sb2.toString();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            if (c10 != null) {
                Matcher matcher = m81.t0.matcher(c10);
                if (matcher.find()) {
                    StringBuilder i15 = sc.e.i(r10, "&sts=");
                    i15.append(c10.substring(matcher.start() + 6, matcher.end()));
                    r10 = i15.toString();
                } else {
                    r10 = sc.e.A(r10, "&sts=");
                }
            }
            this.c[1] = "dash";
            String[] strArr = {"", "&el=leanback", "&el=embedded", "&el=detailpage", "&el=vevo"};
            int i16 = 0;
            String str3 = null;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                int i19 = 2;
                if (i18 >= 5) {
                    i10 = i16;
                    break;
                }
                m81 m81Var2 = this.e;
                String str4 = "https://www.youtube.com/get_video_info?" + r10 + strArr[i18];
                m81Var2.getClass();
                String c11 = m81.c(this, str4, hashMap, z10);
                if (isCancelled()) {
                    return hashMap;
                }
                if (c11 != null) {
                    String[] split = c11.split("&");
                    ?? r16 = hashMap;
                    int i20 = i16;
                    i11 = i20;
                    i12 = i11;
                    String str5 = str3;
                    int i21 = i17;
                    ?? r52 = z10;
                    while (i20 < split.length) {
                        if (split[i20].startsWith("dashmpd")) {
                            String[] split2 = split[i20].split("=");
                            if (split2.length == i19) {
                                try {
                                    this.c[i16] = URLDecoder.decode(split2[r52], "UTF-8");
                                } catch (Exception e7) {
                                    org.telegram.messenger.f8.g(e7, r52);
                                }
                            }
                            i12 = r52;
                            i13 = i16;
                        } else {
                            i13 = i16;
                            if (split[i20].startsWith("url_encoded_fmt_stream_map")) {
                                String[] split3 = split[i20].split("=");
                                if (split3.length == i19) {
                                    try {
                                        String[] split4 = URLDecoder.decode(split3[r52], "UTF-8").split("[&,]");
                                        i14 = r52;
                                        int i22 = i13;
                                        int i23 = i22;
                                        String str6 = null;
                                        while (true) {
                                            try {
                                                if (i22 < split4.length) {
                                                    String[] split5 = split4[i22].split("=");
                                                    String[] strArr2 = split4;
                                                    if (split5[i13].startsWith(TeXSymbolParser.TYPE_ATTR)) {
                                                        if (URLDecoder.decode(split5[i14], "UTF-8").contains("video/mp4")) {
                                                            i23 = i14;
                                                        }
                                                    } else if (split5[i13].startsWith("url")) {
                                                        str6 = URLDecoder.decode(split5[i14], "UTF-8");
                                                    } else if (split5[i13].startsWith("itag")) {
                                                        i23 = i13;
                                                        str6 = null;
                                                    }
                                                    if (i23 != 0 && str6 != null) {
                                                        str5 = str6;
                                                        break;
                                                    }
                                                    i22++;
                                                    split4 = strArr2;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                org.telegram.messenger.f8.g(e, i14);
                                                i20++;
                                                i16 = i13;
                                                r52 = 1;
                                                i19 = 2;
                                                r16 = r16;
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        i14 = r52;
                                    }
                                }
                            } else if (split[i20].startsWith("use_cipher_signature")) {
                                String[] split6 = split[i20].split("=");
                                if (split6.length == 2 && split6[1].toLowerCase().equals("true")) {
                                    i21 = 1;
                                }
                            } else if (split[i20].startsWith("hlsvp")) {
                                String[] split7 = split[i20].split("=");
                                if (split7.length == 2) {
                                    try {
                                        r16 = URLDecoder.decode(split7[1], "UTF-8");
                                    } catch (Exception e12) {
                                        org.telegram.messenger.f8.g(e12, true);
                                    }
                                }
                            } else if (split[i20].startsWith("livestream")) {
                                String[] split8 = split[i20].split("=");
                                if (split8.length == 2 && split8[1].toLowerCase().equals("1")) {
                                    i11 = 1;
                                }
                            }
                        }
                        i20++;
                        i16 = i13;
                        r52 = 1;
                        i19 = 2;
                        r16 = r16;
                    }
                    i10 = i16;
                    i17 = i21;
                    str3 = str5;
                    str = r16;
                } else {
                    i10 = i16;
                    i11 = i10;
                    i12 = i11;
                    str = null;
                }
                if (i11 != 0) {
                    if (str == null || i17 != 0 || str.contains("/s/")) {
                        break;
                    }
                    String[] strArr3 = this.c;
                    strArr3[i10] = str;
                    strArr3[1] = "hls";
                }
                if (i12 != 0) {
                    break;
                }
                i18++;
                i16 = i10;
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
        m81 m81Var = this.e;
        if (str == null) {
            if (isCancelled()) {
                return;
            }
            m81Var.h();
            return;
        }
        if (org.telegram.messenger.v2.a) {
            StringBuilder sb2 = new StringBuilder("start play youtube video ");
            sb2.append(strArr[1]);
            sb2.append(" ");
            a1.g.z(strArr[0], sb2);
        }
        m81Var.x = true;
        m81Var.y = strArr[0];
        String str2 = strArr[1];
        m81Var.D = str2;
        if (str2.equals("hls")) {
            m81Var.H = true;
        }
        if (m81Var.s) {
            m81Var.i();
        }
        m81Var.j(false, true);
        m81Var.f0.d(true, true);
    }
}
