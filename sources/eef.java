// default package

import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class eef {
    public static final String[] a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    public static final HashMap b = new HashMap(10);

    static {
        int i = 0;
        while (true) {
            String[] strArr = a;
            if (i >= 10) {
                return;
            }
            b.put(strArr[i], Integer.valueOf(i));
            i++;
        }
    }
}
