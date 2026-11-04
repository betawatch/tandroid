package mi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class m0 {
    public static ArrayList d;
    public final int a;
    public final String b;
    public final List c;

    public m0(int i3, String str, String... strArr) {
        this.a = i3;
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
            arrayList3.add(new m0(R.drawable.iv_h1, bd.M0(2131754030, null), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new m0(R.drawable.iv_h2, bd.M0(2131754029, null), "##", "/h2"));
            d.add(new m0(R.drawable.iv_h3, bd.M0(2131754028, null), "###", "/h3"));
            d.add(new m0(R.drawable.iv_h4, bd.M0(2131754027, null), "####", "/h4"));
            d.add(new m0(R.drawable.iv_h5, bd.M0(2131754026, null), "#####", "/h5"));
            d.add(new m0(R.drawable.iv_h6, bd.M0(2131754025, null), "######", "/h6"));
            d.add(new m0(R.drawable.iv_quote, bd.M0(2131753996, null), "|", "/quote"));
            d.add(new m0(R.drawable.iv_pullquote, bd.M0(2131753997, null), "/pullquote"));
            d.add(new m0(R.drawable.iv_code, bd.M0(2131754055, null), "```", "/code", "/pre", "/preformatted"));
            d.add(new m0(R.drawable.iv_footer, bd.M0(2131754032, null), "/footer"));
            d.add(new m0(R.drawable.iv_list, bd.M0(2131754051, null), "-", "/list"));
            d.add(new m0(R.drawable.iv_ordered_list, bd.M0(2131754048, null), "1."));
            d.add(new m0(R.drawable.iv_todo, bd.M0(2131754004, null), "[]", "/todo", "/checklist"));
            d.add(new m0(R.drawable.iv_details, bd.M0(2131754046, null), ">", "/toggle", "/details"));
            d.add(new m0(R.drawable.iv_button, bd.M0(2131746021, null), "/button"));
            d.add(new m0(R.drawable.iv_table, bd.M0(2131754047, null), "/table"));
            d.add(new m0(R.drawable.iv_math, bd.M0(2131754049, null), "/math", "/latex", "/expression"));
            d.add(new m0(R.drawable.iv_divider, bd.M0(2131754053, null), "---"));
            d.add(new m0(R.drawable.iv_media, bd.M0(2131754052, null), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new m0(R.drawable.iv_media, bd.M0(2131754045, null), "/video", "/vid", "/media"));
            d.add(new m0(R.drawable.iv_audio, bd.M0(2131754054, null), "/audio", "/music", "/media"));
            d.add(new m0(R.drawable.iv_location, bd.M0(2131754050, null), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            m0 m0Var = (m0) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = m0Var.b.toLowerCase().split(" ");
                int length = split.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        Iterator it = m0Var.c.iterator();
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
            arrayList.add(m0Var);
        }
        return arrayList;
    }
}
