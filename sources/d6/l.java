package d6;

import a8.df;
import a8.h0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class l extends p6.a {
    public static final h0 e;
    public final List a;
    public final Bundle b;
    public int c;
    public static final String[] d = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<l> CREATOR = new v(11);

    static {
        h0 h0Var = new h0(14);
        h0Var.v(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
        h0Var.v(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
        h0Var.v(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
        h0Var.v(1, "com.google.android.gms.cast.metadata.TITLE", "title");
        h0Var.v(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
        h0Var.v(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
        h0Var.v(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
        h0Var.v(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
        h0Var.v(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
        h0Var.v(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
        h0Var.v(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
        h0Var.v(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", "season");
        h0Var.v(2, "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode");
        h0Var.v(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
        h0Var.v(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
        h0Var.v(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
        h0Var.v(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
        h0Var.v(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
        h0Var.v(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
        h0Var.v(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
        h0Var.v(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
        h0Var.v(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
        h0Var.v(5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime");
        h0Var.v(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
        h0Var.v(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
        h0Var.v(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
        h0Var.v(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
        h0Var.v(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
        e = h0Var;
    }

    public l(ArrayList arrayList, Bundle bundle, int i10) {
        this.a = arrayList;
        this.b = bundle;
        this.c = i10;
    }

    public static void c(int i10, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        Integer num = (Integer) ((HashMap) e.d).get(str);
        int intValue = num != null ? num.intValue() : 0;
        if (intValue != i10 && intValue != 0) {
            throw new IllegalArgumentException(c3.h0.m("Value for ", str, " must be a ", d[i10]));
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
        JSONArray b10 = i6.a.b(this.a);
        if (b10.length() != 0) {
            try {
                jSONObject.put("images", b10);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i10 = this.c;
        if (i10 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i10 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i10 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i10 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i10 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i10 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                bundle = this.b;
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList.get(i11);
                i11++;
                String str = (String) obj;
                if (str != null && bundle.containsKey(str)) {
                    h0 h0Var = e;
                    String str2 = (String) ((HashMap) h0Var.b).get(str);
                    if (str2 != null) {
                        Integer num = (Integer) ((HashMap) h0Var.d).get(str);
                        int intValue = num != null ? num.intValue() : 0;
                        if (intValue != 1) {
                            if (intValue == 2) {
                                jSONObject.put(str2, bundle.getInt(str));
                            } else if (intValue == 3) {
                                jSONObject.put(str2, bundle.getDouble(str));
                            } else if (intValue != 4) {
                                if (intValue == 5) {
                                    long j10 = bundle.getLong(str);
                                    Pattern pattern = h6.a.a;
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
        int i10 = 0;
        this.c = 0;
        try {
            this.c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            i6.a.c(list, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i11 = this.c;
        if (i11 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i11 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i11 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i11 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i11 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i11 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet2 = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    h0 h0Var = e;
                    String str = (String) ((HashMap) h0Var.c).get(next);
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
                                Integer num = (Integer) ((HashMap) h0Var.d).get(str);
                                int intValue = num != null ? num.intValue() : i10;
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
                                        if (i6.a.a(str2) != null) {
                                            bundle.putString(str, str2);
                                        }
                                    }
                                } else if (intValue == 5) {
                                    long optLong = jSONObject.optLong(next);
                                    Pattern pattern = h6.a.a;
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
                    i10 = 0;
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
        int i10 = 17;
        Bundle bundle = this.b;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                i10 = (i10 * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.a.hashCode() + (i10 * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.p(parcel, 2, this.a);
        df.b(parcel, 3, this.b);
        int i11 = this.c;
        df.s(parcel, 4, 4);
        parcel.writeInt(i11);
        df.r(parcel, q5);
    }

    public l(int i10) {
        this(new ArrayList(), new Bundle(), i10);
    }
}
