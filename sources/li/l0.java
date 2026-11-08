package li;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class l0 {
    public static ArrayList d;
    public final int a;
    public final String b;
    public final List c;

    public l0(int i7, String str, String... strArr) {
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
            arrayList3.add(new l0(R.drawable.iv_h1, id.M0(2131754030, null), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new l0(R.drawable.iv_h2, id.M0(2131754029, null), "##", "/h2"));
            d.add(new l0(R.drawable.iv_h3, id.M0(2131754028, null), "###", "/h3"));
            d.add(new l0(R.drawable.iv_h4, id.M0(2131754027, null), "####", "/h4"));
            d.add(new l0(R.drawable.iv_h5, id.M0(2131754026, null), "#####", "/h5"));
            d.add(new l0(R.drawable.iv_h6, id.M0(2131754025, null), "######", "/h6"));
            d.add(new l0(R.drawable.iv_quote, id.M0(2131753996, null), "|", "/quote"));
            d.add(new l0(R.drawable.iv_pullquote, id.M0(2131753997, null), "/pullquote"));
            d.add(new l0(R.drawable.iv_code, id.M0(2131754055, null), "```", "/code", "/pre", "/preformatted"));
            d.add(new l0(R.drawable.iv_footer, id.M0(2131754032, null), "/footer"));
            d.add(new l0(R.drawable.iv_list, id.M0(2131754051, null), "-", "/list"));
            d.add(new l0(R.drawable.iv_ordered_list, id.M0(2131754048, null), "1."));
            d.add(new l0(R.drawable.iv_todo, id.M0(2131754004, null), "[]", "/todo", "/checklist"));
            d.add(new l0(R.drawable.iv_details, id.M0(2131754046, null), ">", "/toggle", "/details"));
            d.add(new l0(R.drawable.iv_button, id.M0(2131746014, null), "/button"));
            d.add(new l0(R.drawable.iv_table, id.M0(2131754047, null), "/table"));
            d.add(new l0(R.drawable.iv_math, id.M0(2131754049, null), "/math", "/latex", "/expression"));
            d.add(new l0(R.drawable.iv_divider, id.M0(2131754053, null), "---"));
            d.add(new l0(R.drawable.iv_media, id.M0(2131754052, null), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new l0(R.drawable.iv_media, id.M0(2131754045, null), "/video", "/vid", "/media"));
            d.add(new l0(R.drawable.iv_audio, id.M0(2131754054, null), "/audio", "/music", "/media"));
            d.add(new l0(R.drawable.iv_location, id.M0(2131754050, null), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            l0 l0Var = (l0) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = l0Var.b.toLowerCase().split(" ");
                int length = split.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        Iterator it = l0Var.c.iterator();
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
            arrayList.add(l0Var);
        }
        return arrayList;
    }
}
