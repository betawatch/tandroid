package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.internal.media.MediaCommon;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
public final class zzaq extends zzd {
    public static final String zzb;
    final zzau zzc;
    final zzau zzd;
    final zzau zze;
    final zzau zzf;
    final zzau zzg;
    final zzau zzh;
    final zzau zzi;
    final zzau zzj;
    final zzau zzk;
    final zzau zzl;
    final zzau zzm;
    final zzau zzn;
    final zzau zzo;
    final zzau zzp;
    final zzau zzq;
    final zzau zzr;
    final zzau zzs;
    final zzau zzt;
    final zzau zzu;
    private long zzv;
    private MediaStatus zzw;
    private Long zzx;
    private zzan zzy;
    private int zzz;

    static {
        int i = CastUtils.$r8$clinit;
        zzb = "urn:x-cast:com.google.cast.media";
    }

    public zzaq(String str) {
        super(zzb, "MediaControlChannel", null);
        this.zzz = -1;
        zzau zzauVar = new zzau(86400000L, "load");
        this.zzc = zzauVar;
        zzau zzauVar2 = new zzau(86400000L, "pause");
        this.zzd = zzauVar2;
        zzau zzauVar3 = new zzau(86400000L, "play");
        this.zze = zzauVar3;
        zzau zzauVar4 = new zzau(86400000L, "stop");
        this.zzf = zzauVar4;
        zzau zzauVar5 = new zzau(10000L, "seek");
        this.zzg = zzauVar5;
        zzau zzauVar6 = new zzau(86400000L, "volume");
        this.zzh = zzauVar6;
        zzau zzauVar7 = new zzau(86400000L, "mute");
        this.zzi = zzauVar7;
        zzau zzauVar8 = new zzau(86400000L, "status");
        this.zzj = zzauVar8;
        zzau zzauVar9 = new zzau(86400000L, "activeTracks");
        this.zzk = zzauVar9;
        zzau zzauVar10 = new zzau(86400000L, "trackStyle");
        this.zzl = zzauVar10;
        zzau zzauVar11 = new zzau(86400000L, "queueInsert");
        this.zzm = zzauVar11;
        zzau zzauVar12 = new zzau(86400000L, "queueUpdate");
        this.zzn = zzauVar12;
        zzau zzauVar13 = new zzau(86400000L, "queueRemove");
        this.zzo = zzauVar13;
        zzau zzauVar14 = new zzau(86400000L, "queueReorder");
        this.zzp = zzauVar14;
        zzau zzauVar15 = new zzau(86400000L, "queueFetchItemIds");
        this.zzq = zzauVar15;
        zzau zzauVar16 = new zzau(86400000L, "queueFetchItemRange");
        this.zzs = zzauVar16;
        this.zzr = new zzau(86400000L, "queueFetchItems");
        zzau zzauVar17 = new zzau(86400000L, "setPlaybackRate");
        this.zzt = zzauVar17;
        zzau zzauVar18 = new zzau(86400000L, "skipAd");
        this.zzu = zzauVar18;
        zzc(zzauVar);
        zzc(zzauVar2);
        zzc(zzauVar3);
        zzc(zzauVar4);
        zzc(zzauVar5);
        zzc(zzauVar6);
        zzc(zzauVar7);
        zzc(zzauVar8);
        zzc(zzauVar9);
        zzc(zzauVar10);
        zzc(zzauVar11);
        zzc(zzauVar12);
        zzc(zzauVar13);
        zzc(zzauVar14);
        zzc(zzauVar15);
        zzc(zzauVar16);
        zzc(zzauVar16);
        zzc(zzauVar17);
        zzc(zzauVar18);
        zzT();
    }

    private final long zzR(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzv;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (elapsedRealtime * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 >= 0) {
            return j3;
        }
        return 0L;
    }

    private static zzap zzS(JSONObject jSONObject) {
        MediaError zza = MediaError.zza(jSONObject);
        zzap zzapVar = new zzap();
        int i = CastUtils.$r8$clinit;
        zzapVar.zza = jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null;
        zzapVar.zzb = zza;
        return zzapVar;
    }

    private final void zzT() {
        this.zzv = 0L;
        this.zzw = null;
        Iterator it = zza().iterator();
        while (it.hasNext()) {
            ((zzau) it.next()).zzc(2002);
        }
    }

