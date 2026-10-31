package bi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class p0 {
    public static ArrayList d;
    public final int a;
    public final String b;
    public final List c;

    public p0(int i10, String str, String... strArr) {
        this.a = i10;
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
            arrayList3.add(new p0(R.drawable.iv_h1, cd.L0(2131754030, null), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new p0(R.drawable.iv_h2, cd.L0(2131754029, null), "##", "/h2"));
            d.add(new p0(R.drawable.iv_h3, cd.L0(2131754028, null), "###", "/h3"));
            d.add(new p0(R.drawable.iv_h4, cd.L0(2131754027, null), "####", "/h4"));
            d.add(new p0(R.drawable.iv_h5, cd.L0(2131754026, null), "#####", "/h5"));
            d.add(new p0(R.drawable.iv_h6, cd.L0(2131754025, null), "######", "/h6"));
            d.add(new p0(R.drawable.iv_quote, cd.L0(2131753996, null), "|", "/quote"));
            d.add(new p0(R.drawable.iv_pullquote, cd.L0(2131753997, null), "/pullquote"));
            d.add(new p0(R.drawable.iv_code, cd.L0(2131754055, null), "```", "/code", "/pre", "/preformatted"));
            d.add(new p0(R.drawable.iv_footer, cd.L0(2131754032, null), "/footer"));
            d.add(new p0(R.drawable.iv_list, cd.L0(2131754051, null), "-", "/list"));
            d.add(new p0(R.drawable.iv_ordered_list, cd.L0(2131754048, null), "1."));
            d.add(new p0(R.drawable.iv_todo, cd.L0(2131754004, null), "[]", "/todo", "/checklist"));
            d.add(new p0(R.drawable.iv_details, cd.L0(2131754046, null), ">", "/toggle", "/details"));
            d.add(new p0(R.drawable.iv_button, cd.L0(2131746028, null), "/button"));
            d.add(new p0(R.drawable.iv_table, cd.L0(2131754047, null), "/table"));
            d.add(new p0(R.drawable.iv_math, cd.L0(2131754049, null), "/math", "/latex", "/expression"));
            d.add(new p0(R.drawable.iv_divider, cd.L0(2131754053, null), "---"));
            d.add(new p0(R.drawable.iv_media, cd.L0(2131754052, null), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new p0(R.drawable.iv_media, cd.L0(2131754045, null), "/video", "/vid", "/media"));
            d.add(new p0(R.drawable.iv_audio, cd.L0(2131754054, null), "/audio", "/music", "/media"));
            d.add(new p0(R.drawable.iv_location, cd.L0(2131754050, null), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            p0 p0Var = (p0) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = p0Var.b.toLowerCase().split(" ");
                int length = split.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        Iterator it = p0Var.c.iterator();
                        while (it.hasNext()) {
                            String lowerCase2 = ((String) it.next()).toLowerCase();
                            if (lowerCase2.startsWith("/")) {
                                lowerCase2 = lowerCase2.substring(1);
                            }
                            if (lowerCase2.startsWith(lowerCase)) {
                            }
                        }
                    } else {
                        if (split[i11].startsWith(lowerCase)) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            arrayList.add(p0Var);
        }
        return arrayList;
    }
}
