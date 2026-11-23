package oi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class k0 {
    public static ArrayList d;
    public final int a;
    public final String b;
    public final List c;

    public k0(int i7, String str, String... strArr) {
        this.a = i7;
        this.b = str;
        this.c = Arrays.asList(strArr);
    }

    public static ArrayList a(String str) {
        String trim = str == null ? "" : str.trim();
        if (trim.startsWith("/")) {
            trim = trim.substring(1);
        }
        String lowerCase = trim.toLowerCase();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = d;
        if (arrayList2 == null) {
            ArrayList arrayList3 = new ArrayList();
            d = arrayList3;
            arrayList3.add(new k0(R.drawable.iv_h1, gd.N0(2131754027, null), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new k0(R.drawable.iv_h2, gd.N0(2131754026, null), "##", "/h2"));
            d.add(new k0(R.drawable.iv_h3, gd.N0(2131754025, null), "###", "/h3"));
            d.add(new k0(R.drawable.iv_h4, gd.N0(2131754024, null), "####", "/h4"));
            d.add(new k0(R.drawable.iv_h5, gd.N0(2131754023, null), "#####", "/h5"));
            d.add(new k0(R.drawable.iv_h6, gd.N0(2131754022, null), "######", "/h6"));
            d.add(new k0(R.drawable.iv_quote, gd.N0(2131753993, null), "|", "/quote"));
            d.add(new k0(R.drawable.iv_pullquote, gd.N0(2131753994, null), "/pullquote"));
            d.add(new k0(R.drawable.iv_code, gd.N0(2131754052, null), "```", "/code", "/pre", "/preformatted"));
            d.add(new k0(R.drawable.iv_footer, gd.N0(2131754029, null), "/footer"));
            d.add(new k0(R.drawable.iv_list, gd.N0(2131754048, null), "-", "/list"));
            d.add(new k0(R.drawable.iv_ordered_list, gd.N0(2131754045, null), "1."));
            d.add(new k0(R.drawable.iv_todo, gd.N0(2131754001, null), "[]", "/todo", "/checklist"));
            d.add(new k0(R.drawable.iv_details, gd.N0(2131754043, null), ">", "/toggle", "/details"));
            d.add(new k0(R.drawable.iv_button, gd.N0(2131745815, null), "/button"));
            d.add(new k0(R.drawable.iv_table, gd.N0(2131754044, null), "/table"));
            d.add(new k0(R.drawable.iv_math, gd.N0(2131754046, null), "/math", "/latex", "/expression"));
            d.add(new k0(R.drawable.iv_divider, gd.N0(2131754050, null), "---"));
            d.add(new k0(R.drawable.iv_media, gd.N0(2131754049, null), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new k0(R.drawable.iv_media, gd.N0(2131754042, null), "/video", "/vid", "/media"));
            d.add(new k0(R.drawable.iv_audio, gd.N0(2131754051, null), "/audio", "/music", "/media"));
            d.add(new k0(R.drawable.iv_location, gd.N0(2131754047, null), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            k0 k0Var = (k0) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = k0Var.b.toLowerCase().split(" ");
                int length = split.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        Iterator it = k0Var.c.iterator();
                        while (it.hasNext()) {
                            String lowerCase2 = ((String) it.next()).toLowerCase();
                            if (lowerCase2.startsWith("/")) {
                                lowerCase2 = lowerCase2.substring(1);
                            }
                            if (lowerCase2.startsWith(lowerCase)) {
                            }
                        }
                    } else {
                        if (split[i10].startsWith(lowerCase)) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            arrayList.add(k0Var);
        }
        return arrayList;
    }
}