    private final void zzU(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.zzz = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.zza.w(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    private final void zzV() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzc();
        }
    }

    private final void zzW() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzd();
        }
    }

    private final void zzX() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzk();
        }
    }

    private final void zzY() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzm();
        }
    }

    private final boolean zzZ() {
        return this.zzz != -1;
    }

    private static int[] zzaa(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public final long zzB(zzas zzasVar) {
        JSONObject jSONObject = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject.put("requestId", zzd);
            jSONObject.put(TeXSymbolParser.TYPE_ATTR, "GET_STATUS");
            MediaStatus mediaStatus = this.zzw;
            if (mediaStatus != null) {
                jSONObject.put("mediaSessionId", mediaStatus.zzb());
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), zzd, null);
        this.zzj.zzb(zzd, zzasVar);
        return zzd;
    }

    public final long zzC(zzas zzasVar, MediaSeekOptions mediaSeekOptions) {
        JSONObject jSONObject = new JSONObject();
        long zzd = zzd();
        long position = mediaSeekOptions.isSeekToInfinite() ? 4294967296000L : mediaSeekOptions.getPosition();
        try {
            jSONObject.put("requestId", zzd);
            jSONObject.put(TeXSymbolParser.TYPE_ATTR, "SEEK");
            jSONObject.put("mediaSessionId", zzn());
            jSONObject.put("currentTime", CastUtils.millisecToSec(position));
            if (mediaSeekOptions.getResumeState() == 1) {
                jSONObject.put("resumeState", "PLAYBACK_START");
            } else if (mediaSeekOptions.getResumeState() == 2) {
                jSONObject.put("resumeState", "PLAYBACK_PAUSE");
            }
            if (mediaSeekOptions.getCustomData() != null) {
                jSONObject.put("customData", mediaSeekOptions.getCustomData());
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), zzd, null);
        this.zzx = Long.valueOf(position);
        this.zzg.zzb(zzd, new zzal(this, zzasVar));
        return zzd;
    }

    public final long zzE(zzas zzasVar, double d, JSONObject jSONObject) {
        if (this.zzw == null) {
            throw new zzao();
        }
        JSONObject jSONObject2 = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject2.put("requestId", zzd);
            jSONObject2.put(TeXSymbolParser.TYPE_ATTR, "SET_PLAYBACK_RATE");
            jSONObject2.put("playbackRate", d);
            Preconditions.checkNotNull(this.zzw, "mediaStatus should not be null");
            jSONObject2.put("mediaSessionId", this.zzw.zzb());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), zzd, null);
        this.zzt.zzb(zzd, zzasVar);
        return zzd;
    }

    public final long zzG(zzas zzasVar, double d, JSONObject jSONObject) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        JSONObject jSONObject2 = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject2.put("requestId", zzd);
            jSONObject2.put(TeXSymbolParser.TYPE_ATTR, "SET_VOLUME");
            jSONObject2.put("mediaSessionId", zzn());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("level", d);
            jSONObject2.put("volume", jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), zzd, null);
        this.zzh.zzb(zzd, zzasVar);
        return zzd;
    }

    public final MediaInfo zzK() {
        MediaStatus mediaStatus = this.zzw;
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.getMediaInfo();
    }

    public final MediaStatus zzL() {
        return this.zzw;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x025e A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:11:0x0094, B:13:0x00a0, B:14:0x00ad, B:16:0x00b3, B:18:0x00c7, B:22:0x00cd, B:24:0x00d9, B:26:0x00ed, B:35:0x0128, B:37:0x013d, B:39:0x0159, B:42:0x015f, B:44:0x0165, B:46:0x016b, B:60:0x0171, B:62:0x017d, B:64:0x0187, B:68:0x018d, B:69:0x0195, B:71:0x019b, B:73:0x01ab, B:77:0x01b1, B:79:0x01bb, B:80:0x01cc, B:82:0x01d2, B:85:0x01e2, B:87:0x01ee, B:89:0x01fa, B:90:0x020b, B:92:0x0211, B:95:0x0221, B:97:0x022d, B:99:0x023f, B:104:0x025e, B:107:0x0263, B:108:0x0277, B:110:0x027b, B:111:0x0287, B:113:0x028b, B:114:0x0294, B:116:0x0298, B:117:0x029e, B:119:0x02a2, B:120:0x02a5, B:122:0x02aa, B:123:0x02ad, B:125:0x02b1, B:126:0x02b4, B:128:0x02b8, B:130:0x02c2, B:131:0x02c5, B:133:0x02c9, B:134:0x02e1, B:135:0x02e9, B:137:0x02ef, B:140:0x0268, B:141:0x024a, B:143:0x0252, B:147:0x02d3), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027b A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:11:0x0094, B:13:0x00a0, B:14:0x00ad, B:16:0x00b3, B:18:0x00c7, B:22:0x00cd, B:24:0x00d9, B:26:0x00ed, B:35:0x0128, B:37:0x013d, B:39:0x0159, B:42:0x015f, B:44:0x0165, B:46:0x016b, B:60:0x0171, B:62:0x017d, B:64:0x0187, B:68:0x018d, B:69:0x0195, B:71:0x019b, B:73:0x01ab, B:77:0x01b1, B:79:0x01bb, B:80:0x01cc, B:82:0x01d2, B:85:0x01e2, B:87:0x01ee, B:89:0x01fa, B:90:0x020b, B:92:0x0211, B:95:0x0221, B:97:0x022d, B:99:0x023f, B:104:0x025e, B:107:0x0263, B:108:0x0277, B:110:0x027b, B:111:0x0287, B:113:0x028b, B:114:0x0294, B:116:0x0298, B:117:0x029e, B:119:0x02a2, B:120:0x02a5, B:122:0x02aa, B:123:0x02ad, B:125:0x02b1, B:126:0x02b4, B:128:0x02b8, B:130:0x02c2, B:131:0x02c5, B:133:0x02c9, B:134:0x02e1, B:135:0x02e9, B:137:0x02ef, B:140:0x0268, B:141:0x024a, B:143:0x0252, B:147:0x02d3), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028b A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:11:0x0094, B:13:0x00a0, B:14:0x00ad, B:16:0x00b3, B:18:0x00c7, B:22:0x00cd, B:24:0x00d9, B:26:0x00ed, B:35:0x0128, B:37:0x013d, B:39:0x0159, B:42:0x015f, B:44:0x0165, B:46:0x016b, B:60:0x0171, B:62:0x017d, B:64:0x0187, B:68:0x018d, B:69:0x0195, B:71:0x019b, B:73:0x01ab, B:77:0x01b1, B:79:0x01bb, B:80:0x01cc, B:82:0x01d2, B:85:0x01e2, B:87:0x01ee, B:89:0x01fa, B:90:0x020b, B:92:0x0211, B:95:0x0221, B:97:0x022d, B:99:0x023f, B:104:0x025e, B:107:0x0263, B:108:0x0277, B:110:0x027b, B:111:0x0287, B:113:0x028b, B:114:0x0294, B:116:0x0298, B:117:0x029e, B:119:0x02a2, B:120:0x02a5, B:122:0x02aa, B:123:0x02ad, B:125:0x02b1, B:126:0x02b4, B:128:0x02b8, B:130:0x02c2, B:131:0x02c5, B:133:0x02c9, B:134:0x02e1, B:135:0x02e9, B:137:0x02ef, B:140:0x0268, B:141:0x024a, B:143:0x0252, B:147:0x02d3), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0298 A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:11:0x0094, B:13:0x00a0, B:14:0x00ad, B:16:0x00b3, B:18:0x00c7, B:22:0x00cd, B:24:0x00d9, B:26:0x00ed, B:35:0x0128, B:37:0x013d, B:39:0x0159, B:42:0x015f, B:44:0x0165, B:46:0x016b, B:60:0x0171, B:62:0x017d, B:64:0x0187, B:68:0x018d, B:69:0x0195, B:71:0x019b, B:73:0x01ab, B:77:0x01b1, B:79:0x01bb, B:80:0x01cc, B:82:0x01d2, B:85:0x01e2, B:87:0x01ee, B:89:0x01fa, B:90:0x020b, B:92:0x0211, B:95:0x0221, B:97:0x022d, B:99:0x023f, B:104:0x025e, B:107:0x0263, B:108:0x0277, B:110:0x027b, B:111:0x0287, B:113:0x028b, B:114:0x0294, B:116:0x0298, B:117:0x029e, B:119:0x02a2, B:120:0x02a5, B:122:0x02aa, B:123:0x02ad, B:125:0x02b1, B:126:0x02b4, B:128:0x02b8, B:130:0x02c2, B:131:0x02c5, B:133:0x02c9, B:134:0x02e1, B:135:0x02e9, B:137:0x02ef, B:140:0x0268, B:141:0x024a, B:143:0x0252, B:147:0x02d3), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a2 A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:11:0x0094, B:13:0x00a0, B:14:0x00ad, B:16:0x00b3, B:18:0x00c7, B:22:0x00cd, B:24:0x00d9, B:26:0x00ed, B:35:0x0128, B:37:0x013d, B:39:0x0159, B:42:0x015f, B:44:0x0165, B:46:0x016b, B:60:0x0171, B:62:0x017d, B:64:0x0187, B:68:0x018d, B:69:0x0195, B:71:0x019b, B:73:0x01ab, B:77:0x01b1, B:79:0x01bb, B:80:0x01cc, B:82:0x01d2, B:85:0x01e2, B:87:0x01ee, B:89:0x01fa, B:90:0x020b, B:92:0x0211, B:95:0x0221, B:97:0x022d, B:99:0x023f, B:104:0x025e, B:107:0x0263, B:108:0x0277, B:110:0x027b, B:111:0x0287, B:113:0x028b, B:114:0x0294, B:116:0x0298, B:117:0x029e, B:119:0x02a2, B:120:0x02a5, B:122:0x02aa, B:123:0x02ad, B:125:0x02b1, B:126:0x02b4, B:128:0x02b8, B:130:0x02c2, B:131:0x02c5, B:133:0x02c9, B:134:0x02e1, B:135:0x02e9, B:137:0x02ef, B:140:0x0268, B:141:0x024a, B:143:0x0252, B:147:0x02d3), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02aa A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:11:0x0094, B:13:0x00a0, B:14:0x00ad, B:16:0x00b3, B:18:0x00c7, B:22:0x00cd, B:24:0x00d9, B:26:0x00ed, B:35:0x0128, B:37:0x013d, B:39:0x0159, B:42:0x015f, B:44:0x0165, B:46:0x016b, B:60:0x0171, B:62:0x017d, B:64:0x0187, B:68:0x018d, B:69:0x0195, B:71:0x019b, B:73:0x01ab, B:77:0x01b1, B:79:0x01bb, B:80:0x01cc, B:82:0x01d2, B:85:0x01e2, B:87:0x01ee, B:89:0x01fa, B:90:0x020b, B:92:0x0211, B:95:0x0221, B:97:0x022d, B:99:0x023f, B:104:0x025e, B:107:0x0263, B:108:0x0277, B:110:0x027b, B:111:0x0287, B:113:0x028b, B:114:0x0294, B:116:0x0298, B:117:0x029e, B:119:0x02a2, B:120:0x02a5, B:122:0x02aa, B:123:0x02ad, B:125:0x02b1, B:126:0x02b4, B:128:0x02b8, B:130:0x02c2, B:131:0x02c5, B:133:0x02c9, B:134:0x02e1, B:135:0x02e9, B:137:0x02ef, B:140:0x0268, B:141:0x024a, B:143:0x0252, B:147:0x02d3), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b1 A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:11:0x0094, B:13:0x00a0, B:14:0x00ad, B:16:0x00b3, B:18:0x00c7, B:22:0x00cd, B:24:0x00d9, B:26:0x00ed, B:35:0x0128, B:37:0x013d, B:39:0x0159, B:42:0x015f, B:44:0x0165, B:46:0x016b, B:60:0x0171, B:62:0x017d, B:64:0x0187, B:68:0x018d, B:69:0x0195, B:71:0x019b, B:73:0x01ab, B:77:0x01b1, B:79:0x01bb, B:80:0x01cc, B:82:0x01d2, B:85:0x01e2, B:87:0x01ee, B:89:0x01fa, B:90:0x020b, B:92:0x0211, B:95:0x0221, B:97:0x022d, B:99:0x023f, B:104:0x025e, B:107:0x0263, B:108:0x0277, B:110:0x027b, B:111:0x0287, B:113:0x028b, B:114:0x0294, B:116:0x0298, B:117:0x029e, B:119:0x02a2, B:120:0x02a5, B:122:0x02aa, B:123:0x02ad, B:125:0x02b1, B:126:0x02b4, B:128:0x02b8, B:130:0x02c2, B:131:0x02c5, B:133:0x02c9, B:134:0x02e1, B:135:0x02e9, B:137:0x02ef, B:140:0x0268, B:141:0x024a, B:143:0x0252, B:147:0x02d3), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b8 A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:11:0x0094, B:13:0x00a0, B:14:0x00ad, B:16:0x00b3, B:18:0x00c7, B:22:0x00cd, B:24:0x00d9, B:26:0x00ed, B:35:0x0128, B:37:0x013d, B:39:0x0159, B:42:0x015f, B:44:0x0165, B:46:0x016b, B:60:0x0171, B:62:0x017d, B:64:0x0187, B:68:0x018d, B:69:0x0195, B:71:0x019b, B:73:0x01ab, B:77:0x01b1, B:79:0x01bb, B:80:0x01cc, B:82:0x01d2, B:85:0x01e2, B:87:0x01ee, B:89:0x01fa, B:90:0x020b, B:92:0x0211, B:95:0x0221, B:97:0x022d, B:99:0x023f, B:104:0x025e, B:107:0x0263, B:108:0x0277, B:110:0x027b, B:111:0x0287, B:113:0x028b, B:114:0x0294, B:116:0x0298, B:117:0x029e, B:119:0x02a2, B:120:0x02a5, B:122:0x02aa, B:123:0x02ad, B:125:0x02b1, B:126:0x02b4, B:128:0x02b8, B:130:0x02c2, B:131:0x02c5, B:133:0x02c9, B:134:0x02e1, B:135:0x02e9, B:137:0x02ef, B:140:0x0268, B:141:0x024a, B:143:0x0252, B:147:0x02d3), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c9 A[Catch: JSONException -> 0x00c4, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:3:0x0014, B:11:0x0094, B:13:0x00a0, B:14:0x00ad, B:16:0x00b3, B:18:0x00c7, B:22:0x00cd, B:24:0x00d9, B:26:0x00ed, B:35:0x0128, B:37:0x013d, B:39:0x0159, B:42:0x015f, B:44:0x0165, B:46:0x016b, B:60:0x0171, B:62:0x017d, B:64:0x0187, B:68:0x018d, B:69:0x0195, B:71:0x019b, B:73:0x01ab, B:77:0x01b1, B:79:0x01bb, B:80:0x01cc, B:82:0x01d2, B:85:0x01e2, B:87:0x01ee, B:89:0x01fa, B:90:0x020b, B:92:0x0211, B:95:0x0221, B:97:0x022d, B:99:0x023f, B:104:0x025e, B:107:0x0263, B:108:0x0277, B:110:0x027b, B:111:0x0287, B:113:0x028b, B:114:0x0294, B:116:0x0298, B:117:0x029e, B:119:0x02a2, B:120:0x02a5, B:122:0x02aa, B:123:0x02ad, B:125:0x02b1, B:126:0x02b4, B:128:0x02b8, B:130:0x02c2, B:131:0x02c5, B:133:0x02c9, B:134:0x02e1, B:135:0x02e9, B:137:0x02ef, B:140:0x0268, B:141:0x024a, B:143:0x0252, B:147:0x02d3), top: B:2:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzO(String str) {
        char c;
        int i;
        int i2;
        MediaStatus mediaStatus;
        int[] zzaa;
        char c2;
        this.zza.d("message received: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(TeXSymbolParser.TYPE_ATTR);
            long optLong = jSONObject.optLong("requestId", -1L);
            switch (string.hashCode()) {
                case -1830647528:
                    if (string.equals("LOAD_CANCELLED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1790231854:
                    if (string.equals("QUEUE_ITEMS")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1125000185:
                    if (string.equals("INVALID_REQUEST")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -262628938:
                    if (string.equals("LOAD_FAILED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 66247144:
                    if (string.equals("ERROR")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 154411710:
                    if (string.equals("QUEUE_CHANGE")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 431600379:
                    if (string.equals("INVALID_PLAYER_STATE")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 823510221:
                    if (string.equals("MEDIA_STATUS")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2107149050:
                    if (string.equals("QUEUE_ITEM_IDS")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    JSONArray jSONArray = jSONObject.getJSONArray("status");
                    if (jSONArray.length() > 0) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                        boolean zze = this.zzc.zze(optLong);
                        if (this.zzh.zzf()) {
                            if (this.zzh.zze(optLong)) {
                            }
                            i = 1;
                            if (!zze && (mediaStatus = this.zzw) != null) {
                                i2 = mediaStatus.zza(jSONObject2, i);
                                if ((i2 & 1) != 0) {
                                    this.zzv = SystemClock.elapsedRealtime();
                                    this.zzz = -1;
                                    zzY();
                                }
                                if ((i2 & 2) != 0) {
                                    this.zzv = SystemClock.elapsedRealtime();
                                    zzY();
                                }
                                if ((i2 & 128) != 0) {
                                    this.zzv = SystemClock.elapsedRealtime();
                                }
                                if ((4 & i2) != 0) {
                                    zzV();
                                }
                                if ((8 & i2) != 0) {
                                    zzX();
                                }
                                if ((i2 & 16) != 0) {
                                    zzW();
                                }
                                if ((i2 & 32) != 0) {
                                    this.zzv = SystemClock.elapsedRealtime();
                                    zzan zzanVar = this.zzy;
                                    if (zzanVar != null) {
                                        zzanVar.zza();
                                    }
                                }
                                if ((i2 & 64) != 0) {
                                    this.zzv = SystemClock.elapsedRealtime();
                                    zzY();
                                }
                            }
                            this.zzw = new MediaStatus(jSONObject2);
                            this.zzv = SystemClock.elapsedRealtime();
                            i2 = NotificationCenter.needDeleteBusinessLink;
                            if ((i2 & 1) != 0) {
                            }
                            if ((i2 & 2) != 0) {
                            }
                            if ((i2 & 128) != 0) {
                            }
                            if ((4 & i2) != 0) {
                            }
                            if ((8 & i2) != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if ((i2 & 64) != 0) {
                            }
                        }
                        if (!this.zzi.zzf() || this.zzi.zze(optLong)) {
                            i = 0;
                            if (!zze) {
                                i2 = mediaStatus.zza(jSONObject2, i);
                                if ((i2 & 1) != 0) {
                                }
                                if ((i2 & 2) != 0) {
                                }
                                if ((i2 & 128) != 0) {
                                }
                                if ((4 & i2) != 0) {
                                }
                                if ((8 & i2) != 0) {
                                }
                                if ((i2 & 16) != 0) {
                                }
                                if ((i2 & 32) != 0) {
                                }
                                if ((i2 & 64) != 0) {
                                }
                            }
                            this.zzw = new MediaStatus(jSONObject2);
                            this.zzv = SystemClock.elapsedRealtime();
                            i2 = NotificationCenter.needDeleteBusinessLink;
                            if ((i2 & 1) != 0) {
                            }
                            if ((i2 & 2) != 0) {
                            }
                            if ((i2 & 128) != 0) {
                            }
                            if ((4 & i2) != 0) {
                            }
                            if ((8 & i2) != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if ((i2 & 64) != 0) {
                            }
                        } else {
                            i = 1;
                            if (!zze) {
                            }
                            this.zzw = new MediaStatus(jSONObject2);
                            this.zzv = SystemClock.elapsedRealtime();
                            i2 = NotificationCenter.needDeleteBusinessLink;
                            if ((i2 & 1) != 0) {
                            }
                            if ((i2 & 2) != 0) {
                            }
                            if ((i2 & 128) != 0) {
                            }
                            if ((4 & i2) != 0) {
                            }
                            if ((8 & i2) != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if ((i2 & 64) != 0) {
                            }
                        }
                    } else {
                        this.zzw = null;
                        zzY();
                        zzV();
                        zzX();
                        zzW();
                    }
                    Iterator it = zza().iterator();
                    while (it.hasNext()) {
                        ((zzau) it.next()).zzd(optLong, 0, null);
                    }
                    break;
                case 1:
                    this.zza.w("received unexpected error: Invalid Player State.", new Object[0]);
                    Iterator it2 = zza().iterator();
                    while (it2.hasNext()) {
                        ((zzau) it2.next()).zzd(optLong, 2100, zzS(jSONObject));
                    }
                    break;
                case 2:
                    this.zzc.zzd(optLong, 2100, zzS(jSONObject));
                    break;
                case 3:
                    this.zzc.zzd(optLong, 2101, zzS(jSONObject));
                    break;
                case 4:
                    this.zza.w("received unexpected error: Invalid Request.", new Object[0]);
                    Iterator it3 = zza().iterator();
                    while (it3.hasNext()) {
                        ((zzau) it3.next()).zzd(optLong, 2001, zzS(jSONObject));
                    }
                    break;
                case 5:
                    Iterator it4 = zza().iterator();
                    while (it4.hasNext()) {
                        ((zzau) it4.next()).zzd(optLong, 2100, zzS(jSONObject));
                    }
                    if (this.zzy == null) {
                        break;
                    } else {
                        this.zzy.zzb(MediaError.zza(jSONObject));
                        break;
                    }
                case 6:
                    this.zzq.zzd(optLong, 0, null);
                    zzU(jSONObject, "QUEUE_ITEM_IDS");
                    if (this.zzy != null && (zzaa = zzaa(jSONObject.getJSONArray("itemIds"))) != null) {
                        this.zzy.zze(zzaa);
                        break;
                    }
                    break;
                case 7:
                    this.zzs.zzd(optLong, 0, null);
                    zzU(jSONObject, "QUEUE_CHANGE");
                    if (this.zzy != null) {
                        String string2 = jSONObject.getString("changeType");
                        int[] zzaa2 = zzaa(jSONObject.getJSONArray("itemIds"));
                        int optInt = jSONObject.optInt("insertBefore", 0);
                        if (zzaa2 != null) {
                            switch (string2.hashCode()) {
                                case -2130463047:
                                    if (string2.equals("INSERT")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1881281404:
                                    if (string2.equals("REMOVE")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1785516855:
                                    if (string2.equals("UPDATE")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 1122976047:
                                    if (string2.equals("ITEMS_CHANGE")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                this.zzy.zzf(zzaa2, optInt);
                                break;
                            } else if (c2 == 1) {
                                this.zzy.zzj(zzaa2);
                                break;
                            } else if (c2 == 2) {
                                this.zzy.zzh(zzaa2);
                                break;
                            } else if (c2 == 3) {
                                int[] zzaa3 = zzaa(jSONObject.getJSONArray("itemIds"));
                                Preconditions.checkNotNull(zzaa3, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                JSONArray optJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                if (optJSONArray != null) {
                                    this.zzy.zzi(CastUtils.zzd(zzaa3), CastUtils.zzd((int[]) Preconditions.checkNotNull(zzaa(optJSONArray))), jSONObject.optInt("insertBefore", 0));
                                    break;
                                } else {
                                    this.zzy.zze(zzaa3);
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case '\b':
                    this.zzr.zzd(optLong, 0, null);
                    zzU(jSONObject, "QUEUE_ITEMS");
                    if (this.zzy != null) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("items");
                        MediaQueueItem[] mediaQueueItemArr = new MediaQueueItem[jSONArray2.length()];
                        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                            mediaQueueItemArr[i3] = new MediaQueueItem.Builder(jSONArray2.getJSONObject(i3)).build();
                        }
                        this.zzy.zzg(mediaQueueItemArr);
                        break;
                    }
                    break;
            }
        } catch (JSONException e) {
            this.zza.w("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
        }
    }

    public final void zzP(long j, int i) {
        Iterator it = zza().iterator();
        while (it.hasNext()) {
            ((zzau) it.next()).zzd(j, i, null);
        }
    }

    public final void zzQ(zzan zzanVar) {
        this.zzy = zzanVar;
    }

    @Override // com.google.android.gms.cast.internal.zzp
    public final void zzf() {
        zzb();
        zzT();
    }

    public final long zzk() {
        MediaLiveSeekableRange liveSeekableRange;
        MediaStatus mediaStatus = this.zzw;
        if (mediaStatus == null || (liveSeekableRange = mediaStatus.getLiveSeekableRange()) == null) {
            return 0L;
        }
        long endTime = liveSeekableRange.getEndTime();
        return !liveSeekableRange.isLiveDone() ? zzR(1.0d, endTime, -1L) : endTime;
    }

    public final long zzm() {
        MediaStatus mediaStatus;
        MediaInfo zzK = zzK();
        if (zzK == null || (mediaStatus = this.zzw) == null) {
            return 0L;
        }
        Long l = this.zzx;
        if (l == null) {
            if (this.zzv == 0) {
                return 0L;
            }
            double playbackRate = mediaStatus.getPlaybackRate();
            long streamPosition = mediaStatus.getStreamPosition();
            return (playbackRate == 0.0d || mediaStatus.getPlayerState() != 2) ? streamPosition : zzR(playbackRate, streamPosition, zzK.getStreamDuration());
        }
        if (l.equals(4294967296000L)) {
            if (this.zzw.getLiveSeekableRange() != null) {
                return Math.min(l.longValue(), zzk());
            }
            if (zzo() >= 0) {
                return Math.min(l.longValue(), zzo());
            }
        }
        return l.longValue();
    }

    public final long zzn() {
        MediaStatus mediaStatus = this.zzw;
        if (mediaStatus != null) {
            return mediaStatus.zzb();
        }
        throw new zzao();
    }

    public final long zzo() {
        MediaInfo zzK = zzK();
        if (zzK != null) {
            return zzK.getStreamDuration();
        }
        return 0L;
    }

    public final long zzp(zzas zzasVar, MediaLoadRequestData mediaLoadRequestData) {
        if (mediaLoadRequestData.getMediaInfo() == null && mediaLoadRequestData.getQueueData() == null) {
            throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
        }
        JSONObject json = mediaLoadRequestData.toJson();
        if (json == null) {
            throw new IllegalArgumentException("Failed to jsonify the load request due to malformed request");
        }
        long zzd = zzd();
        try {
            json.put("requestId", zzd);
            json.put(TeXSymbolParser.TYPE_ATTR, "LOAD");
        } catch (JSONException unused) {
        }
        zzg(json.toString(), zzd, null);
        this.zzc.zzb(zzd, zzasVar);
        return zzd;
    }

    public final long zzq(zzas zzasVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject2.put("requestId", zzd);
            jSONObject2.put(TeXSymbolParser.TYPE_ATTR, "PAUSE");
            jSONObject2.put("mediaSessionId", zzn());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), zzd, null);
        this.zzd.zzb(zzd, zzasVar);
        return zzd;
    }

    public final long zzr(zzas zzasVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject2.put("requestId", zzd);
            jSONObject2.put(TeXSymbolParser.TYPE_ATTR, "PLAY");
            jSONObject2.put("mediaSessionId", zzn());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), zzd, null);
        this.zze.zzb(zzd, zzasVar);
        return zzd;
    }

    public final long zzu(zzas zzasVar) {
        JSONObject jSONObject = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject.put("requestId", zzd);
            jSONObject.put(TeXSymbolParser.TYPE_ATTR, "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", zzn());
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), zzd, null);
        this.zzq.zzb(zzd, zzasVar);
        return zzd;
    }

    public final long zzv(zzas zzasVar, int[] iArr) {
        JSONObject jSONObject = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject.put("requestId", zzd);
            jSONObject.put(TeXSymbolParser.TYPE_ATTR, "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", zzn());
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                jSONArray.put(i);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), zzd, null);
        this.zzr.zzb(zzd, zzasVar);
        return zzd;
    }

    public final long zzA(zzas zzasVar, int i, long j, MediaQueueItem[] mediaQueueItemArr, int i2, Boolean bool, Integer num, JSONObject jSONObject) {
        if (j != -1 && j < 0) {
            throw new IllegalArgumentException("playPosition cannot be negative: " + j);
        }
        JSONObject jSONObject2 = new JSONObject();
        long zzd = zzd();
        try {
            jSONObject2.put("requestId", zzd);
            jSONObject2.put(TeXSymbolParser.TYPE_ATTR, "QUEUE_UPDATE");
            jSONObject2.put("mediaSessionId", zzn());
            if (i != 0) {
                jSONObject2.put("currentItemId", i);
            }
            if (i2 != 0) {
                jSONObject2.put("jump", i2);
            }
            if (mediaQueueItemArr != null && mediaQueueItemArr.length > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i3 = 0; i3 < mediaQueueItemArr.length; i3++) {
                    jSONArray.put(i3, mediaQueueItemArr[i3].toJson());
                }
                jSONObject2.put("items", jSONArray);
            }
            if (bool != null) {
                jSONObject2.put("shuffle", bool);
            }
            String zza = MediaCommon.zza(num);
            if (zza != null) {
                jSONObject2.put("repeatMode", zza);
            }
            if (j != -1) {
                jSONObject2.put("currentTime", CastUtils.millisecToSec(j));
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (zzZ()) {
                jSONObject2.put("sequenceNumber", this.zzz);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), zzd, null);
        this.zzn.zzb(zzd, new zzam(this, zzasVar));
        return zzd;
    }
}
