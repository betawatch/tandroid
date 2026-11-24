// default package

import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class n9f {
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
