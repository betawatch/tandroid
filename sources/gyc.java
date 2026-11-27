// default package

import android.os.AsyncTask;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gyc extends AsyncTask {
    public static final /* synthetic */ int f = 0;
    public final String a;
    public final CountDownLatch b = new CountDownLatch(1);
    public final String[] c = new String[2];
    public String d;
    public final /* synthetic */ hyc e;

    public gyc(hyc hycVar, String str) {
        this.e = hycVar;
        this.a = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x023e, code lost:
    
        r2 = r24.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0242, code lost:
    
        if (r2[r19] != null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0244, code lost:
    
        if (r10 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0246, code lost:
    
        r2[r19] = r10;
        r2[1] = "other";
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x024e, code lost:
    
        r2 = r2[r19];
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0250, code lost:
    
        if (r2 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0252, code lost:
    
        if (r0 != 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0258, code lost:
    
        if (r2.contains("/s/") == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x025a, code lost:
    
        if (r4 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x025c, code lost:
    
        r0 = r24.c[r19].indexOf("/s/");
        r2 = r24.c[r19].indexOf(47, r0 + 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0271, code lost:
    
        if (r0 == (-1)) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0273, code lost:
    
        if (r2 != (-1)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0275, code lost:
    
        r2 = r24.c[r19].length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x027d, code lost:
    
        r24.d = r24.c[r19].substring(r0, r2);
        r0 = hyc.v0.matcher(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0291, code lost:
    
        if (r0.find() == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02b1, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02b2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02b3, code lost:
    
        if (r0 != null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02b5, code lost:
    
        r2 = hyc.B0.matcher(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02bf, code lost:
    
        if (r2.find() != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c1, code lost:
    
        r2 = r2.group(r3) + r2.group(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02db, code lost:
    
        r5 = r19;
        r3 = org.telegram.messenger.a.b.getSharedPreferences("youtubecode", r5);
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02e8, code lost:
    
        if (r2 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ea, code lost:
    
        r7 = r3.getString(r2, null);
        r8 = r3.getString(r2.concat("n"), null);
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02f9, code lost:
    
        if (r6 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0301, code lost:
    
        if (r0.startsWith("//") != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0303, code lost:
    
        r0 = "https:".concat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0318, code lost:
    
        r24.e.getClass();
        r7 = null;
        r0 = hyc.c(r24, r0, null, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0327, code lost:
    
        if (isCancelled() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0329, code lost:
    
        if (r0 != null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x032b, code lost:
    
        r10 = hyc.w0.matcher(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0335, code lost:
    
        if (r10.find() != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0337, code lost:
    
        r8 = r10.group(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x034c, code lost:
    
        if (r8 != null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x034e, code lost:
    
        r6 = new lyc(r0).r(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x035b, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x035f, code lost:
    
        r3.edit().putString(r2, r6).putString(r2 + "n", r8).commit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x037e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x037f, code lost:
    
        cc4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x033c, code lost:
    
        r10 = hyc.x0.matcher(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0346, code lost:
    
        if (r10.find() != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0348, code lost:
    
        r8 = r10.group(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0389, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03ae, code lost:
    
        hl.c3(new cxc((java.lang.Object) r24, (java.lang.Object) (r6 + r8 + "('" + r24.d.substring(3) + "');"), (byte) 4));
        r24.b.await();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03d1, code lost:
    
        if (isCancelled() == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:?, code lost:
    
        return r24.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03bd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03be, code lost:
    
        r3 = 1;
        cc4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03c9, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03c3, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03d9, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0310, code lost:
    
        if (r0.startsWith("/") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0312, code lost:
    
        r0 = "https://www.youtube.com".concat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0384, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02f8, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02da, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03c5, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0293, code lost:
    
        r0 = new org.json.JSONTokener(r0.group(1)).nextValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02a3, code lost:
    
        if ((r0 instanceof java.lang.String) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02a5, code lost:
    
        r0 = (java.lang.String) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02a9, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02a8, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02ab, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02ac, code lost:
    
        r3 = 1;
        cc4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03c7, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03cb, code lost:
    
        r7 = null;
        r5 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03d3 A[ADDED_TO_REGION] */
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
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        hyc hycVar = this.e;
        String str2 = "https://www.youtube.com/embed/" + this.a;
        hycVar.getClass();
        HashMap hashMap = null;
        boolean z = true;
        String c = hyc.c(this, str2, null, true);
        if (!isCancelled()) {
            String k = c00.k(new StringBuilder("video_id="), this.a, "&ps=default&gl=US&hl=en");
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(k);
                sb.append("&eurl=");
                sb.append(URLEncoder.encode("https://youtube.googleapis.com/v/" + this.a, "UTF-8"));
                k = sb.toString();
            } catch (Exception e) {
                cc4.g(e, true);
            }
            if (c != null) {
                Matcher matcher = hyc.u0.matcher(c);
                if (matcher.find()) {
                    StringBuilder l = c00.l(k, "&sts=");
                    l.append(c.substring(matcher.start() + 6, matcher.end()));
                    k = l.toString();
                } else {
                    k = k.concat("&sts=");
                }
            }
            this.c[1] = "dash";
            String[] strArr = {"", "&el=leanback", "&el=embedded", "&el=detailpage", "&el=vevo"};
            int i6 = 0;
            String str3 = null;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int i9 = 2;
                if (i8 >= 5) {
                    i = i6;
                    break;
                }
                hyc hycVar2 = this.e;
                StringBuilder l2 = c00.l("https://www.youtube.com/get_video_info?", k);
                l2.append(strArr[i8]);
                String sb2 = l2.toString();
                hycVar2.getClass();
                String c2 = hyc.c(this, sb2, hashMap, z);
                if (!isCancelled()) {
                    if (c2 != null) {
                        String[] split = c2.split("&");
                        ?? r16 = hashMap;
                        int i10 = i6;
                        i2 = i10;
                        i3 = i2;
                        String str4 = str3;
                        int i11 = i7;
                        ?? r5 = z;
                        while (i10 < split.length) {
                            if (split[i10].startsWith("dashmpd")) {
                                String[] split2 = split[i10].split("=");
                                if (split2.length == i9) {
                                    try {
                                        this.c[i6] = URLDecoder.decode(split2[r5], "UTF-8");
                                    } catch (Exception e2) {
                                        cc4.g(e2, r5);
                                    }
                                }
                                i3 = r5;
                                i4 = i6;
                            } else {
                                i4 = i6;
                                if (split[i10].startsWith("url_encoded_fmt_stream_map")) {
                                    String[] split3 = split[i10].split("=");
                                    if (split3.length == i9) {
                                        try {
                                            String[] split4 = URLDecoder.decode(split3[r5], "UTF-8").split("[&,]");
                                            i5 = r5;
                                            int i12 = i4;
                                            int i13 = i12;
                                            String str5 = null;
                                            while (true) {
                                                try {
                                                    if (i12 < split4.length) {
                                                        String[] split5 = split4[i12].split("=");
                                                        String[] strArr2 = split4;
                                                        if (split5[i4].startsWith(TeXSymbolParser.TYPE_ATTR)) {
                                                            if (URLDecoder.decode(split5[i5], "UTF-8").contains("video/mp4")) {
                                                                i13 = i5;
                                                            }
                                                        } else if (split5[i4].startsWith("url")) {
                                                            str5 = URLDecoder.decode(split5[i5], "UTF-8");
                                                        } else if (split5[i4].startsWith("itag")) {
                                                            i13 = i4;
                                                            str5 = null;
                                                        }
                                                        if (i13 != 0 && str5 != null) {
                                                            str4 = str5;
                                                            break;
                                                        }
                                                        i12++;
                                                        split4 = strArr2;
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    cc4.g(e, i5);
                                                    i10++;
                                                    i6 = i4;
                                                    r5 = 1;
                                                    i9 = 2;
                                                    r16 = r16;
                                                }
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            i5 = r5;
                                        }
                                    }
                                } else if (split[i10].startsWith("use_cipher_signature")) {
                                    String[] split6 = split[i10].split("=");
                                    if (split6.length == 2 && split6[1].toLowerCase().equals("true")) {
                                        i11 = 1;
                                    }
                                } else if (split[i10].startsWith("hlsvp")) {
                                    String[] split7 = split[i10].split("=");
                                    if (split7.length == 2) {
                                        try {
                                            r16 = URLDecoder.decode(split7[1], "UTF-8");
                                        } catch (Exception e5) {
                                            cc4.g(e5, true);
                                        }
                                    }
                                } else if (split[i10].startsWith("livestream")) {
                                    String[] split8 = split[i10].split("=");
                                    if (split8.length == 2 && split8[1].toLowerCase().equals("1")) {
                                        i2 = 1;
                                    }
                                }
                            }
                            i10++;
                            i6 = i4;
                            r5 = 1;
                            i9 = 2;
                            r16 = r16;
                        }
                        i = i6;
                        i7 = i11;
                        str3 = str4;
                        str = r16;
                    } else {
                        i = i6;
                        i2 = i;
                        i3 = i2;
                        str = null;
                    }
                    if (i2 != 0) {
                        if (str == null || i7 != 0 || str.contains("/s/")) {
                            break;
                        }
                        String[] strArr3 = this.c;
                        strArr3[i] = str;
                        strArr3[1] = "hls";
                    }
                    if (i3 != 0) {
                        break;
                    }
                    i8++;
                    i6 = i;
                    hashMap = null;
                    z = true;
                } else {
                    return hashMap;
                }
            }
        } else {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        hyc hycVar = this.e;
        if (str == null) {
            if (isCancelled()) {
                return;
            }
            hycVar.h();
            return;
        }
        if (f11.a) {
            StringBuilder sb = new StringBuilder("start play youtube video ");
            sb.append(strArr[1]);
            sb.append(" ");
            uh9.s(strArr[0], sb);
        }
        hycVar.x = true;
        hycVar.y = strArr[0];
        String str2 = strArr[1];
        hycVar.E = str2;
        if (str2.equals("hls")) {
            hycVar.I = true;
        }
        if (hycVar.s) {
            hycVar.i();
        }
        hycVar.j(false, true);
        hycVar.g0.d(true, true);
    }
}
