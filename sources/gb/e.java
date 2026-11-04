package gb;

import b8.ib;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import wd.z;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends hd.j implements od.p {
    public int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ae.d d;
    public final /* synthetic */ c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Map map, ae.d dVar, c cVar, fd.c cVar2) {
        super(2, cVar2);
        this.b = fVar;
        this.c = map;
        this.d = dVar;
        this.e = cVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        return new e(this.b, this.c, this.d, this.e, cVar);
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.a;
        int i3 = this.a;
        dd.k kVar = dd.k.a;
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
        if (i3 == 0) {
            ib.b(obj);
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
                ae.d dVar = this.d;
                this.a = 1;
                if (dVar.invoke(jSONObject, this) == aVar) {
                    return aVar;
                }
            } else {
                this.a = 2;
                cVar.invoke("Bad response code: " + responseCode, this);
                if (kVar == aVar) {
                    return aVar;
                }
            }
        } else if (i3 == 1 || i3 == 2) {
            ib.b(obj);
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.b(obj);
        }
        return kVar;
    }
}
