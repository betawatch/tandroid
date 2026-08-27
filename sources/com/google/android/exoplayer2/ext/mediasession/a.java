package com.google.android.exoplayer2.ext.mediasession;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import d5.g0;
import java.util.Set;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static boolean a(MediaSessionConnector.MediaMetadataProvider mediaMetadataProvider, MediaMetadataCompat mediaMetadataCompat, MediaMetadataCompat mediaMetadataCompat2) {
        if (mediaMetadataCompat == mediaMetadataCompat2) {
            return true;
        }
        Bundle bundle = mediaMetadataCompat.a;
        Bundle bundle2 = mediaMetadataCompat.a;
        if (bundle.size() != mediaMetadataCompat2.a.size()) {
            return false;
        }
        Set<String> keySet = bundle2.keySet();
        Bundle bundle3 = new Bundle(bundle2);
        Bundle bundle4 = new Bundle(mediaMetadataCompat2.a);
        for (String str : keySet) {
            Object obj = bundle3.get(str);
            Object obj2 = bundle4.get(str);
            if (obj != obj2) {
                if ((obj instanceof Bitmap) && (obj2 instanceof Bitmap)) {
                    if (!((Bitmap) obj).sameAs((Bitmap) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof RatingCompat) && (obj2 instanceof RatingCompat)) {
                    RatingCompat ratingCompat = (RatingCompat) obj;
                    RatingCompat ratingCompat2 = (RatingCompat) obj2;
                    if (ratingCompat.c() != ratingCompat2.c() || ratingCompat.d() != ratingCompat2.d() || ratingCompat.e() != ratingCompat2.e() || ratingCompat.a() != ratingCompat2.a() || ratingCompat.b() != ratingCompat2.b() || ratingCompat.a != ratingCompat2.a) {
                        return false;
                    }
                } else if (!g0.a(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
