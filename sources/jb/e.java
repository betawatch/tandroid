package jb;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import zd.z;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class e extends kd.j implements rd.p {
    public int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ be.l d;
    public final /* synthetic */ c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Map map, be.l lVar, c cVar, id.c cVar2) {
        super(2, cVar2);
        this.b = fVar;
        this.c = map;
        this.d = lVar;
        this.e = cVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        return new e(this.b, this.c, this.d, this.e, cVar);
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i7 = this.a;
        gd.k kVar = gd.k.a;
        c cVar = this.e;
        try {
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = e10.toString();
            }
            this.a = 3;
            cVar.invoke(message, this);
            if (kVar == aVar) {
            }
        }
        if (i7 == 0) {
            af.b.c(obj);
            URLConnection openConnection = f.a(this.b).openConnection();
            kotlin.jvm.internal.j.c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry entry : this.c.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb2.toString());
                be.l lVar = this.d;
                this.a = 1;
                if (lVar.invoke(jSONObject, this) == aVar) {
                    return aVar;
                }
            } else {
                this.a = 2;
                cVar.invoke("Bad response code: " + responseCode, this);
                if (kVar == aVar) {
                    return aVar;
                }
            }
        } else if (i7 == 1 || i7 == 2) {
            af.b.c(obj);
        } else {
            if (i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            af.b.c(obj);
        }
        return kVar;
    }
}
