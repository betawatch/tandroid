package com.microsoft.appcenter.ingestion.models.properties;

import com.microsoft.appcenter.ingestion.models.Model;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* loaded from: classes3.dex */
public abstract class TypedProperty implements Model {
    private String name;

    public abstract String getType();

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // com.microsoft.appcenter.ingestion.models.Model
    public void read(JSONObject jSONObject) {
        if (!jSONObject.getString(TeXSymbolParser.TYPE_ATTR).equals(getType())) {
            throw new JSONException("Invalid type");
        }
        setName(jSONObject.getString("name"));
    }

    @Override // com.microsoft.appcenter.ingestion.models.Model
    public void write(JSONStringer jSONStringer) {
        jSONStringer.key(TeXSymbolParser.TYPE_ATTR).value(getType());
        jSONStringer.key("name").value(getName());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.name;
            String str2 = ((TypedProperty) obj).name;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
