package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Map;
import oc.d;
import org.webrtc.MediaStreamTrack;
import pc.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzlc implements zzlb {
    private final Context zza;
    private final Map zzb = r.b(new d(2, "activity"), new d(3, "phone"), new d(4, "input_method"), new d(5, MediaStreamTrack.AUDIO_TRACK_KIND));

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
