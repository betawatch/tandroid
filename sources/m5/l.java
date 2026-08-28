package m5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import g7.p8;
import j3.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends y5.a {
    public static final j4.c e;
    public final List a;
    public final Bundle b;
    public int c;
    public static final String[] d = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<l> CREATOR = new v(11);

    static {
        j4.c cVar = new j4.c(13);
        cVar.J(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
        cVar.J(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
        cVar.J(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
        cVar.J(1, "com.google.android.gms.cast.metadata.TITLE", "title");
        cVar.J(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
        cVar.J(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
        cVar.J(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
        cVar.J(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
        cVar.J(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
        cVar.J(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
        cVar.J(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
        cVar.J(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", "season");
        cVar.J(2, "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode");
        cVar.J(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
        cVar.J(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
        cVar.J(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
        cVar.J(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
        cVar.J(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
        cVar.J(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
        cVar.J(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
        cVar.J(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
        cVar.J(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
        cVar.J(5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime");
        cVar.J(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
        cVar.J(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
        cVar.J(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
        cVar.J(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
        cVar.J(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
        e = cVar;
    }

    public l(ArrayList arrayList, Bundle bundle, int i9) {
        this.a = arrayList;
        this.b = bundle;
        this.c = i9;
    }

    public static void c(int i9, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        Integer num = (Integer) ((HashMap) e.d).get(str);
        int intValue = num != null ? num.intValue() : 0;
        if (intValue != i9 && intValue != 0) {
            throw new IllegalArgumentException(r0.o("Value for ", str, " must be a ", d[i9]));
        }
    }

    public static boolean f(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !f((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final void b(String str, String str2) {
        c(1, str);
        this.b.putString(str, str2);
    }

    public final JSONObject d() {
        Bundle bundle;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.c);
        } catch (JSONException unused) {
        }
        JSONArray b10 = r5.a.b(this.a);
        if (b10.length() != 0) {
            try {
                jSONObject.put("images", b10);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i9 = this.c;
        if (i9 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i9 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i9 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i9 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i9 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i9 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                bundle = this.b;
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                String str = (String) obj;
                if (str != null && bundle.containsKey(str)) {
                    j4.c cVar = e;
                    String str2 = (String) ((HashMap) cVar.b).get(str);
                    if (str2 != null) {
                        Integer num = (Integer) ((HashMap) cVar.d).get(str);
                        int intValue = num != null ? num.intValue() : 0;
                        if (intValue != 1) {
                            if (intValue == 2) {
                                jSONObject.put(str2, bundle.getInt(str));
                            } else if (intValue == 3) {
                                jSONObject.put(str2, bundle.getDouble(str));
                            } else if (intValue != 4) {
                                if (intValue == 5) {
                                    long j10 = bundle.getLong(str);
                                    Pattern pattern = q5.a.a;
                                    jSONObject.put(str2, j10 / 1000.0d);
                                }
                            }
                        }
                        jSONObject.put(str2, bundle.getString(str));
                    }
                }
            }
            for (String str3 : bundle.keySet()) {
                if (!str3.startsWith("com.google.")) {
                    Object obj2 = bundle.get(str3);
                    if (obj2 instanceof String) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Integer) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Double) {
                        jSONObject.put(str3, obj2);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final void e(JSONObject jSONObject) {
        HashSet hashSet;
        Bundle bundle = this.b;
        bundle.clear();
        List list = this.a;
        list.clear();
        this.c = 0;
        try {
            this.c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            r5.a.c(list, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i9 = this.c;
        if (i9 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i9 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i9 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i9 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i9 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i9 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet2 = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    j4.c cVar = e;
                    String str = (String) ((HashMap) cVar.c).get(next);
                    if (str == null) {
                        hashSet = hashSet2;
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            bundle.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet2.contains(str)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                Integer num = (Integer) ((HashMap) cVar.d).get(str);
                                int intValue = num != null ? num.intValue() : 0;
                                if (intValue == 1) {
                                    hashSet = hashSet2;
                                    if (obj2 instanceof String) {
                                        bundle.putString(str, (String) obj2);
                                    }
                                } else if (intValue == 2) {
                                    hashSet = hashSet2;
                                    if (obj2 instanceof Integer) {
                                        bundle.putInt(str, ((Integer) obj2).intValue());
                                    }
                                } else if (intValue == 3) {
                                    hashSet = hashSet2;
                                    double optDouble = jSONObject.optDouble(next);
                                    if (!Double.isNaN(optDouble)) {
                                        bundle.putDouble(str, optDouble);
                                    }
                                } else if (intValue == 4) {
                                    hashSet = hashSet2;
                                    if (obj2 instanceof String) {
                                        String str2 = (String) obj2;
                                        if (r5.a.a(str2) != null) {
                                            bundle.putString(str, str2);
                                        }
                                    }
                                } else if (intValue == 5) {
                                    long optLong = jSONObject.optLong(next);
                                    Pattern pattern = q5.a.a;
                                    hashSet = hashSet2;
                                    try {
                                        bundle.putLong(str, optLong * 1000);
                                    } catch (JSONException unused2) {
                                    }
                                }
                            }
                        } catch (JSONException unused3) {
                            hashSet = hashSet2;
                        }
                    }
                    hashSet2 = hashSet;
                }
            }
        } catch (JSONException unused4) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return f(this.b, lVar.b) && this.a.equals(lVar.a);
    }

    public final int hashCode() {
        int i9 = 17;
        Bundle bundle = this.b;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                i9 = (i9 * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.a.hashCode() + (i9 * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.p(parcel, 2, this.a);
        p8.b(parcel, 3, this.b);
        int i10 = this.c;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i10);
        p8.r(parcel, q10);
    }

    public l(int i9) {
        this(new ArrayList(), new Bundle(), i9);
    }
}
