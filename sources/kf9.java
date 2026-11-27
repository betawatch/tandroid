// default package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class kf9 {
    public static ArrayList d;
    public final int a;
    public final String b;
    public final List c;

    public kf9(int i, String str, String... strArr) {
        this.a = i;
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
            arrayList3.add(new kf9(R.drawable.iv_h1, ob6.M0(2131754023, null), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new kf9(R.drawable.iv_h2, ob6.M0(2131754022, null), "##", "/h2"));
            d.add(new kf9(R.drawable.iv_h3, ob6.M0(2131754021, null), "###", "/h3"));
            d.add(new kf9(R.drawable.iv_h4, ob6.M0(2131754020, null), "####", "/h4"));
            d.add(new kf9(R.drawable.iv_h5, ob6.M0(2131754019, null), "#####", "/h5"));
            d.add(new kf9(R.drawable.iv_h6, ob6.M0(2131754018, null), "######", "/h6"));
            d.add(new kf9(R.drawable.iv_quote, ob6.M0(2131753989, null), "|", "/quote"));
            d.add(new kf9(R.drawable.iv_pullquote, ob6.M0(2131753990, null), "/pullquote"));
            d.add(new kf9(R.drawable.iv_code, ob6.M0(2131754048, null), "```", "/code", "/pre", "/preformatted"));
            d.add(new kf9(R.drawable.iv_footer, ob6.M0(2131754025, null), "/footer"));
            d.add(new kf9(R.drawable.iv_list, ob6.M0(2131754044, null), "-", "/list"));
            d.add(new kf9(R.drawable.iv_ordered_list, ob6.M0(2131754041, null), "1."));
            d.add(new kf9(R.drawable.iv_todo, ob6.M0(2131753997, null), "[]", "/todo", "/checklist"));
            d.add(new kf9(R.drawable.iv_details, ob6.M0(2131754039, null), ">", "/toggle", "/details"));
            d.add(new kf9(R.drawable.iv_button, ob6.M0(2131745738, null), "/button"));
            d.add(new kf9(R.drawable.iv_table, ob6.M0(2131754040, null), "/table"));
            d.add(new kf9(R.drawable.iv_math, ob6.M0(2131754042, null), "/math", "/latex", "/expression"));
            d.add(new kf9(R.drawable.iv_divider, ob6.M0(2131754046, null), "---"));
            d.add(new kf9(R.drawable.iv_media, ob6.M0(2131754045, null), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new kf9(R.drawable.iv_media, ob6.M0(2131754038, null), "/video", "/vid", "/media"));
            d.add(new kf9(R.drawable.iv_audio, ob6.M0(2131754047, null), "/audio", "/music", "/media"));
            d.add(new kf9(R.drawable.iv_location, ob6.M0(2131754043, null), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            kf9 kf9Var = (kf9) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = kf9Var.b.toLowerCase().split(" ");
                int length = split.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        Iterator it = kf9Var.c.iterator();
                        while (it.hasNext()) {
                            String lowerCase2 = ((String) it.next()).toLowerCase();
                            if (lowerCase2.startsWith("/")) {
                                lowerCase2 = lowerCase2.substring(1);
                            }
                            if (lowerCase2.startsWith(lowerCase)) {
                            }
                        }
                    } else {
                        if (split[i2].startsWith(lowerCase)) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            arrayList.add(kf9Var);
        }
        return arrayList;
    }
}
