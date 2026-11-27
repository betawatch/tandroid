// default package

import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
