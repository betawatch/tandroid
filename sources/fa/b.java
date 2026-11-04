package fa;

import android.util.JsonReader;
import android.util.Log;
import ca.k0;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$-CC;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.q00;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ks;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i3) {
        this.a = i3;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i3 = this.a;
        return Function$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        long j10;
        int[] array;
        switch (this.a) {
            case 0:
                File file = (File) obj;
                try {
                    da.a aVar = d.g;
                    String f10 = d.f(file);
                    aVar.getClass();
                    try {
                        JsonReader jsonReader = new JsonReader(new StringReader(f10));
                        try {
                            k0 h = da.a.h(jsonReader);
                            jsonReader.close();
                            return Optional.of(h);
                        } catch (Throwable th2) {
                            try {
                                jsonReader.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (IllegalStateException e10) {
                        throw new IOException(e10);
                    }
                } catch (IOException e11) {
                    Log.w("FirebaseCrashlytics", "Unable to read the Profiling Manager file ", e11);
                    return Optional.empty();
                }
            case 1:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 2:
                String str = (String) obj;
                Pattern pattern = Utilities.a;
                try {
                    j10 = Long.parseLong(str);
                } catch (Exception unused) {
                    j10 = 0;
                }
                return Long.valueOf(j10);
            case 3:
                array = DesugarArrays.stream(((String) obj).split(",")).mapToInt(new cg.d(12)).toArray();
                return array;
            case 4:
                return String.valueOf((Long) obj);
            case 5:
                return hp.a((int[]) obj);
            case 6:
                return ((q00) obj).b;
            case 7:
                return Long.valueOf(m5.o((TLRPC.Peer) obj));
            case 8:
                return Long.valueOf(((zi) obj).Z0());
            case 9:
                return Integer.valueOf(((zi) obj).f1());
            case 10:
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj;
                if (channelParticipant == null) {
                    return null;
                }
                return channelParticipant.banned_rights;
            case 11:
                return Long.valueOf(m5.o(((TLRPC.GroupCallParticipant) obj).peer));
            case 12:
                return Long.valueOf(m5.o(((TLRPC.GroupCallParticipant) obj).peer));
            case 13:
                return ((ks) obj).a;
            case 14:
                return ((ks) obj).a;
            default:
                String name = ((File) obj).getName();
                name.getClass();
                if (name.equals("trigger-type-anomaly")) {
                    return 8;
                }
                return !name.equals("trigger-type-oom") ? 0 : 7;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i3 = this.a;
        return Function$-CC.$default$compose(this, function);
    }
}
