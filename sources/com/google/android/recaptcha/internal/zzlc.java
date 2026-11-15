package com.google.android.recaptcha.internal;

import android.content.Context;
import gd.e;
import hd.r;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class zzlc implements zzlb {
    private final Context zza;
    private final Map zzb = r.d(new e(2, "activity"), new e(3, "phone"), new e(4, "input_method"), new e(5, MediaStreamTrack.AUDIO_TRACK_KIND));

    public zzlc(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzlb
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzla.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzlb
    public final Object zza(Object... objArr) {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            throw new zzdm(4, 5, null);
        }
        Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zza.getSystemService((String) obj2);
        }
        throw new zzdm(4, 4, null);
    }
}
