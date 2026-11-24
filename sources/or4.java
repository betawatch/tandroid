// default package

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class or4 extends LinkedHashMap {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or4(int i, float f, boolean z, byte b2) {
        super(i, f, z);
        this.a = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Matcher b(Pattern pattern, String str) {
        Matcher matcher = (Matcher) get(pattern);
        if (matcher != null) {
            matcher.reset(str);
            return matcher;
        }
        Matcher matcher2 = pattern.matcher(str);
        put(pattern, matcher2);
        return matcher2;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.a) {
            case 0:
                if (size() > 4) {
                }
                break;
            case 1:
                if (size() > 32) {
                }
                break;
            case 2:
                if (size() > 512) {
                }
                break;
            default:
                if (size() > 8192) {
                }
                break;
        }
        return false;
    }
}
