// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mt6 extends c4 {
    public static final ko9 e;
    public final ArrayList a;
    public final Bundle b;
    public int c;
    public static final String[] d = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<mt6> CREATOR = new zkd(11);

    static {
        ko9 ko9Var = new ko9((byte) 27);
        ko9Var.A(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
        ko9Var.A(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
        ko9Var.A(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
        ko9Var.A(1, "com.google.android.gms.cast.metadata.TITLE", "title");
        ko9Var.A(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
        ko9Var.A(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
        ko9Var.A(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
        ko9Var.A(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
        ko9Var.A(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
        ko9Var.A(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
        ko9Var.A(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
        ko9Var.A(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", "season");
        ko9Var.A(2, "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode");
        ko9Var.A(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
        ko9Var.A(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
        ko9Var.A(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
        ko9Var.A(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
        ko9Var.A(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
        ko9Var.A(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
        ko9Var.A(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
        ko9Var.A(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
        ko9Var.A(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
        ko9Var.A(5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime");
        ko9Var.A(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
        ko9Var.A(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
        ko9Var.A(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
        ko9Var.A(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
        ko9Var.A(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
        e = ko9Var;
    }

    public mt6(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    public static void c(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            lq5.j("null and empty keys are not allowed");
            return;
        }
        Integer num = (Integer) ((HashMap) e.d).get(str);
        int intValue = num != null ? num.intValue() : 0;
        if (intValue == i || intValue == 0) {
            return;
        }
        lq5.j(qd4.q("Value for ", str, " must be a ", d[i]));
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
        JSONArray b = u9d.b(this.a);
        if (b.length() != 0) {
            try {
                jSONObject.put("images", b);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i = this.c;
        if (i == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                bundle = this.b;
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                String str = (String) obj;
                if (str != null && bundle.containsKey(str)) {
                    ko9 ko9Var = e;
                    String str2 = (String) ((HashMap) ko9Var.b).get(str);
                    if (str2 != null) {
                        Integer num = (Integer) ((HashMap) ko9Var.d).get(str);
                        int intValue = num != null ? num.intValue() : 0;
                        if (intValue != 1) {
                            if (intValue == 2) {
                                jSONObject.put(str2, bundle.getInt(str));
                            } else if (intValue == 3) {
                                jSONObject.put(str2, bundle.getDouble(str));
                            } else if (intValue != 4) {
                                if (intValue == 5) {
                                    long j = bundle.getLong(str);
                                    Pattern pattern = qd1.a;
                                    jSONObject.put(str2, j / 1000.0d);
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
        Bundle bundle = this.b;
        bundle.clear();
        ArrayList arrayList = this.a;
        arrayList.clear();
        this.c = 0;
        try {
            this.c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            u9d.c(arrayList, optJSONArray);
        }
        ArrayList arrayList2 = new ArrayList();
        int i = this.c;
        if (i == 0) {
            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 1) {
            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 2) {
            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i == 3) {
            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i == 4) {
            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i == 5) {
            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList2);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    ko9 ko9Var = e;
                    String str = (String) ((HashMap) ko9Var.c).get(next);
                    if (str == null) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            bundle.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(str)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                Integer num = (Integer) ((HashMap) ko9Var.d).get(str);
                                int intValue = num != null ? num.intValue() : 0;
                                if (intValue != 1) {
                                    if (intValue != 2) {
                                        if (intValue == 3) {
                                            double optDouble = jSONObject.optDouble(next);
                                            if (!Double.isNaN(optDouble)) {
                                                bundle.putDouble(str, optDouble);
                                            }
                                        } else if (intValue != 4) {
                                            if (intValue == 5) {
                                                long optLong = jSONObject.optLong(next);
                                                Pattern pattern = qd1.a;
                                                bundle.putLong(str, optLong * 1000);
                                            }
                                        } else if (obj2 instanceof String) {
                                            String str2 = (String) obj2;
                                            if (u9d.a(str2) != null) {
                                                bundle.putString(str, str2);
                                            }
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        bundle.putInt(str, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    bundle.putString(str, (String) obj2);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt6)) {
            return false;
        }
        mt6 mt6Var = (mt6) obj;
        return f(this.b, mt6Var.b) && this.a.equals(mt6Var.a);
    }

    public final int hashCode() {
        int i = 17;
        Bundle bundle = this.b;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                i = (i * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.a.hashCode() + (i * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.p(parcel, 2, this.a);
        bye.b(parcel, 3, this.b);
        int i2 = this.c;
        bye.q(parcel, 4, 4);
        parcel.writeInt(i2);
        bye.s(parcel, r);
    }

    public mt6(ArrayList arrayList, Bundle bundle, int i) {
        this.a = arrayList;
        this.b = bundle;
        this.c = i;
    }
}
